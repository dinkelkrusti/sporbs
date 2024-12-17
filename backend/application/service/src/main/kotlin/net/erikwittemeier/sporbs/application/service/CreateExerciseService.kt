package net.erikwittemeier.sporbs.application.service

import net.erikwittemeier.sporbs.application.port.`in`.CreateExerciseUseCase
import net.erikwittemeier.sporbs.application.port.out.LoadExercisePort
import net.erikwittemeier.sporbs.application.port.out.PersistExercisePort
import net.erikwittemeier.sporbs.domain.exercise.Exercise
import org.springframework.stereotype.Service

@Service
class CreateExerciseService(
    private val persistence: PersistExercisePort,
    private val exercises: LoadExercisePort,
) : CreateExerciseUseCase {
    override fun fromInput(input: CreateExerciseUseCase.Input) {
        if (exercises.byName(input.name) != null) return

        val exercise = Exercise.create(name = input.name, description = input.description)
        persistence.save(exercise)
    }
}
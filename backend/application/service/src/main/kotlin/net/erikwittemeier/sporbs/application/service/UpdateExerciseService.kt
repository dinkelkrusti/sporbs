package net.erikwittemeier.sporbs.application.service

import net.erikwittemeier.sporbs.application.port.`in`.UpdateExerciseUseCase
import net.erikwittemeier.sporbs.application.port.out.LoadExercisePort
import net.erikwittemeier.sporbs.application.port.out.PersistExercisePort
import org.springframework.stereotype.Service

@Service
class UpdateExerciseService(
    private val exercises: LoadExercisePort,
    private val persistence: PersistExercisePort,
) : UpdateExerciseUseCase {
    override fun withInput(input: UpdateExerciseUseCase.Input) {
        exercises.byId(input.id)?.let { persistence.save(it) }
    }
}
package net.erikwittemeier.sporbs.adapter.persistence

import net.erikwittemeier.sporbs.application.port.out.LoadExercisePort
import net.erikwittemeier.sporbs.domain.exercise.Exercise
import org.springframework.stereotype.Component
import java.util.UUID
import kotlin.jvm.optionals.getOrNull

@Component
class LoadExerciseAdapter(private val dao: ExerciseDao) : LoadExercisePort {
    override fun byId(exerciseId: UUID): Exercise? {
        return dao.findById(exerciseId).getOrNull()?.toDomain()
    }

    override fun byName(exerciseName: String): Exercise? {
        return dao.findByName(exerciseName)?.toDomain()
    }

    override fun all(): List<Exercise> {
        return dao.findAll().map { it.toDomain() }
    }
}
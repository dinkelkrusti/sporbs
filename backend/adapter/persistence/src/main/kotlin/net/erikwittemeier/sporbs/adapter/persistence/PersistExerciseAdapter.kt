package net.erikwittemeier.sporbs.adapter.persistence

import net.erikwittemeier.sporbs.application.port.out.PersistExercisePort
import net.erikwittemeier.sporbs.domain.exercise.Exercise
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class PersistExerciseAdapter(private val dao: ExerciseDao) : PersistExercisePort {
    override fun save(exercise: Exercise) {
        dao.save(exercise.toEntity())
    }

    override fun deleteById(id: UUID) {
        dao.deleteById(id)
    }
}
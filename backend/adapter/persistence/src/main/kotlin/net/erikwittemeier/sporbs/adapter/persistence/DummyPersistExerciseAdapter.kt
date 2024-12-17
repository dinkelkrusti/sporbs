package net.erikwittemeier.sporbs.adapter.persistence

import net.erikwittemeier.sporbs.application.port.out.PersistExercisePort
import net.erikwittemeier.sporbs.domain.exercise.Exercise
import org.springframework.stereotype.Component
import java.util.*

@Component
class DummyPersistExerciseAdapter : PersistExercisePort {
    override fun save(exercise: Exercise) {
        println("Persisting exercise")
    }

    override fun update(exercise: Exercise) {
        println("Persisting exercise")
    }

    override fun deleteById(id: UUID) {
        println("Persisting exercise")
    }
}
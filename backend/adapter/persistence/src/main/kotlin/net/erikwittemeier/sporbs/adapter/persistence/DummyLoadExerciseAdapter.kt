package net.erikwittemeier.sporbs.adapter.persistence

import net.erikwittemeier.sporbs.application.port.out.LoadExercisePort
import net.erikwittemeier.sporbs.domain.exercise.Exercise
import org.springframework.stereotype.Component
import java.util.UUID

@Component
class DummyLoadExerciseAdapter : LoadExercisePort {
    override fun byId(exerciseId: UUID): Exercise? {
        return null
    }

    override fun byName(exerciseName: String): Exercise? {
        return null
    }

    override fun all(): List<Exercise> {
        return emptyList()
    }
}
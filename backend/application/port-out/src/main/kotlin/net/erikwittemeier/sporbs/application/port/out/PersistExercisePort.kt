package net.erikwittemeier.sporbs.application.port.out

import net.erikwittemeier.sporbs.domain.exercise.Exercise
import java.util.UUID

interface PersistExercisePort {
    fun save(exercise: Exercise)
    fun deleteById(id: UUID)
}
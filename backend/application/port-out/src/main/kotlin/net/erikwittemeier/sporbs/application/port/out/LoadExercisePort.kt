package net.erikwittemeier.sporbs.application.port.out

import net.erikwittemeier.sporbs.domain.exercise.Exercise
import java.util.*

interface LoadExercisePort {
    fun byId(exerciseId: UUID): Exercise?
    fun byName(exerciseName: String): Exercise?
    fun all(): List<Exercise>
}
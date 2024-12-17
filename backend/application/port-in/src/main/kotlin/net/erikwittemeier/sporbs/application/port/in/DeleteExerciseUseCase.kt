package net.erikwittemeier.sporbs.application.port.`in`

import java.util.UUID

interface DeleteExerciseUseCase {
    fun byId(id: UUID)
}
package net.erikwittemeier.sporbs.application.port.`in`

import java.util.UUID

interface UpdateExerciseUseCase {
    fun withInput(input: Input)

    data class Input(val id: UUID, val name: String, val description: String)
}
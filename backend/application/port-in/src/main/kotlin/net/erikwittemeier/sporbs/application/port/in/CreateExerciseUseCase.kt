package net.erikwittemeier.sporbs.application.port.`in`

interface CreateExerciseUseCase {
    fun fromInput(input: Input)

    data class Input(
        val name: String,
        val description: String
    )
}
package net.erikwittemeier.sporbs.domain.exercise

import java.util.UUID

data class Exercise(
    val id: UUID,
    var name: String,
    var description: String
) {
    companion object {
        fun create(name: String, description: String): Exercise {
            return Exercise(
                id = UUID.randomUUID(),
                name = name,
                description = description
            )
        }
    }
}
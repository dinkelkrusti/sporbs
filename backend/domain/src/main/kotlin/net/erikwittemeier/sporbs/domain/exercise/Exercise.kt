package net.erikwittemeier.sporbs.domain.exercise

import java.util.UUID

class Exercise(
    val id: UUID,
    var name: String,
    var description: String
)
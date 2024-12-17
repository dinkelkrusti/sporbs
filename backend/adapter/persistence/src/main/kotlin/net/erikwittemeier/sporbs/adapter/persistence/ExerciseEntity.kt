package net.erikwittemeier.sporbs.adapter.persistence

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID
@Entity
data class ExerciseEntity(
    @Id val id : UUID = UUID.randomUUID(),
    var name: String = "",
    var description: String = "",
)
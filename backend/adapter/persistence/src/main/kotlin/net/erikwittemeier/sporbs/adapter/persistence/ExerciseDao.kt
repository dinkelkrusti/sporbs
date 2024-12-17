package net.erikwittemeier.sporbs.adapter.persistence

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ExerciseDao : JpaRepository<ExerciseEntity, UUID> {
    fun findByName(name: String) : ExerciseEntity?
}
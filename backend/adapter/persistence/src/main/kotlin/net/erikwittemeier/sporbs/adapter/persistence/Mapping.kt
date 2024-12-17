package net.erikwittemeier.sporbs.adapter.persistence

import net.erikwittemeier.sporbs.domain.exercise.Exercise

fun ExerciseEntity.toDomain() = Exercise(
    id = id,
    name = name,
    description = description,
)

fun Exercise.toEntity() = ExerciseEntity(
    id = id,
    name = name,
    description = description,
)

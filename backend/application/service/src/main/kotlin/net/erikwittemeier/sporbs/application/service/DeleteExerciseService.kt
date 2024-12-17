package net.erikwittemeier.sporbs.application.service

import net.erikwittemeier.sporbs.application.port.`in`.DeleteExerciseUseCase
import net.erikwittemeier.sporbs.application.port.out.PersistExercisePort
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class DeleteExerciseService(
    private val persistence: PersistExercisePort,
) : DeleteExerciseUseCase {
    override fun byId(id: UUID) {
        persistence.deleteById(id)
    }
}
package net.erikwittemeier.sporbs.adapter.persistence

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories(basePackages = ["net.erikwittemeier.sporbs.adapter.persistence"])
@EntityScan(basePackages = ["net.erikwittemeier.sporbs.adapter.persistence"])
open class PersistenceConfiguration
package com.kotlin.simplebankapp.global.config

import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.persistence.EntityManager

@Configuration
class QuerydslConfig(
        private val em: EntityManager,
) {
    @Bean
    fun JPAQueryFactory() = JPAQueryFactory(em)
}

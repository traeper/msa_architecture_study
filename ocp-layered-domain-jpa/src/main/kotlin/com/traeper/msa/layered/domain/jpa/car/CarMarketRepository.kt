package com.traeper.msa.layered.domain.jpa.car

import org.springframework.data.jpa.repository.JpaRepository

interface CarMarketRepository : JpaRepository<CarEntity, Long> {
}
package com.traeper.msa.layered.api.application

import com.traeper.msa.layered.api.application.model.CarResponse
import com.traeper.msa.layered.domain.car.CarEntity
import com.traeper.msa.layered.domain.car.CarMarketRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class CarMarketService(
    private val carMarketRepository: CarMarketRepository,
) {
    fun getCar(carId: Long): CarResponse =
        carMarketRepository.findByIdOrNull(carId)!!
            .toCarResponse()
}

private fun CarEntity.toCarResponse(): CarResponse =
    CarResponse(this.corpName, this.modelName)

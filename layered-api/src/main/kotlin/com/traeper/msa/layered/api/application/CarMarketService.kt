package com.traeper.msa.layered.api.application

import com.traeper.msa.layered.api.application.model.CarResponse
import com.traeper.msa.layered.domain.jpa.car.port.CarDomainService
import com.traeper.msa.layered.domain.jpa.car.port.model.Car
import org.springframework.stereotype.Service

@Service
class CarMarketService(
    private val carDomainService: CarDomainService,
) {
    fun getCar(carId: Long): CarResponse =
        carDomainService.getCar(carId)
            .toCarResponse()
}

private fun Car.toCarResponse(): CarResponse =
    CarResponse(this.corpName, this.modelName)

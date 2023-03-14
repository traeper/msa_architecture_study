package com.traeper.msa.layered.api.domain.port.car

import com.traeper.msa.layered.api.domain.port.car.model.Car

interface CarDomainService {
    fun getCar(carId: Long): Car
}
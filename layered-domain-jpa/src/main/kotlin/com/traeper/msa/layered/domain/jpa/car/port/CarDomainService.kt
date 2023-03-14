package com.traeper.msa.layered.domain.jpa.car.port

import com.traeper.msa.layered.domain.jpa.car.port.model.Car

interface CarDomainService {
    fun getCar(carId: Long): Car
}
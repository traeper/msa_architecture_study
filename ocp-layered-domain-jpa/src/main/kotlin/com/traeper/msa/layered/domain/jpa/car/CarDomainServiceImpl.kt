package com.traeper.msa.layered.domain.jpa.car

import com.traeper.msa.layered.api.domain.port.car.CarDomainService
import com.traeper.msa.layered.api.domain.port.car.model.Car
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class CarDomainServiceImpl(
    val repository: CarMarketRepository,
) : CarDomainService {
    override fun getCar(carId: Long): Car =
        repository.findByIdOrNull(carId)!!.toCar()
}

private fun CarEntity.toCar(): Car =
    Car(
        corpName = this.corpName,
        modelName = this.modelName,
    )

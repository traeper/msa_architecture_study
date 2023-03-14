package com.traeper.msa.layered.api.application

import com.traeper.msa.layered.api.application.model.CarResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/cars")
@RestController
class CarMarketController(
    private val carMarketService: CarMarketService,
) {

    @GetMapping("{carId}")
    fun getCar(@PathVariable carId: Long): CarResponse =
        carMarketService.getCar(carId)
}
package com.traeper.msa.layered

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LayeredApiApplication

fun main(args: Array<String>) {
    runApplication<LayeredApiApplication>(*args)
}
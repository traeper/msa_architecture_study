package com.traeper.msa.layered

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OcpLayeredApiApplication

fun main(args: Array<String>) {
    runApplication<OcpLayeredApiApplication>(*args)
}
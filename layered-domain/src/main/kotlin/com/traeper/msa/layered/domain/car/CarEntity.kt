package com.traeper.msa.layered.domain.car

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var carId: Long = 0L

    @Column(nullable = false)
    lateinit var corpName: String
        protected set

    @Column(nullable = false)
    lateinit var modelName: String
        protected set

    companion object {
        fun of(
            corpName: String,
            modelName: String,
        ): CarEntity = CarEntity().apply {
            this.corpName = corpName
            this.modelName = modelName
        }
    }
}
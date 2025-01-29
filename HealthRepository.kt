package com.healthapp.data

import com.healthapp.model.HealthData

class HealthRepository {

    // For demonstration, let's use a hardcoded health data
    fun getHealthData(): HealthData {
        return HealthData(
            heartRate = 75,
            steps = 12000,
            waterIntake = 1500 // 1.5L
        )
    }
}

package com.healthapp.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import com.healthapp.R
import com.healthapp.model.HealthData

class HealthActivity : AppCompatActivity() {

    private val healthViewModel: HealthViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_health)

        val heartRateText: TextView = findViewById(R.id.heart_rate_text)
        val stepsText: TextView = findViewById(R.id.steps_text)
        val waterIntakeText: TextView = findViewById(R.id.water_intake_text)

        // Observe the health data
        healthViewModel.healthData.observe(this) { healthData ->
            displayHealthData(healthData)
        }

        // Fetch data
        healthViewModel.fetchHealthData()
    }

    private fun displayHealthData(healthData: HealthData) {
        findViewById<TextView>(R.id.heart_rate_text).text = "Heart Rate: ${healthData.heartRate} BPM"
        findViewById<TextView>(R.id.steps_text).text = "Steps: ${healthData.steps}"
        findViewById<TextView>(R.id.water_intake_text).text = "Water Intake: ${healthData.waterIntake} ml"
    }
}

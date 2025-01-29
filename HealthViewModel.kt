package com.healthapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.healthapp.data.HealthRepository
import com.healthapp.model.HealthData

class HealthViewModel : ViewModel() {

    private val healthRepository = HealthRepository()
    private val _healthData = MutableLiveData<HealthData>()
    val healthData: LiveData<HealthData> get() = _healthData

    fun fetchHealthData() {
        // In a real scenario, this would be done asynchronously (e.g., with coroutines)
        _healthData.value = healthRepository.getHealthData()
    }
}

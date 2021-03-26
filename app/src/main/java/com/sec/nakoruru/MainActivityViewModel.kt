package com.sec.nakoruru

import androidx.lifecycle.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel: ViewModel() {

    init {
        viewModelScope.launch {

        }
    }

    val result = liveData(Dispatchers.IO) {
        emit(doComputation())
    }

    private fun doComputation(): String {
        return ""
    }

}
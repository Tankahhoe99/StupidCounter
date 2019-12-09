package com.example.stupidcounter

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData


class CounterViewModel: ViewModel() {
    //LiveData = data can be observed
    private val _counter = MutableLiveData<Int>()

    val counter: LiveData<Int>
        get() = _counter //getter of private data _counter

    init {
        Log.d("ViewModel",
            "ViewModel Initialised")
        _counter.value = 0
    }

    fun increment(){
        _counter.value = _counter.value?.plus(1)
    }

    fun decrement(){
        _counter.value = _counter.value?.minus(1)
    }

    override fun onCleared() {
        Log.d("ViewModel", "ViewModel Cleared")
        super.onCleared()
    }
}
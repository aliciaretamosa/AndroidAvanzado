package com.keepcoding.androidavanzado.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListFragmentViewModel: ViewModel() {

    private val _herosList = MutableLiveData<List<String>>()
    val heros : LiveData<List<String>> get() = _herosList

    var list = mutableListOf<String>(
        "Goku",
        "Vegeta",
        "Freezer",
        "Bulma",
        "Krillin",
        "Broly"
    )

    fun getHeroList(): List<String> {
        return list
    }

    fun getData() {
        _herosList.value = getMockData()
    }

    fun getMockData () = listOf(
        "Goku",
        "Vegeta",
        "Freezer",
        "Bulma",
        "Krillin",
        "Broly"
    )
}
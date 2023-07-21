package com.keepcoding.androidavanzado.list

import androidx.lifecycle.ViewModel

class ListFragmentViewModel: ViewModel() {

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
}
package com.melendez.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var query = MutableLiveData<String>("")
    var result = Transformations.map(query){ textQuery ->
        if(textQuery.isEmpty()){
            "Por favor ingrese una palabra para obtener resultado"
        } else {
            "El resultado para la query es $textQuery"
        }
    }

    fun onSearch()  {
        val textQuery = query.value

    }
}
/*
package com.mlg.bottomnavigationbarcompose.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mlg.bottomnavigationbarcompose.data.model.Person
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

class SearchViewModel(
    */
/**
     * 3- *//*

  //  person: Person
) : ViewModel() {

//    init {
//        val person = Person("","")
//        val allPersons = person.personList
//    }

    //Mutable state to ass and remove
    private val _searchText = MutableStateFlow("")

    //immutable state to observe only
    val searchText = _searchText.asStateFlow()

    //for search bar loading control
    private val _isSearching = MutableStateFlow(false)

    val isSearching = _isSearching.asStateFlow()

    */
/**
     * 2- *//*

   // val _persons = MutableStateFlow(Person("" , " ").personList)
    */
/**
    * 1- *//*

 //  val _persons = MutableStateFlow()

    //specific person trigger the result of Search Text even the text Change
    //make the result depend on result text search flow
    //combine if it in current person state


    val persons = searchText
        .combine(_persons) { text, persons ->
            //this lambda function will mape the old text to new entry letter and put it in _person
            if (text.isBlank()) {
                persons
            } else {
                persons.filter { it.doseMatchSearchQuery(text) }
            }
        }.stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            //the initial value
            _persons.value
        )

    //the main functionality is user type any text Call from UI
    fun onSearchTextChange(text: String) {
        //set result on _search mutable state
        _searchText.value = text
    }
}*/

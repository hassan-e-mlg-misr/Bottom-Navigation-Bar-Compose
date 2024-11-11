package com.mlg.bottomnavigationbarcompose.data.model

data class Person(
    val firstName: String,
    val lastName: String
) {
    fun doseMatchSearchQuery(query: String): Boolean {
        val listCombinations = listOf(
            //patterns what we expect entered from user
            /**
             * TODO Add validation for Entering */
            "$firstName$lastName",
            "$firstName $lastName",
            "${firstName.first()} ${lastName.first()}"
        )
        //this block of code will return true - if the list contains at least one element matches
        // the given predicate.
        return listCombinations.any { result ->
            result.contains(query, ignoreCase = true)
        }

    }

    val personList = listOf(
        Person(
            firstName = "hassan",
            lastName = "elsayed"
        ),
        Person(
            firstName = "elsayed",
            lastName = "mohamed"
        ),
        Person(
            firstName = "mohamed",
            lastName = "hussien"
        ),
        Person(
            firstName = "hussien",
            lastName = "ibrahim"
        ),
        Person(
            firstName = "ibrahim",
            lastName = "hassan"
        )
    )

}


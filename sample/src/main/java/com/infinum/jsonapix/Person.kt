package com.infinum.jsonapix

import com.infinum.jsonapix.annotations.HasMany
import com.infinum.jsonapix.annotations.HasOne
import com.infinum.jsonapix.annotations.JsonApiX
import kotlinx.serialization.Serializable

@Serializable
@JsonApiX("person")
data class Person(
    val name: String,
    val surname: String,
    val age: Int,
    @HasMany
    val allMyDogs: List<Dog>,
    @HasOne
    val myFavoriteDog: Dog
)

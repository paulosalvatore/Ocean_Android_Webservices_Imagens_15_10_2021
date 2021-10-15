package com.oceanbrasil.ocean_android_webservices_imagens_15_10_2021

data class PokemonApiResult(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Pokemon>
)

data class Pokemon(
    val name: String,
    val url: String
)

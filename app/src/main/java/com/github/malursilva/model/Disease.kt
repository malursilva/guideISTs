package com.github.malursilva.model

import java.io.Serializable

class Disease(
    val id: Int,
    val name: String,
    val summary: String,
    var waysOfContraction: List<String>?,
    var nonWaysOfContraction: List<String>?,
    val symptoms: String,
    val reference: String?
) : Serializable {



}
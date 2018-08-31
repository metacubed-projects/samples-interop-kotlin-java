package org.metacubed.samples.interop.kotlin.model

data class InputData(
    val prefix: String,
    val orderedKeys: List<String>,
    val valueMap: Map<String, Int>
)

data class OutputData(
    val text: String,
    val number: Int
)

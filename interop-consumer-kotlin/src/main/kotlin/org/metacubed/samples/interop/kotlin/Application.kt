package org.metacubed.samples.interop.kotlin

import org.metacubed.samples.interop.kotlin.model.InputData
import org.metacubed.samples.interop.kotlin.service.ServiceImpl

fun main(args: Array<String>) {

    val input = getInputData()
    val service = ServiceImpl(input)
    val output = service.convert()

    println(output)
}

internal fun getInputData() = InputData(
    "t",
    listOf("A", "B", "C", "D", "E"),
    mapOf("B" to 2, "A" to 1, "E" to 5, "C" to 3, "D" to 4)
)

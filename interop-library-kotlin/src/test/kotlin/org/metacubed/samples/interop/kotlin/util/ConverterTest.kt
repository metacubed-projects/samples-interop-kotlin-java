package org.metacubed.samples.interop.kotlin.util

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.metacubed.samples.interop.kotlin.model.InputData

internal class ConverterTest {

    @Test
    fun testConvert() {

        val input = InputData(
            "t",
            listOf("A", "B", "C", "D", "E"),
            mapOf("B" to 2, "A" to 1, "E" to 5, "C" to 3, "D" to 4)
        )
        val converter = Converter()

        val output = converter.convert(input)

        assertEquals("t1::t2::t3::t4::t5", output.text)
        assertEquals(15, output.number)
    }
}

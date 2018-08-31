package org.metacubed.samples.interop.kotlin.service

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.metacubed.samples.interop.kotlin.getInputData

internal class ServiceImplTest {

    @Test
    internal fun testConvert() {

        val input = getInputData()
        val service = ServiceImpl(input)
        val output = service.convert()

        assertEquals("t1::t2::t3::t4::t5", output.text)
        assertEquals(15, output.number)
    }
}

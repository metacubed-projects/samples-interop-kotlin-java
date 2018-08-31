package org.metacubed.samples.interop.kotlin.service

import org.metacubed.samples.interop.kotlin.model.InputData
import org.metacubed.samples.interop.kotlin.util.Converter

internal class ServiceImpl(
    private val input: InputData,
    private val converter: Converter = Converter()
) : Service {

    override fun convert() = converter.convert(input)
}


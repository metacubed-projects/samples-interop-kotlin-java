package org.metacubed.samples.interop.kotlin.util

import org.metacubed.samples.interop.kotlin.model.InputData
import org.metacubed.samples.interop.kotlin.model.OutputData

class Converter {

    fun convert(input: InputData): OutputData {

        val orderedValues = input.orderedKeys.mapNotNull { input.valueMap[it] }
        return OutputData(
            orderedValues.joinToString("::") { input.prefix + it },
            orderedValues.sum()
        )
    }
}

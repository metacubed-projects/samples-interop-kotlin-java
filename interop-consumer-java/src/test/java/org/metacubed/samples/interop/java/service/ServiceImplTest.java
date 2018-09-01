package org.metacubed.samples.interop.java.service;

import org.junit.jupiter.api.Test;
import org.metacubed.samples.interop.kotlin.model.InputData;
import org.metacubed.samples.interop.kotlin.model.OutputData;
import org.metacubed.samples.interop.kotlin.service.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.metacubed.samples.interop.java.Application.getInputData;

public class ServiceImplTest {

    @Test
    public void testConvert() {

        InputData input = getInputData();
        Service service = new ServiceImpl(input);
        OutputData output = service.convert();

        assertEquals("t1::t2::t3::t4::t5", output.getText());
        assertEquals(15, output.getNumber());
    }
}

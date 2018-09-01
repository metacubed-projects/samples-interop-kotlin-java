package org.metacubed.samples.interop.java.service;

import org.metacubed.samples.interop.kotlin.model.InputData;
import org.metacubed.samples.interop.kotlin.model.OutputData;
import org.metacubed.samples.interop.kotlin.service.Service;
import org.metacubed.samples.interop.kotlin.util.Converter;

public class ServiceImpl implements Service {

    private final Converter converter = new Converter();
    private final InputData input;

    public ServiceImpl(InputData input) {

        this.input = input;
    }

    @Override
    public OutputData convert()  {

        return converter.convert(input);
    }
}

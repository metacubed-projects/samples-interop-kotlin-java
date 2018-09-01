package org.metacubed.samples.interop.java;

import org.metacubed.samples.interop.java.service.ServiceImpl;
import org.metacubed.samples.interop.kotlin.model.InputData;
import org.metacubed.samples.interop.kotlin.model.OutputData;
import org.metacubed.samples.interop.kotlin.service.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class Application {

    public static void main(String[] args) {

        InputData input = getInputData();
        Service service = new ServiceImpl(input);
        OutputData output = service.convert();

        System.out.println(output);
    }

    public static InputData getInputData() {

        List<String> orderedKeys = asList("A", "B", "C", "D", "E");

        Map<String, Integer> valueMap = new HashMap<>(5);
        valueMap.put("B", 2);
        valueMap.put("A", 1);
        valueMap.put("E", 5);
        valueMap.put("C", 3);
        valueMap.put("D", 4);

        return new InputData("t", orderedKeys, valueMap);
    }
}

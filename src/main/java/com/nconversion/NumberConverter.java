package com.nconversion;

import java.util.HashMap;
import java.util.Map;

public class NumberConverter implements Converter {
    private static Map<String, Integer> requiredNumbers = new HashMap<>();

    static {
        requiredNumbers.put("98989", new Integer(98989));
    }

    @Override
    public Integer convert (String text) throws NoRequiredNumberException {
        if (requiredNumbers.containsKey(text)) {
            return requiredNumbers.get(text);
        }
        throw new NoRequiredNumberException(text);
    }
}
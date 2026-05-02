package com.parabank.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class TestDataReader {
    private static JsonNode root;

    static {
        ObjectMapper mapper = new ObjectMapper();
        try {
            root = mapper.readTree(new File("./src/test/resources//testdata.json"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public static String get(String section , String Field)
    {
        return root.get(section).get(Field).asText();
    }

}

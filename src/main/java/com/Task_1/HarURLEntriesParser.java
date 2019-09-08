package com.Task_1;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HarURLEntriesParser {
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        FileInputStream fis = new FileInputStream("userss.json");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        TypeFactory typeFactory = TypeFactory.defaultInstance();
        List<UserModelList> userModelLists = objectMapper.readValue(fis, typeFactory.constructCollectionType(ArrayList.class, UserModelList.class));

        System.out.println(userModelLists);

    }
}
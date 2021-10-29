package com.example.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class PC {
    String name;
    private List<String> components = new ArrayList<>();

    @Override
    public String toString() {
        String componentsString = components.stream()
                .collect(Collectors.joining(","));

        return "PC configuration: " + componentsString;
    }
}

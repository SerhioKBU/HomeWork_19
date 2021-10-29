package com.example.components.adder;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ComponentsType {
    Advanced_MEMORY("128 Gb RAM"),
    Average_MEMORY("16 Gb RAM"),
    Light_MEMORY("8 Gb RAM"),

    Advanced_MONITOR("HP 24' monitor"),
    Average_MONITOR("Samsung 19' monitor"),
    Light_MONITOR("Toshiba 15' monitor"),


    Advanced_PROCESSOR("Core i7' processor"),
    Average_PROCESSOR("Core i5' processor"),
    Light_PROCESSOR("Core i3' processor");

    private String componentsType;
}

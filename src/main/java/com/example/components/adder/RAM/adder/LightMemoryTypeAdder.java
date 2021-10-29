package com.example.components.adder.RAM.adder;

import com.example.components.adder.ComponentsType;
import com.example.components.adder.AbstractAdder;
import com.example.components.adder.ComponentsAssembler;
import com.example.entity.PC;


public class LightMemoryTypeAdder extends AbstractAdder {
    public LightMemoryTypeAdder(ComponentsAssembler next) {
        super(next);
    }

    @Override
    public void add(PC pc) {
        pc.getComponents().add(ComponentsType.Light_MEMORY.getComponentsType());
        next(pc);
    }
}

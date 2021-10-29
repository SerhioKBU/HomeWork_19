package com.example.components.adder.RAM.adder;

import com.example.components.adder.ComponentsType;
import com.example.components.adder.AbstractAdder;
import com.example.components.adder.ComponentsAssembler;
import com.example.entity.PC;


public class AverageMemoryTypeAdder extends AbstractAdder {
    public AverageMemoryTypeAdder(ComponentsAssembler next) {
        super(next);
    }

    @Override
    public void add(PC pc) {
        pc.getComponents().add(ComponentsType.Average_MEMORY.getComponentsType());
        next(pc);
    }
}

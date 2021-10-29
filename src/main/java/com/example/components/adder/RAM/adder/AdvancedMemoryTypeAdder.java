package com.example.components.adder.RAM.adder;

import com.example.components.adder.ComponentsType;
import com.example.components.adder.AbstractAdder;
import com.example.components.adder.ComponentsAssembler;
import com.example.entity.PC;


public class AdvancedMemoryTypeAdder extends AbstractAdder {
    public AdvancedMemoryTypeAdder(ComponentsAssembler next) {
        super(next);
    }

    @Override
    public void add(PC pc) {
        pc.getComponents().add(ComponentsType.Advanced_MEMORY.getComponentsType());
        next(pc);
    }
}

package com.example.components.adder.processor.adder;

import com.example.components.adder.ComponentsType;
import com.example.components.adder.AbstractAdder;
import com.example.components.adder.ComponentsAssembler;
import com.example.entity.PC;


public class AdvancedProcessorTypeAdder extends AbstractAdder {
    public AdvancedProcessorTypeAdder(ComponentsAssembler next) {
        super(next);
    }

    @Override
    public void add(PC pc) {
        pc.getComponents().add(ComponentsType.Advanced_PROCESSOR.getComponentsType());
        next(pc);
    }
}

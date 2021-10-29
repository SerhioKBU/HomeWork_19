package com.example.components.adder.processor.adder;

import com.example.components.adder.ComponentsType;
import com.example.components.adder.AbstractAdder;
import com.example.components.adder.ComponentsAssembler;
import com.example.entity.PC;


public class AverageProcessorTypeAdder extends AbstractAdder {
    public AverageProcessorTypeAdder(ComponentsAssembler next) {
        super(next);
    }

    @Override
    public void add(PC pc) {
        pc.getComponents().add(ComponentsType.Average_PROCESSOR.getComponentsType());
        next(pc);
    }
}

package com.example.components.adder.monitor.adder;

import com.example.components.adder.ComponentsType;
import com.example.components.adder.AbstractAdder;
import com.example.components.adder.ComponentsAssembler;
import com.example.entity.PC;

public class AverageMonitorTypeAdder extends AbstractAdder {
    public AverageMonitorTypeAdder(ComponentsAssembler next) {
        super(next);
    }

    @Override
    public void add(PC pc) {
        pc.getComponents().add(ComponentsType.Average_MONITOR.getComponentsType());
        next(pc);
    }
}

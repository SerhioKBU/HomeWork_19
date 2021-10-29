package com.example.components.adder.monitor.adder;

import com.example.components.adder.ComponentsType;
import com.example.components.adder.AbstractAdder;
import com.example.components.adder.ComponentsAssembler;
import com.example.entity.PC;

public class LightMonitorTypeAdder extends AbstractAdder {
    public LightMonitorTypeAdder(ComponentsAssembler next) {
        super(next);
    }

    @Override
    public void add(PC pc) {
        pc.getComponents().add(ComponentsType.Light_MONITOR.getComponentsType());
        next(pc);
    }
}

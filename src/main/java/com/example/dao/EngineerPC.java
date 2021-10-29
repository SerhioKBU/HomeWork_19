package com.example.dao;

import com.example.components.adder.ComponentsAssembler;
import com.example.components.adder.RAM.adder.AdvancedMemoryTypeAdder;
import com.example.components.adder.monitor.adder.AdvancedMonitorTypeAdder;
import com.example.components.adder.processor.adder.AverageProcessorTypeAdder;
import com.example.entity.PC;

public class EngineerPC implements PCFactory {
    ComponentsAssembler engineerPC =
            new AdvancedMemoryTypeAdder(
                    new AverageProcessorTypeAdder(
                            new AdvancedMonitorTypeAdder(null)));

    @Override
    public PC assemblePC() {
        PC pc = new PC();
        engineerPC.add(pc);

        System.out.println("Engineer " + pc);
        return pc;
    }
}

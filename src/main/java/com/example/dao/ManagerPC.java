package com.example.dao;

import com.example.components.adder.ComponentsAssembler;
import com.example.components.adder.RAM.adder.AdvancedMemoryTypeAdder;
import com.example.components.adder.RAM.adder.AverageMemoryTypeAdder;
import com.example.components.adder.monitor.adder.AdvancedMonitorTypeAdder;
import com.example.components.adder.monitor.adder.AverageMonitorTypeAdder;
import com.example.components.adder.monitor.adder.LightMonitorTypeAdder;
import com.example.components.adder.processor.adder.AdvancedProcessorTypeAdder;
import com.example.components.adder.processor.adder.AverageProcessorTypeAdder;
import com.example.components.adder.processor.adder.LightProcessorTypeAdder;
import com.example.entity.PC;

public class ManagerPC implements PCFactory {
    ComponentsAssembler managerPC =
    new AverageMemoryTypeAdder(
            new LightProcessorTypeAdder(
                    new LightMonitorTypeAdder(null)));

    @Override
    public PC assemblePC() {
        PC pc = new PC();
        managerPC.add(pc);

        System.out.println("Manager " + pc);
        return pc;
    }
}

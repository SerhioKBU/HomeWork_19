package com.example.dao;

import com.example.components.adder.ComponentsAssembler;
import com.example.components.adder.RAM.adder.LightMemoryTypeAdder;
import com.example.components.adder.monitor.adder.AverageMonitorTypeAdder;
import com.example.components.adder.processor.adder.LightProcessorTypeAdder;
import com.example.entity.PC;

public class HousewifePC implements PCFactory {
    ComponentsAssembler housewifePC =
            new LightMemoryTypeAdder(
                    new LightProcessorTypeAdder(
                            new AverageMonitorTypeAdder(null)));

    @Override
    public PC assemblePC() {
        PC pc = new PC();
        housewifePC.add(pc);

        System.out.println("Housewife " + pc);
        return pc;
    }
}

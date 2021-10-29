package com.example.components.adder;

import com.example.entity.PC;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractAdder implements ComponentsAssembler{
    protected final ComponentsAssembler next;

    @Override
    public void add(PC pc) {
        pc.getComponents().add("");
        next(pc);
    }

    protected void next(PC pc){
        if (next != null) {
            next.add(pc);
        }
    }
}

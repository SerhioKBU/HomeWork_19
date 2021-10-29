package com.example.pc.store.menu;

import com.example.dao.EngineerPC;
import com.example.dao.PCFactory;

public class EngineerPCMenuItem extends MenuItem{
    @Override
    public String getName() {
        return "Create engineer PC";
    }

    @Override
    public void run() {
        PCFactory engineerPC = new EngineerPC();
        engineerPC.assemblePC();
    }
}


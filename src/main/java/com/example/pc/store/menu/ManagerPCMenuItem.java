package com.example.pc.store.menu;

import com.example.dao.ManagerPC;
import com.example.dao.PCFactory;

public class ManagerPCMenuItem extends MenuItem{
    @Override
    public String getName() {
        return "Create manager PC";
    }

    @Override
    public void run() {
        PCFactory managerPC = new ManagerPC();
        managerPC.assemblePC();
    }
}


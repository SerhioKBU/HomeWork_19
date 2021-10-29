package com.example.pc.store.menu;

import com.example.dao.HousewifePC;
import com.example.dao.PCFactory;

public class HousewifePCMenuItem extends MenuItem{
    @Override
    public String getName() {
        return "Create housewife PC";
    }

    @Override
    public void run() {
        PCFactory housewifePC = new HousewifePC();
        housewifePC.assemblePC();
    }
}


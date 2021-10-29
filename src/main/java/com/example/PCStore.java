package com.example;

import com.example.dao.EngineerPC;
import com.example.dao.HousewifePC;
import com.example.dao.ManagerPC;
import com.example.dao.PCFactory;
import com.example.entity.PC;
import com.example.pc.store.menu.*;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        PCFactory managerPC = new ManagerPC();
//        PCFactory housewifePC = new HousewifePC();
//        PCFactory engineerPC = new EngineerPC();
//
//        String next = scanner.next();
//        if(next.equals("assemble_PC")) {
//            PC pc1 = managerPC.assemblePC();
//            PC pc2 = housewifePC.assemblePC();
//            PC pc3 = engineerPC.assemblePC();
//
//            System.out.println("Manager: " + pc1 + "\n" + pc2 + "\n" + pc3);

            List<MenuItem> menuAuthor = Arrays.asList(
                new ManagerPCMenuItem(),
                new EngineerPCMenuItem(),
                new HousewifePCMenuItem()
                );

        Menu menu = new Menu(menuAuthor, scanner);
        menu.makeMenu();
        }
    }


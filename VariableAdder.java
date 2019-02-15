package edu.dmacc.codedsm.hw4;

import java.sql.SQLOutput;

public class VariableAdder {
    final static int KIDS = 3;
    static int  parents = 2;
    public static void main(String[] args) {
        int ocle = 1;
         int household = KIDS + parents + ocle;
        System.out.println(household);



    }
}

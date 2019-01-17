package com.company;

public class Main {

    public static void main(String[] args) {


    }

    public int doMatch(int pervoeChislo, int vtoroeChislo, int tretieChislo){
        MathFunction operation = new MathFunction();
        int result1 = operation.multiply(pervoeChislo, vtoroeChislo);
        int result2 = operation.add(result1, tretieChislo);
        int result3 = result2 - 1;

        return result3;
    }
}

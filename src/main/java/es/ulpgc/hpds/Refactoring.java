package es.ulpgc.hpds;

import java.util.HashMap;
import java.util.Map;

public class Refactoring {
    static Map<String, Double> taxs;


    public static void main(String[] args) {
        taxs = new HashMap<>();
        taxs.put("SC",10.0);
        taxs.put("AL",20.0);
        taxs.put("GA",20.0);
        taxs.put("KY",40.0);

        double taxes = CalculateSalesTax("G",20.0);
        System.out.println(taxes);
    }


    /*public static double CalculateSalesTax(String state, double price){
        StateBase activeState = Factory.CreateState(state);
        return activeState.CalculateSales(price);
    }*/


    public static double CalculateSalesTax(String state, double price) {
        for(Map.Entry<String,Double> x : taxs.entrySet()){
            if (state == x.getKey()) return x.getValue() * price;
        }
        return -1;
    }
}

package es.ulpgc.hpds;

public class Kentucky extends StateBase {
    final static double KYTAX = 40.0;
    @Override
    public double CalculateSales(double price) {
        return price*KYTAX;
    }
}

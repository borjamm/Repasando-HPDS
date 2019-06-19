package es.ulpgc.hpds;

public class Alabama extends StateBase {
    final static double ALTAX = 20.0;
    @Override
    public double CalculateSales(double price) {
        return price*ALTAX;
    }
}

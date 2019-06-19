package es.ulpgc.hpds;

public class SouthCarolina extends StateBase {
    final static double SCTAX = 10.0;

    @Override
    public double CalculateSales(double price) {
        return price* SCTAX;
    }
}

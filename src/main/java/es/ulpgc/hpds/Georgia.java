package es.ulpgc.hpds;

import java.lang.management.GarbageCollectorMXBean;

public class Georgia extends StateBase {
    final static double GATAX = 40.0;

    @Override
    public double CalculateSales(double price) {
        return price*GATAX;
    }
}

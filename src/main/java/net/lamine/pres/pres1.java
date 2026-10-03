package net.lamine.pres;

import net.lamine.dao.DaiImpl;
import net.lamine.metier.MetierImpl;

public class pres1 {
    static void main(String[] args) {
        DaiImpl d = new DaiImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(d);
        System.out.println("Res = " + metier.Calcul());

    }
}

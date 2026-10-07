package net.lamine.pres;

import net.lamine.dao.DaoImpl;
import net.lamine.metier.MetierImpl;

public class pres1 {
    static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        // metier.setDao(d); // injection de depondances via setters
        System.out.println("Res = " + metier.Calcul());

    }
}

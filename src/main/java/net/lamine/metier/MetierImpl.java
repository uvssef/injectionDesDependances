package net.lamine.metier;

import net.lamine.dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao ;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double Calcul() {
        double t = dao.getData();
        double res = t + 3 ;
        return res ;
    }
}

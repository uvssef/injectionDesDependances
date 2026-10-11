package net.lamine.metier;

import net.lamine.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    private IDao dao ;

    public MetierImpl(@Qualifier("d")IDao dao) {
         this.dao = dao;
    }




//    Pour injecter dans la varriable dao un objet d'une class qui impiment
//    l'interface IDao

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public IDao getDao() {
        return dao;
    }

    @Override
    public double Calcul() {
        double t = dao.getData();
        double res = t + 3 ;
        return res ;
    }


    }


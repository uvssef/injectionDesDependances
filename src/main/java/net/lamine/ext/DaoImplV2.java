package net.lamine.ext;

import net.lamine.dao.IDao;
import org.springframework.stereotype.Component;

//@Component("d2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteur .......");
        double t = 12 ;
        return t;
    }
}

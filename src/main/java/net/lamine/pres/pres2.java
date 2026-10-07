package net.lamine.pres;

import net.lamine.dao.IDao;
import net.lamine.metier.IMetier;
import net.lamine.metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class pres2 {
//    FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    static void main(String[] args) throws  Exception{

        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cdao = Class.forName(daoClassName);
        IDao dao = (IDao)cdao.newInstance();

        String MetierClassName = scanner.nextLine();
        Class cMetier = Class.forName(MetierClassName);
        IMetier Metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        System.out.println("RES = " + Metier.Calcul());

    }
}

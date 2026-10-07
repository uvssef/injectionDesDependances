package net.lamine.dao;

public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("Version Base de donne ");
        double temp = 20;
        return temp;
    }
}

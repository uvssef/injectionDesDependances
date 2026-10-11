package net.lamine.pres;

import net.lamine.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    static void main(String[] args) {
        ApplicationContext applicationContext;
        applicationContext = new AnnotationConfigApplicationContext("net.lamine" );
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("RES = " + metier.Calcul());


    }
}

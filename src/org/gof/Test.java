package org.gof;

import org.gof.facade.Facade;
import org.gof.singleton.SingletonEager;
import org.gof.singleton.SingletonLazy;
import org.gof.singleton.SingletonLazyHolder;
import org.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Testes relacionados ao Design Patter

        // Singleton
        SingletonLazy lazy1 = SingletonLazy.getInstance();
        System.out.println(lazy1);
        SingletonLazy lazy2 = SingletonLazy.getInstance();
        System.out.println(lazy2);

        SingletonEager eager1 = SingletonEager.getInstance();
        System.out.println(eager1);
        SingletonEager eager2 = SingletonEager.getInstance();
        System.out.println(eager2);

        SingletonLazyHolder lazyHolder1 = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder1);
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder2);

        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamentoStrategy(normal);
        robo.mover();

        robo.setComportamentoStrategy(defensivo);
        robo.mover();

        robo.setComportamentoStrategy(agressivo);
        robo.mover();

        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("Eu mesmo", "128899-499");
    }
}

package org.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author marcelorvergara
 */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();

    }

    public static SingletonEager getInstance() {
        return instance;
    }
}

package org.gof.singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @author marcelorvergara
 * @see <a href="https://stackoverflow.com/questions/16106260/thread-safe-singleton-class>Referência Lazy Holder</a>
 */
public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}

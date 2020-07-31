package singleton;

class Singleton1 {
    private static Singleton1 uniqueInstance;

    private Singleton1(){}

    public static Singleton1 getInstance(){
        if(uniqueInstance == null) uniqueInstance = new Singleton1();
        return uniqueInstance;
    }
}

class Singleton2 {
    private static Singleton2 uniqueInstance;

    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if(uniqueInstance == null) uniqueInstance = new Singleton2();
        return uniqueInstance;
    }
}

class Singleton3 {
    private volatile static Singleton3 uniqueInstance;

    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(uniqueInstance == null) {
            synchronized (Singleton3.class) {
                if (uniqueInstance == null)
                    uniqueInstance = new Singleton3();
            }
        }
        return uniqueInstance;
    }
}


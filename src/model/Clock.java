package model;


public class Clock {
    private static final Clock INSTANCE = new Clock();

    private Clock() {
    }

    public static Clock getInstance() {
        return INSTANCE;
    }

    
    public void tick() {
        
    }


    public int getCurrentTick() {
        return 0;
    }
}

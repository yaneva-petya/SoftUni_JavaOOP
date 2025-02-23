package Exercise.WorkingWithAbstraction.Demo;

public enum Role {
    //Добра практика е да се създават
    //с главни букви, тъй като стойностите са константни

    ADMIN(true),
    USER(false),
    SUPPORT(false);

    private boolean isAccessAllowed;

    //public липсва, защото потребителя не може да слага собствени параметри към конструктора
    Role(boolean isAccessAllowed ){
        this.isAccessAllowed=isAccessAllowed;
    }
    @Override
    public String toString() {
        return String.format("Hello my role is: %s\n", Role.ADMIN);
    }
}

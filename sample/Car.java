package sample;

public abstract class Car {
    private String _owner;

    public Car(String owner){
        _owner = owner;
    }

     abstract void engine();
     abstract void color();
     abstract void name();

    public void getOwner()
    {
        System.out.println("owner: " + _owner);
    }

}

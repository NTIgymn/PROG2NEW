package sample;

class Volvo extends Car {
    public Volvo(String owner) {
        super(owner);
    }

  //  @Override
    public void engine() {
        System.out.println("this volvo's engine is T8");
    }

 //   @Override
    public void color() {
        System.out.println("This vovlo's color is yellow");
    }
 //   @Override
    public void name(){
        System.out.println("This volvo's name is XC90");
    }
}

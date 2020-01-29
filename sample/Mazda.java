package sample;

class Mazda extends Car {
    public Mazda(String owner) {
        super(owner);
    }

  //  @Override
    public void engine() {
        System.out.println("this mazda has a 1.6 L (98 cu in) inline-four engine ");
    }

 //   @Override
    public void color() {
        System.out.println("This mazda's color is red");
    }
  //  @Override
    public void name(){
        System.out.println("This mazda's name is MX5 aka mazda miata");
    }
}

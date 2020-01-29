package sample;

 class Audi extends Car {
     public Audi(String owner) {
         super(owner);
     }

   //  @Override
     public void engine() {
         System.out.println("this audi's engine is v10");
     }

  //   @Override
     public void color() {
         System.out.println("This audi's color is black");
     }
   //  @Override
     public void name(){
         System.out.println("This audi's name is R8");
     }
 }

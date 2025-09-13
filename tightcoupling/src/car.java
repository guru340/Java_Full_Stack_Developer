public class car {
//    Car is tightly coupled with Engine Class
    //We cant change Engine type
//    We Cant test the car Without Engine
//    No flexbility
//   PetrolEngine engine=new PetrolEngine();
//    public void drive(){
//        engine.start();
//        System.out.println("car is moving....");
//    }


//    Flexible but still poor
//    we using Interface still we have make object hardcoded
//    Engine engine=new DieselEngine();
//    public void drive(){
//    engine.start();
//      System.out.println("car is moving....");
//    }

    public car(Engine engine) {
        this.engine = engine;
    }

    Engine engine;
        public void drive(){
    engine.start();
      System.out.println("car is moving....");
    }


}

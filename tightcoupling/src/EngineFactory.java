public class EngineFactory {
    public static Engine getEngine(String Type){
        if (Type.equalsIgnoreCase("diesel")){
            return new DieselEngine();
        } else if (Type.equalsIgnoreCase("petrol")) {
            return new PetrolEngine();
        }
        else {
            throw new IllegalArgumentException("Invaild engine Type");
        }
    }
}

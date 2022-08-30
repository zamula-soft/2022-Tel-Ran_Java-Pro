package lesson4.animals;

public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }

    @Override
    String greets() {
        return "GAF";
    }

    @Override
    String greets(Dog another) {
        return "GAFGAF";
    }

    String greets(BigDog bigDog){
        return "GAFGAFGAF";
    }
}

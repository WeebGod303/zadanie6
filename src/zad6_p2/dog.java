package zad6_p2;

public class dog extends mammal{
    private String rasajs;
    public dog()
    {
        super();
    }

    public dog(int agejs, int weightjs, boolean oswojony, String rasajs) {
        super(agejs, weightjs, oswojony);
        this.rasajs = rasajs;
    }

    public dog(String namejs, int agejs, int weightjs, boolean oswojony, String rasajs) {
        super(namejs, agejs, weightjs, oswojony);
        this.rasajs = rasajs;
    }

    public String getRasajs() {
        return rasajs;
    }

    public void setRasajs(String rasajs) {
        this.rasajs = rasajs;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "rasajs='" + rasajs + super.toString();
    }

    public void feedjs() {
        System.out.println("Karmimy psa");
    }

    @Override
    void eatjs() {
        System.out.println("Mieso");
    }

    @Override
    void getVoicejs() {
        System.out.println("Woof Woof");
    }
}
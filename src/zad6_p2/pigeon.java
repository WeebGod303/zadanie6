package zad6_p2;

public class pigeon extends bird{
    private String speciesjs;
    public pigeon()
    {
        super();
    }

    public pigeon(int agejs, int weightjs, String featherColor, boolean latajacy, String speciesjs) {
        super(agejs, weightjs, featherColor, latajacy);
        this.speciesjs = speciesjs;
    }

    public pigeon(String namejs, int agejs, int weightjs, String featherColor, boolean latajacy, String speciesjs) {
        super(namejs, agejs, weightjs, featherColor, latajacy);
        this.speciesjs = speciesjs;
    }

    public pigeon(String speciesjs) {
        this.speciesjs = speciesjs;
    }

    public String getSpeciesjs() {
        return speciesjs;
    }

    public void setSpeciesjs(String speciesjs) {
        this.speciesjs = speciesjs;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "species='" + speciesjs ;
    }

    public void feedjs() {
        System.out.println("Karmimy golebia");
    }

    @Override
    void eatjs() {
        System.out.println("Pasza");
    }

    @Override
    void getVoicejs() {
        System.out.println("Gru gru");
    }
}
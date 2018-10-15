package Shopping;

public abstract class Cake extends Item{
    protected String name;
    protected double rate;
    public Cake () {};
    public Cake (String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getInfo () {
        return "Cake:" + name + "\t" + rate;
    }


}

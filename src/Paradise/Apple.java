package Paradise;

public class Apple {
    public int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
    public boolean isEmpty (){
        if (weight == 0) return true;
        return false;
    }
}

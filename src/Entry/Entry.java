package Entry;

public class Entry {
    static int count;
    public int priority;
    public int id;
    public String notes;
    public Entry (int priority,String notes){
        this.priority = priority;
        this.notes = notes;
    }
    public String toString (){
        return count + "." + notes + " priority:" + priority;
    }
}

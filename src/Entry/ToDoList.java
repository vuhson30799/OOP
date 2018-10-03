package Entry;

public class ToDoList {
    public int length = 10;
    Entry[] list = new Entry[length];
    public void showToDoList (){
        for (Entry x: list) {
            System.out.println(x.toString());
        }
    }
    public void sortList (){
        for (int i = 0; i < list.length-1; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i].priority > list[j].priority)
                    changeListElement(list[i],list[j]);
            }

        }
    }
    public void changeListElement (Entry element1, Entry element2){
        Entry aux;
        aux = element1;
        element1 = element2;
        element1  = aux;
    }
    public void removeEntry (int id){
        System.out.println("Do you want to remove (y/n)");
    }
}

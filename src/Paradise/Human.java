package Paradise;

public class Human {
    private String name;
    private boolean gender;
    private int age;
    public Human (String name,boolean gender){
        this.name = name;
        this.gender = gender;
    }
    public void say (String words){
        System.out.println(words);
    }
    public void eat (Apple apple) {
        apple.weight --;
    }
    public void sleep (){

    }
}

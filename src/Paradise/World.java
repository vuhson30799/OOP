package Paradise;

public class World  {
    public static void main(String[] args) {
        Human adam = new Human("Adam",true);
        Human eva = new Human("Eva",false);
        God.say("Don't eat apple. You will die");
        Snake.say("Eat apple. It's good. You won't die");
        Apple apple = new Apple();
        apple.setWeight(5);
        System.out.println("Adam and Eva are eating apple");
        do {
            if (apple.weight > 0 ){
                eva.eat(apple);
            }
            if (apple.weight >0){
                adam.eat(apple);
            }
        }while (!apple.isEmpty());
        adam.sleep();
        eva.sleep();
        God.say("Eva! You must follow your husband and get hurt while ... Adam! You must grow tree to live");
    }
}

package ManagingStudent;

public class StudentManagerTest {

    public static void main(String[] args) {
        StudentManager class1 = new StudentManager();

        Student student1 = new Student("Andy",10);

        Student student2 = new Student("Jack",11);

        Student student3 = new Student("Fang",12);



        class1.add(student1);
        class1.add(student2);
        class1.add(student3);

        class1.find("jack");

        class1.displayAll();

    }
}

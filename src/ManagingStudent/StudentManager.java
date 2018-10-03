package ManagingStudent;

public class StudentManager {
    private int numberOfStudents;
    public Student[] students = new Student[numberOfStudents + 1];

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    /*tăng số phần tử của mảng và copy lại mảng cũ sang mảng vừa tạo*/
    public void add (Student student){
        if (numberOfStudents < 10){
            students[numberOfStudents] = student;
            numberOfStudents ++;
        }else{
            students = new Student[numberOfStudents + 10];
        }

    }
    public void find (String name) {
        int i = 0;
        while (i < numberOfStudents){
            if (students[i].getName().equals(name)) {
                System.out.println("Student is in class at index: " + i + " The information: " + students[i].getInformation());
            }else {
                System.out.println("This student isn't in class");
            }
        }

    }
    public void displayAll (){
        for (Student x: students) {
            System.out.println(x.getInformation());
        }
    }
}

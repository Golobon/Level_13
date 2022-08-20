


public class Test3 {
    private final String[] students = new String[30];

    //static int i = 0;

    public static void main(String[] args) {
        Test3 uni = new Test3();
        uni.addStudent("Максим Федоренко");
        uni.addStudent("Олег Кесарчук");
        uni.addStudent("Олег Кесарчук");
        uni.addStudent("Олег Кесарчук");
        uni.addStudent("Олег Кесарчук");
        uni.addStudent("Олег Кесарчук");
        uni.addStudent("Олег Кесарчук");
        uni.printStudents();
    }

    public void addStudent(String student) {
        int i = 0;
        if (students[i++] == null) students[i] = student;
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }


}

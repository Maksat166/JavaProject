public class Main {



    public static Student getTopStudent(Student[] arr) {
        Student top = null;
        for (Student s : arr) {
            if (s != null) {
                if (top == null || s.getGpa() > top.getGpa()) {
                    top = s;
                }
            }
        }
        return top;
    }


    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s != null && s.isHonors()) {
                count++;
            }
        }
        return count;
    }


    public static int totalCredits(Student[] arr) {
        int sum = 0;
        for (Student s : arr) {
            if (s != null) {
                sum += s.getCredits();
            }
        }
        return sum;
    }


    public static void main(String[] args) {

        Student s1 = new Student("Aruzhan A", "S001", "IT");
        Student s2 = new Student("Dias D", "S002", "Engineering");
        Student s3 = new Student("Maksat M", "S003", "Computer Science");
        Student s4 = new Student("Alina K", "S004", "Math");
        Student s5 = new Student("Nursultan N", "S005", "Physics");



        s1.updateGPA(3.8); s1.addCredits(90);
        s2.updateGPA(3.2); s2.addCredits(80);
        s3.updateGPA(3.9); s3.addCredits(100);
        s4.updateGPA(3.4); s4.addCredits(70);
        s5.updateGPA(3.6); s5.addCredits(85);



        Student[] students = {s1, s2, s3, s4, s5};



        for (Student s : students) {
            System.out.println(s);
        }



        Course course = new Course("OOP Java", "Dr. Smith", 5);
        for (int i = 0; i < students.length; i++) {
            course.addStudent(students[i], i);
        }


        System.out.println("\n" + course);
        System.out.println("Highest credit student: " + course.highestCreditStudent());
        System.out.println("Average GPA: " + course.courseAverageGPA());



        System.out.println("\nTop GPA student: " + getTopStudent(students));
        System.out.println("Honors students count: " + countHonors(students));
        System.out.println("Total credits: " + totalCredits(students));
    }
}
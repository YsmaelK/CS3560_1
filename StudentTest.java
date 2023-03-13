public class StudentTest {
    public static void main(String[] args) {
        // Create first student using parameterized constructor
        Student john = new Student("John", "CS", 3.5);
        // Update John's name, major, and GPA
        john.setName("John Smith");
        john.setMajor("Computer Science");
        john.setGpa(3.8);
        // Print John's state
        System.out.println(john.toString());
        
        // Create second student using no-arg constructor
        Student mary = new Student();
        mary.setName("Mary Ann");
        mary.setMajor("CE");
        mary.setGpa(3.3);
        // Print Mary's state
        System.out.println(mary.toString());
    }
}

import java.io.*;

// Student must implement Serializable
class Student implements Serializable {
    private int studentId;
    private String name;
    private double grade;

    public Student(int studentId, String name, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Grade: " + grade;
    }
}

public class problem2 {
    public static void main(String[] args) {
        String filename = "student.ser";

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            Student s1 = new Student(101, "Amit", 8.7);
            oos.writeObject(s1);
            System.out.println("✅ Student object serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student s2 = (Student) ois.readObject();
            System.out.println("✅ Student object deserialized:");
            System.out.println(s2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

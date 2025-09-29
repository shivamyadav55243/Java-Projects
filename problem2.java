import java.io.*;

class Student implements Serializable {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}

public class problem2 {
    public static void main(String[] args) {
        String filename = "student.ser";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            Student s1 = new Student(101, "Amit", 8.7);
            oos.writeObject(s1);
            System.out.println("Student object serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Student s2 = (Student) ois.readObject();
            System.out.println("Deserialized Student:");
            System.out.println(s2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

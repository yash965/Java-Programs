import java.io.*;

public class Serializability {

    public static void main(String[] args) {
        // Serialize 'n' objects
        try (FileOutputStream fileOut = new FileOutputStream("students.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            Student student1 = new Student(1, "Alice", 22, "Female", "MCA");
            Student student2 = new Student(2, "Bob", 25, "Male", "B.Tech");
            Student student3 = new Student(3, "Charlie", 23, "Male", "MCA");

            // Write objects to the file.
            objectOut.writeObject(student1);
            objectOut.writeObject(student2);
            objectOut.writeObject(student3);
            
            System.out.println("Serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize objects and find students in "MCA" program
        try (FileInputStream fileIn = new FileInputStream("students.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            while (true) {
                try {
                    Student student = (Student) objectIn.readObject();
                    if (student.getProgram().equalsIgnoreCase("MCA")) {
                        System.out.println("Student belongs to MCA: " + student.toString());
                    }
                } catch (EOFException | ClassNotFoundException e) {
                    // EOFException: End of file reached
                    // ClassNotFoundException: If class not found during deserialization
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


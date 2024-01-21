import java.io.*;

public class IOPrac {
    try(FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            //Object declarations
            oos.writeObject();
        } catch (Exception e) {
            e.printStackTrace();
        }

    try (FileInputStream fis = new FileInputStream("student.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);) {
            try {
                 while(true) {
                ois.readObject();
                // print object details.
                 }
            }catch(Exception p) {
                break;
            }
            
           

    } catch (Exception l) {
        l.printStackTrace();
    }
}

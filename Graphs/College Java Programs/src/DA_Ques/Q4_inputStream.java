package DA_Ques;
import java.io.*;

public class Q4_inputStream {
  
  public static void main(String[] args) {
    try {
      InputStream input = new FileInputStream(args[0]);
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    } catch (IOException e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }
}

package DA_Ques;

import java.io.*;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter path");
        String path = sc.nextLine();

        // Open file using file reader.
        File file = new File(path);
        FileReader fileReader = new FileReader(file);

        // 
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;

        while( (line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}

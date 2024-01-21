package DA_Ques;

import java.io.*;
import java.util.Scanner;

public class Q3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter directory name");
        String directoryPath = sc.nextLine();
        
        File directory = new File(directoryPath);
        long totalSize = 0;
        
        if(directory.isDirectory()) {
            File[] files = directory.listFiles();
            
            if(files != null) {
                System.out.println("Java files in the directory");
                
                for(File file : files) {
                    if(file.isFile() && file.getName().toLowerCase().endsWith(".java")) {
                        System.out.println("File Name: " + file.getName() + "\nsize: " + file.length());
                        totalSize += file.length();
                    }
                }
                
                System.out.println("Total size of the directory: " + totalSize);
            } else {
                System.out.println("No files found in the directory");
            }
        } else {
            System.out.println("No such directory exists");
        }
    }
    
}

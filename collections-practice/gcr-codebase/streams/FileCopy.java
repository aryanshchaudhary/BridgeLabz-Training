package java_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {

        String sourcePath =
            "C:\\Users\\Asus\\OneDrive\\Desktop\\Training\\java_streams\\read.txt";

        String destPath =
            "C:\\Users\\Asus\\OneDrive\\Desktop\\Training\\java_streams\\copy.txt";

        try {
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destPath);

            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


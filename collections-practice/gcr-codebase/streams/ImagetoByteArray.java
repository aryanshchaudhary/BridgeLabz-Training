package java_streams;
import java.io.*;

public class ImagetoByteArray {

    public static void main(String[] args) {

        String sourceImage =
            "C:\\Users\\Asus\\OneDrive\\Desktop\\Training\\java_streams\\original.jpg";

        String copiedImage =
            "C:\\Users\\Asus\\OneDrive\\Desktop\\Training\\java_streams\\copied.jpg";

        try {
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            fis.close();

            byte[] imageBytes = baos.toByteArray();

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(copiedImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("Image copied successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


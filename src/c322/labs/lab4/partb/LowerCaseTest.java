package c322.labs.lab4.partb;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseTest {

    public static void main(String[] args) throws IOException {
        int i;
        try {
            InputStream in =
                    new LowerCaseStream(
                            new BufferedInputStream(
                                    new FileInputStream("test.txt")));
            while((i = in.read()) >= 0) {
                System.out.print((char)i);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package p1.p3;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by jburnell on 3/1/2016.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //open the file for writing in append mode

       try (PrintWriter output =
                    new PrintWriter(new FileOutputStream("out1.txt", true))) {

           for (int i = 1; i < 101; i += 2) output.println(i);
       }

    }
}

package p1.p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by jburnell on 3/1/2016.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        try (PrintWriter output = new PrintWriter(new File("out1.txt"))) {

            for (int i = 2; i < 102; i += 2)
                output.println(i);

        }
    }
}

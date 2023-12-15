package lap_03.OtherProjects.src.hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {

    public static void main(String[] args) throws IOException {
        String filename = "E:\\JAVA\\OOP_LAP\\src\\lap_03\\OtherProjects\\src\\hust\\soict\\dsai\\garbage\\test.txt"; //test.exe is the name or path to an executable file
        byte[] inputBytes = {0};
        long startTime, endTime;


        inputBytes = Files.readAllBytes(Paths.get(filename));

        startTime = System.currentTimeMillis();
        StringBuilder outputStringBulder = new StringBuilder();
        for (byte b : inputBytes) outputStringBulder.append((char) b);
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime); // thís prints 4

    }

}
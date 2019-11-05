package arrays;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String a = "pol";
        String b = new String("pol");
        simpleMethod("dasd");
    }

    public static void simpleMethod(String a) throws IllegalArgumentException {

        try {
            System.out.println("H");
            if (a.equals("pol")) {
                System.out.println("EEHE");
                throw new IllegalArgumentException("Ehe");
            }
            File file = new File("dsd");
            Scanner scanner = new Scanner(file);
        } catch (IOException | IllegalArgumentException e){
            e.printStackTrace();
        }

    }


}

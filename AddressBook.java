package com.iostream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddressBook {
	
	public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\User\\Desktop\\CoreJava\\Details.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        String fileContent = "";
        while(scanner.hasNextLine()) {

            fileContent = fileContent.concat(scanner.nextLine() + "\n");
        }


        FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\CoreJava\\Details.txt");
        writer.write(fileContent);
        writer.close();
    }
}

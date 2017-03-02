package com.gubbacchi.tools;

import java.io.*;
import java.util.Scanner;

/**
 * Created by bindhukc on 2/27/17.
 */
public class UltimateGrep {
    public static void main(String[] args) {

        System.out.println("Arg 1 : " + args[0]);

        System.out.println("Hello world");
        System.out.println("Hi Puttanni");
        System.out.println("Hi Good morning Gubbi mari");
        System.out.println("I changed something");
        System.out.println("Helooo");
        FileInputStream fis = null;
        BufferedReader b = null;
        try {
            fis = new FileInputStream("/Users/bindhukc/code/UltimateGrep/src/main/java/com/gubbacchi/tools/sample.txt");
            b = new BufferedReader(new InputStreamReader(fis));
            String line = b.readLine();
            while (line != null) {
                //System.out.println(line);
                line = b.readLine();
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found");
        }
        catch (IOException ex1){
            System.out.println("IO exception");
        }
        finally {
                System.out.println("Everything is fine");
            }
           System.out.println("enter the string you want to search in a file");
           Scanner s = new Scanner(System.in);
           String input = s.nextLine();
           System.out.println("the input string is  "+ input);

               Scanner s1 = new Scanner("/Users/bindhukc/code/UltimateGrep/src/main/java/com/gubbacchi/tools/sample.txt");
               while(s1.hasNextLine()) {
                   String lineFromfile = s1.nextLine();
                   if(lineFromfile.contains(input)){
                       System.out.println("i found string in the file "+input);
                   }
               }
        }


        // 1. argument parsing  "grep <-n> search_str filename"
        // 2. argument validation
        // 3. reading file line-by-line and and searching for string
    }


    // 1. remove hello world statements
    // 2. use buffered reader instead of scanner to read file
    // 3. print line numbers
    // 4. Get search string from command line instead of scanner

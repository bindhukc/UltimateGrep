package com.gubbacchi.tools;

import java.io.*;

/**
 * Created by bindhukc on 2/27/17.
 */
public class UltimateGrep {
    public static void main(String[] args) {
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
                System.out.println(line);
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
            //try {
               // b.close();
                //fis.close();
                System.out.println("Everything is fine");
            //}
           // catch (IOException ex2){
                //System.out.println("exception");
            //}
        }
        // 1. argument parsing  "grep <-n> search_str filename"
        // 2. argument validation
        // 3. reading file line-by-line and and searching for string
    }
}

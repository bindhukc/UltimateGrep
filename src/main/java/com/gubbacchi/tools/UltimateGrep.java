package com.gubbacchi.tools;

import java.io.*;
import java.util.Scanner;

/**
 * Created by bindhukc on 2/27/17.
 */
public class UltimateGrep {
    public static void main(String[] args) throws IOException {
        //System.out.println("Arg 1 : " + args[0]);
        //System.out.println("Arg 2 : " + args[1]);
        FileInputStream fis = null;
        BufferedReader b = null;
        System.out.println("enter the string you want to search in a file");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("the input string is  "+ input);
        int linenum = 0;
        int flag = 0;
        fis = new FileInputStream("/Users/bindhukc/code/UltimateGrep/src/main/java/com/gubbacchi/tools/sample.txt");
        b = new BufferedReader(new InputStreamReader(fis));
        String lineFromfile = b.readLine();
        while(lineFromfile != null ) {
            linenum = linenum + 1;
            if(lineFromfile.contains(input) && lineFromfile.equalsIgnoreCase(input)){
                System.out.println("i found string ::  "+input+"  present in the lines "+linenum);
                flag = 1;
            }

            lineFromfile = b.readLine();

        }
        if(flag == 0){
            System.out.println("not found");
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
// 5. implement your own contains
// 6. refactor -- split the code into multiple functions and classes
// 7. take filename from the argumentl'

// week target:
// maven
// jar
// jar vs class files
// git commands
// multiple classes -- object create, use etc.

// week 2:
// spill overs from last week
// pom.xml -- using packages
// command line argument package (library)
//


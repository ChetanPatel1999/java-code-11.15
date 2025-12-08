/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionExamples;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedUncheckedExample {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("main method is start...");

        FileReader f1 = new FileReader("abc.txt");

    }
}

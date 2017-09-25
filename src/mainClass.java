
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wirasinee
 */
public class mainClass {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("input FileName :"); //cap41.txt
        String FileName = in.next();
        actionFiles fileClass = new actionFiles();
        ArrayList<Double> al = fileClass.readFile(FileName);
        int n = al.get(0).intValue();
        int m = al.get(1).intValue();
        
       
       
       
        
        
    }
    
    
}


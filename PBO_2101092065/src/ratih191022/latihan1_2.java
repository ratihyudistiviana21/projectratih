/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratih191022;

/**
 *
 * @author Asus
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan1_2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        int grade = 0;
        
        try {
            System.out.print("Masukkan Nilai Anda : ");
            grade = Integer.parseInt(dataIn.readLine());
        }
        catch (IOException e) {
            System.out.println("Error !");
        }
        
        if (grade >= 90){
            System.out.println("Excellent!");
        }
        else if ((grade < 90) && (grade >= 80)){
            System.out.println("Good Job!");
        }
        else if ((grade < 80) && (grade >= 60)){
            System.out.println("Study harder!");
        }
        else{
            System.out.println("Sorry, you failed!");
        }
    }
}


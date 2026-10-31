/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/**
 *
 * @author User
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Name: Sharrmini");
        System.out.println("Student ID: S88359 ");
        
        int mark1 = 48;
        int mark2 = 42;
        int total = mark1 + mark2 ;
        
        System.out.println("Total work : " + total);
        
        if (total >= 80) {
            System.out.println("Result: Excellent");
        } else if (total >= 60) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
            
        }
    }
    
}

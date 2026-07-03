/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.question4;

/**
 *
 * @author DELL
 */
public class WhileLoop {
    // Loop continues as long as the counter condition stays true
     public static void main(String[] args) {
        System.out.println("--- Starting Sensor Data Reading ---");
     int dayCounter = 1; 
     while (dayCounter <= 30) {
    double rainfall = 12.5; // Dummy sensor data reading
    System.out.println("Day " + dayCounter + " Rainfall: " + rainfall + " mm");
    dayCounter++; // Must manually update inside the body to prevent infinite loop
}

    
     }
     
}

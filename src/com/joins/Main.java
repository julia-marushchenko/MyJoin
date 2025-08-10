// Java program to practice join() method

package com.joins;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating string for modification
        String str = "Berlin";

        // Using join() with delimiter und element to connect
        // Printing new string to console
        System.out.println(String.join(", ", str, "Paris", " Kyiv", "Cairo", "London"));
    }
}
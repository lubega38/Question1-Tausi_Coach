/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question3part2;

/**
 *
 * @author ST.EDWARDS
 */
public class Question3part2 {

    public static void main(String[] args) {
        int totalDistance = 10000; // Total distance from Kampala to Kabale
        int speedKmPerHour = 250; // Speed of the train in Km/hr
        int timePerStopMinutes = 5; // Time per stop in minutes

        // Calculate total travel time in hours
        double travelTimeHours = (double) totalDistance / speedKmPerHour;

        // Calculate total stops
        int totalStops = (totalDistance / 150) + (totalDistance / 200) - (totalDistance / 300);
        double stopTimeHours = totalStops * (timePerStopMinutes / 60.0);

        double totalTimeHours = travelTimeHours + stopTimeHours;

        System.out.println("Total time to travel from Kampala to Kabale: " + totalTimeHours + " hours");
    }
}

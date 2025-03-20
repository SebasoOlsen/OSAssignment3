package com.example;

import java.util.Arrays;

public class FCFSHospital implements HospitalSimulation{

    // the patients of the hospital.
    Patient[] patients;
    // this represent the current time at any given moment
    int currentTime = 0;
    // this is the total time a patient has to wait before i gets treated
    int totalWaitingTime = 0;
    // This is  the total time from arrival to fully helped
    int totalTurnaroundTime = 0;
    

    /**
     * Arranges the patients of the hospital based on arrival time
     */
    public void arrangeSchedule(){
        Arrays.sort(this.patients, (a,b) -> a.getArrivalTime() - b.getArrivalTime());
    }

    @Override
    public void runHospitalSimulation(){
        // If the hospital is "ahead of schedule", 
        // we jump to next patient instead of waiting for their planned arrival time.
        for (Patient p : patients){
            if (this.currentTime < p.getArrivalTime()){
                this.currentTime = p.getArrivalTime();
            }

            // Calculate the waiting time
            p.setWaitingTime(currentTime - p.getArrivalTime());

            // Calculate turnaround time
            p.setTurnaroundTime(p.getWaitingTime() + p.getBurstTime());

            // Update the total waiting and turnaround times
            totalWaitingTime += p.getWaitingTime();
            totalTurnaroundTime += p.getTurnaroundTime();

            //farward the time used on this patient.
            currentTime += p.getBurstTime();
        }
        
        // Print Average Times
        System.out.println("FCFS - Average Waiting Time: " + (double) totalWaitingTime / patients.length);
        System.out.println("FCFS - Average Turnaround Time: " + (double) totalTurnaroundTime / patients.length);

    }

    @Override
    public void setPatients(Patient[] newPatients){
        this.patients = newPatients;
    }
}

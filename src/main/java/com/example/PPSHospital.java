package com.example;
public class PPSHospital implements HospitalSimulation {

    // the patients of the hospital.
    Patient[] patients;
    // this represent the current time at any given moment
    int currentTime = 0;
    // this is the total time a patient has to wait before i gets treated
    int totalWaitingTime = 0;
    // This is  the total time from arrival to fully helped
    int totalTurnaroundTime = 0;

    @Override
    public void setPatients(Patient[] newPatients){
        this.patients = newPatients;
    }

    @Override
    public void runHospitalSimulation() {
        int n = patients.length;
        int[] remainingTime = new int[n];
        boolean[] isCompleted = new boolean[n];
        int completed = 0;

        // Copy burst times into remainingTime
        for (int i = 0; i < n; i++) {
            remainingTime[i] = patients[i].getBurstTime();
        }

        while (completed != n) {
            int idx = -1;
            int highestPriority = Integer.MAX_VALUE;

            // Find prosess with the highest priority
            for (int i = 0; i < n; i++) {
                if (patients[i].getArrivalTime() <= currentTime &&
                        !isCompleted[i] && patients[i].getPriority() < highestPriority &&
                        remainingTime[i] > 0) {highestPriority = patients[i].getPriority();
                    idx = i;
                }
            }

            if (idx != -1) {
                // Runs process for 1 unit
                remainingTime[idx]--;
                currentTime++;

                // If the process is completed (the patient treated)
                if (remainingTime[idx] == 0) {
                    isCompleted[idx] = true;
                    completed++;

                    int turnaroundTime = currentTime - patients[idx].getArrivalTime();
                    int waitingTime = turnaroundTime - patients[idx].getBurstTime();

                    patients[idx].setTurnaroundTime(turnaroundTime);
                    patients[idx].setWaitingTime(waitingTime);

                    totalTurnaroundTime += turnaroundTime;
                    totalWaitingTime += waitingTime;
                }
            } else {
                // No process is available run for 1 unit
                currentTime++;
            }
        }
    }
}

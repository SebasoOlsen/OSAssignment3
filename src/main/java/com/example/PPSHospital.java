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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'runHospitalSimulation'");
    }

}

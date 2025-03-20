package com.example;
/**
 * The Patient class represents a patient with specific attributes such as 
 * id, arrival time, burst time, priority, waiting time, and turnaround time.
 */
public class Patient {

    private int id;
    private int arrivalTime;
    private int burstTime;
    private int priority;
    private int waitingTime;
    private int turnaroundTime;

    /**
     * Constructs a new Patient with the specified id, arrival time, burst time, and priority.
     *
     * @param id the unique identifier for the patient
     * @param arrivalTime the time at which the patient arrives
     * @param burstTime the burst time required by the patient
     * @param priority the priority level of the patient
     */
    public Patient(int id, int arrivalTime, int burstTime, int priority) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.priority = priority;
    }

    /**
     * Returns the unique identifier for the patient.
     *
     * @return the id of the patient
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the time at which the patient arrives.
     *
     * @return the arrival time of the patient
     */
    public int getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Returns the burst time required by the patient.
     *
     * @return the burst time of the patient
     */
    public int getBurstTime() {
        return burstTime;
    }

    /**
     * Returns the priority level of the patient.
     *
     * @return the priority of the patient
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Returns the waiting time of the patient.
     *
     * @return the waiting time of the patient
     */
    public int getWaitingTime() {
        return waitingTime;
    }

    /**
     * Sets the waiting time of the patient.
     *
     * @param newTime the new waiting time of the patient
     */
    public void setWaitingTime(int newTime) {
        this.waitingTime = newTime;
    }

    /**
     * Returns the turnaround time of the patient.
     *
     * @return the turnaround time of the patient
     */
    public int getTurnaroundTime() {
        return turnaroundTime;
    }

    /**
     * Sets the turnaround time of the patient.
     *
     * @param newTime the new turnaround time of the patient
     */
    public void setTurnaroundTime(int newTime) {
        this.turnaroundTime = newTime;
    }
}

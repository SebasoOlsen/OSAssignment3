package com.example;

/**
 * Responsible for setting up and running the hospital simulation.
 */
public class App {


    private HospitalSimulation simulation;

    /**
     * Constructs an App instance and sets up the hospital simulation.
     */
    public App() {
        this.simulation = new FCFSHospital();
        //this.simulation = new PPSHospital();
        this.setUpSimulation(simulation);
    }

    /**
     * The main method to run the application.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        App app = new App();
        app.runSimulation();
    }

    /**
     * Creates an array of patients for the simulation.
     *
     * @return An array of Patient objects.
     */
    private Patient[] createPatients() {
        return new Patient[]{
            new Patient(1, 0, 5, 2),
            new Patient(2, 1, 3, 1),
            new Patient(3, 2, 8, 3),
            new Patient(4, 3, 6, 2),
            new Patient(5, 4, 4, 1)
        };
    }

    /**
     * Sets up the hospital simulation with the created patients.
     *
     * @param simulation The HospitalSimulation instance to set up.
     */
    private void setUpSimulation(HospitalSimulation simulation) {
        this.simulation.setPatients(this.createPatients());
    }

    /**
     * Runs the hospital simulation.
     */
    private void runSimulation() {
        this.simulation.runHospitalSimulation();
    }
}
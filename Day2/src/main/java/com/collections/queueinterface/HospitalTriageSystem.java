package com.collections.queueinterface;

import java.util.Comparator;
import java.util.PriorityQueue;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}
class SeverityComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        return Integer.compare(p2.severity, p1.severity); // Higher severity first
    }
}
class TriageSystem {
    private PriorityQueue<Patient> queue;

    public TriageSystem() {
        this.queue = new PriorityQueue<>(new SeverityComparator());
    }

    public void addPatient(String name, int severity) {
        queue.add(new Patient(name, severity));
    }

    public void processPatients() {

        while (!queue.isEmpty()) {
            Patient patient = queue.poll();
            System.out.print(patient.name);
            if (!queue.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}
public class HospitalTriageSystem {

    public static void main(String[] args) {
        TriageSystem triage = new TriageSystem();

        // Adding patients
        triage.addPatient("John", 3);
        triage.addPatient("Alice", 5);
        triage.addPatient("Bob", 2);

        // Processing patients

        System.out.println("Order of treatment:");
        triage.processPatients();
    }
}

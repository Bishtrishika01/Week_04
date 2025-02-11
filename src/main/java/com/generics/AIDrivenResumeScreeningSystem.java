/*5. AI-Driven Resume Screening System
Concepts: Generic Classes, Generic Methods, Bounded Type Parameters, Wildcards
Problem Statement:
Develop an AI-Driven Resume Screening System that can process resumes for different job roles like Software Engineer, Data Scientist, and Product Manager while ensuring type safety.
Hints:
Create an abstract class JobRole (SoftwareEngineer, DataScientist, ProductManager).
Implement a generic class Resume<T extends JobRole> to process resumes dynamically.
Use a wildcard method (List<? extends JobRole>) to handle multiple job roles in the screening pipeline.*/
package com.generics;


import java.util.ArrayList;
import java.util.List;


// Abstract class for different job roles
abstract class JobRole {
    private String candidateName;
    private int experienceYears;


    public JobRole(String candidateName, int experienceYears) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
    }


    public String getCandidateName() {
        return candidateName;
    }


    public int getExperienceYears() {
        return experienceYears;
    }


    public abstract void displayResume();
}


// Software Engineer Role
class SoftwareEngineer extends JobRole {
    private String programmingLanguage;


    public SoftwareEngineer(String candidateName, int experienceYears, String programmingLanguage) {
        super(candidateName, experienceYears);
        this.programmingLanguage = programmingLanguage;
    }


    @Override
    public void displayResume() {
        System.out.println("Software Engineer: " + getCandidateName() +
                " | Experience: " + getExperienceYears() + " years" +
                " | Language: " + programmingLanguage);
    }
}


// Data Scientist Role
class DataScientist extends JobRole {
    private String tool;


    public DataScientist(String candidateName, int experienceYears, String tool) {
        super(candidateName, experienceYears);
        this.tool = tool;
    }


    @Override
    public void displayResume() {
        System.out.println("Data Scientist: " + getCandidateName() +
                " | Experience: " + getExperienceYears() + " years" +
                " | Tool: " + tool);
    }
}


// Product Manager Role
class ProductManager extends JobRole {
    private int projectsManaged;


    public ProductManager(String candidateName, int experienceYears, int projectsManaged) {
        super(candidateName, experienceYears);
        this.projectsManaged = projectsManaged;
    }


    @Override
    public void displayResume() {
        System.out.println("Product Manager: " + getCandidateName() +
                " | Experience: " + getExperienceYears() + " years" +
                " | Projects: " + projectsManaged);
    }
}


// Generic Resume Processing Class
class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();


    public void addResume(T resume) {
        resumes.add(resume);
    }


    public void displayAllResumes() {
        for (T resume : resumes) {
            resume.displayResume();
        }
    }
}


// Utility Class to Process Resumes Using Wildcards
class ResumeUtility {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.displayResume();
        }
    }
}


public class AIDrivenResumeScreeningSystem {
    public static void main(String[] args) {
        // Creating resume lists
        Resume<SoftwareEngineer> seResumes = new Resume<>();
        Resume<DataScientist> dsResumes = new Resume<>();
        Resume<ProductManager> pmResumes = new Resume<>();


        // Adding candidates
        seResumes.addResume(new SoftwareEngineer("Pratham Raj", 5, "Java"));
        seResumes.addResume(new SoftwareEngineer("Suraj Kumar Patel", 3, "Python"));


        dsResumes.addResume(new DataScientist("Vivek Sahu", 4, "TensorFlow"));
        dsResumes.addResume(new DataScientist("Rishika Bisht", 2, "R"));


        pmResumes.addResume(new ProductManager("Muskan Kumari", 6, 10));
        pmResumes.addResume(new ProductManager("Rahul", 8, 15));


        // Displaying resumes per role
        System.out.println("=== Software Engineer Resumes ===");
        seResumes.displayAllResumes();


        System.out.println("\n=== Data Scientist Resumes ===");
        dsResumes.displayAllResumes();


        System.out.println("\n=== Product Manager Resumes ===");
        pmResumes.displayAllResumes();


        // Using wildcard method to process all resumes
        System.out.println("\n=== Processing All Resumes with Utility Method ===");
        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(new SoftwareEngineer("Suresh Gupta", 7, "C++"));
        allResumes.add(new DataScientist("Pooja Malhotra", 5, "SQL"));
        allResumes.add(new ProductManager("Ravi Shankar", 10, 20));


        ResumeUtility.processResumes(allResumes);
    }
}


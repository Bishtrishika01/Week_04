package com.annotation.practiceproblems.customannotations.beginnerlevel.pendingtasks;

public class ProjectTasks {
    //Marking method with a pending feature
    @Todo(task = "Implement user authentication", assignedTo = "Saurabh", priority = "HIGH")
    public void userAuthentication() {
        System.out.println("Pending: Implement user authentication");
    }

    //Marking another method with a pending feature
    @Todo(task = "Optimize database queries", assignedTo = "Rohit")
    public void optimizeDatabase() {
        System.out.println("Pending: Optimize database queries");
    }
}
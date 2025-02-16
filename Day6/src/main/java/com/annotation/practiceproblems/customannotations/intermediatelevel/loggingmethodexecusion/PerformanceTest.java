package com.annotation.practiceproblems.customannotations.intermediatelevel.loggingmethodexecusion;

public class PerformanceTest {
    //Applying annotation to measure execution time
    @LogExecutionTime
    public void processData() {
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++);
        //Simulating processing
        long endTime = System.nanoTime();
        System.out.println("Execution Time: " + (endTime - startTime) + " ns");
    }

    //Applying annotation to another method
    @LogExecutionTime
    public void fetchData() {
        long startTime = System.nanoTime();
        try {
            Thread.sleep(10);
            //Simulating data fetch delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        System.out.println("Execution Time: " + (endTime - startTime) + " ns");
    }
}

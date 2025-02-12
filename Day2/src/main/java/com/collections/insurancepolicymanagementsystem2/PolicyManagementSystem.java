package com.collections.insurancepolicymanagementsystem2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Policy {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    // Constructor
    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // Getters
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "PolicyNumber: " + policyNumber +
                ", Holder: " + policyholderName +
                ", ExpiryDate: " + sdf.format(expiryDate) +
                ", CoverageType: " + coverageType +
                ", Premium: " + premiumAmount;
    }
}
public class PolicyManagementSystem {
     Map<String, Policy> hashMap;
    private Map<String, Policy> linkedHashMap;
    private TreeMap<Date, Policy> treeMap;

    public PolicyManagementSystem() {
        this.hashMap = new HashMap<>();
        this.linkedHashMap = new LinkedHashMap<>();
        this.treeMap = new TreeMap<>();
    }

    // Add a policy to all data structures
    public void addPolicy(Policy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);
        treeMap.put(policy.getExpiryDate(), policy);
    }

    // Retrieve a policy by its number
    public Policy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    // List all policies expiring within the next 30 days
    public List<Policy> getExpiringPolicies() {
        List<Policy> expiringPolicies = new ArrayList<>();
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date next30Days = calendar.getTime();

        for (Date expiryDate : treeMap.keySet()) {
            if (expiryDate.after(currentDate) && expiryDate.before(next30Days)) {
                expiringPolicies.add(treeMap.get(expiryDate));
            }
        }
        return expiringPolicies;
    }

    // List all policies for a specific policyholder
    public List<Policy> getPoliciesByHolder(String policyholderName) {
        List<Policy> policies = new ArrayList<>();
        for (Policy policy : hashMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        Date currentDate = new Date();
        Iterator<Map.Entry<Date, Policy>> iterator = treeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Date, Policy> entry = iterator.next();
            if (entry.getKey().before(currentDate)) {
                String policyNumber = entry.getValue().getPolicyNumber();
                iterator.remove();
                hashMap.remove(policyNumber);
                linkedHashMap.remove(policyNumber);
            }
        }
    }

    // Display all policies
    public void displayPolicies(Map<String, Policy> map) {
        for (Policy policy : map.values()) {
            System.out.println(policy);
        }
    }

    public void displayTreeMapPolicies() {
        for (Policy policy : treeMap.values()) {
            System.out.println(policy);
        }
    }
    public static void main(String[] args) throws ParseException {
        PolicyManagementSystem system = new PolicyManagementSystem();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Sample policies
        Policy policy1 = new Policy("P001", "John Doe", sdf.parse("2025-03-01"), "Health", 5000);
        Policy policy2 = new Policy("P002", "Jane Smith", sdf.parse("2025-02-25"), "Auto", 3000);
        Policy policy3 = new Policy("P003", "Alice Brown", sdf.parse("2025-01-15"), "Home", 7000);

        // Add policies
        system.addPolicy(policy1);
        system.addPolicy(policy2);
        system.addPolicy(policy3);

        // Display all policies
        System.out.println("All Policies (HashMap):");
        system.displayPolicies(system.hashMap);

        System.out.println("\nPolicies Expiring in 30 Days:");
        List<Policy> expiring = system.getExpiringPolicies();
        expiring.forEach(System.out::println);

        System.out.println("\nPolicies for 'John Doe':");
        List<Policy> johnPolicies = system.getPoliciesByHolder("John Doe");
        johnPolicies.forEach(System.out::println);

        // Remove expired policies
        system.removeExpiredPolicies();
        System.out.println("\nAfter Removing Expired Policies (TreeMap):");
        system.displayTreeMapPolicies();
    }
}

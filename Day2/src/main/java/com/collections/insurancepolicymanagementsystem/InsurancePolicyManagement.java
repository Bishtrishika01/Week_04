/*Insurance Policy Management System

Each policy has the following attributes:
● Policy Number (unique identifier)
● Policyholder Name
● Expiry Date
● Coverage Type (e.g., Health, Auto, Home)
● Premium Amount

Requirements:
1. Store Unique Policies: Implement methods to store policies using different
types of sets (HashSet, LinkedHashSet, TreeSet), each serving different
purposes:
 HashSet for quick lookups.
 LinkedHashSet to maintain the order of insertion.
 TreeSet to maintain policies sorted by expiry date.

2. Retrieve Policies: Implement methods to retrieve and display policies based on
certain criteria:
 All unique policies.
 Policies expiring soon (within the next 30 days
 Policies with a specific coverage type.
 Duplicate policies based on policy numbers.

3. Performance Comparison: Compare the performance of HashSet,
LinkedHashSet, and TreeSet in terms of adding, removing, and searching for
policies.
*/
package com.collections.insurancepolicymanagementsystem;

import java.util.*;

class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public Date getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Policy policy = (Policy) obj;
        return Objects.equals(policyNumber, policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType='" + coverageType + '\'' +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}

public class InsurancePolicyManagement {
    private Set<Policy> policyHashSet = new HashSet<>();
    private Set<Policy> policyLinkedHashSet = new LinkedHashSet<>();
    private Set<Policy> policyTreeSet = new TreeSet<>();

    public void addPolicy(Policy policy) {
        policyHashSet.add(policy);
        policyLinkedHashSet.add(policy);
        policyTreeSet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("All Policies (HashSet): " + policyHashSet);
        System.out.println("All Policies (LinkedHashSet - Order Preserved): " + policyLinkedHashSet);
        System.out.println("All Policies (TreeSet - Sorted by Expiry Date): " + policyTreeSet);
    }

    public void displayExpiringSoon(int days) {
        Date currentDate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        cal.add(Calendar.DAY_OF_YEAR, days);
        Date thresholdDate = cal.getTime();

        System.out.println("Policies Expiring Soon:");
        for (Policy policy : policyTreeSet) {
            if (!policy.getExpiryDate().after(thresholdDate)) {
                System.out.println(policy);
            }
        }
    }

    public void displayByCoverageType(String coverageType) {
        System.out.println("Policies with Coverage Type: " + coverageType);
        for (Policy policy : policyHashSet) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        }
    }

    public void displayDuplicates() {
        Set<String> seen = new HashSet<>();
        Set<Policy> duplicates = new HashSet<>();

        for (Policy policy : policyHashSet) {
            if (!seen.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }

        System.out.println("Duplicate Policies: " + duplicates);
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 10);
        Date expiry1 = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, 15);
        Date expiry2 = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, 40);
        Date expiry3 = cal.getTime();

        Policy p1 = new Policy("P1001", "John Doe", expiry1, "Health", 500.0);

        Policy p2 = new Policy("P1002", "Jane Smith", expiry2, "Auto", 700.0);
        Policy p3 = new Policy("P1003", "Alice Brown", expiry3, "Home", 1000.0);
        Policy p4 = new Policy("P1001", "John Doe", expiry1, "Health", 500.0); // Duplicate

        system.addPolicy(p1);
        system.addPolicy(p2);
        system.addPolicy(p3);
        system.addPolicy(p4);

        system.displayAllPolicies();
        system.displayExpiringSoon(30);
        system.displayByCoverageType("Health");
        system.displayDuplicates();
    }
}

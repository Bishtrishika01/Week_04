//Design a Voting System
//Description: Design a system where:
//Votes are stored in a HashMap (Candidate -> Votes).
//TreeMap is used to display the results in sorted order.
//LinkedHashMap is used to maintain the order of votes.

package com.collections.votingsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class VotingOperations {
    // Stores candidate votes
    private HashMap<String, Integer> voteMap;
    // Maintains vote order
    private LinkedHashMap<String, Integer> voteOrder;

    public VotingOperations() {
        voteMap = new HashMap<>();
        voteOrder = new LinkedHashMap<>();
    }

    public void vote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteMap.get(candidate));
    }
    //method to display get voting map
    public HashMap<String, Integer> getVoteMap() {
        return voteMap;
    }
    //method to get voting order
    public LinkedHashMap<String, Integer> getVoteOrder() {
        return voteOrder;
    }
}
class VoteDisplay{
    public static void displayResults(HashMap<String, Integer> voteMap) {
        TreeMap<String, Integer> sortedVotes = new TreeMap<>(voteMap);

        System.out.println("Election Results:");
        for (Map.Entry<String, Integer> entry : sortedVotes.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
public class VotingSystem {
    public static void main(String[] args) {
        VotingOperations ope = new VotingOperations();
        ope.vote("Alice");
        ope.vote("Bob");
        ope.vote("Alice");

        VoteDisplay.displayResults(ope.getVoteMap());
    }
}
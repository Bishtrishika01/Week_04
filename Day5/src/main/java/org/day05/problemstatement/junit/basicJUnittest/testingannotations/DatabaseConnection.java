package org.day05.problemstatement.junit.basicJUnittest.testingannotations;

public class DatabaseConnection {
    public boolean isConnected=false;
    public void connect(){
        isConnected=true;
        System.out.println("connected");
    }
    public  void disConnect(){
        System.out.println("disConnected");
    }
    public boolean isConnected() {
        return isConnected;
    }
}

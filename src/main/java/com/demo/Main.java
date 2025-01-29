package com.demo;


public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Now we start the gRPC server:");
            new RunChartServer().start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Now we start the gRPC client:");
        var client = new RunChartClient();
        var measurement = client.getSnapShot();
        System.out.println(measurement);
    }
}
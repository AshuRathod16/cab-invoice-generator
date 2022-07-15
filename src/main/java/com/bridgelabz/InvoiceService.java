package com.bridgelabz;


public class InvoiceService {
    private static final double COST_PER_KM = 10;
    private static final double COST_PER_MIN = 1;

    public double calculateFare(double distance, int time) {

        return distance * COST_PER_KM + time * COST_PER_MIN;
    }
}
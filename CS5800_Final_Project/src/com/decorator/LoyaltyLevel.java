package com.decorator;

public enum LoyaltyLevel {
    SILVER(0.95), // 5% discount
    GOLD(0.9), // 10% discount
    PLATINUM(0.85); // 15% discount

    private final double discountRate;

    LoyaltyLevel(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }
}

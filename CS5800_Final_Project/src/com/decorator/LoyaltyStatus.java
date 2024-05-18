package com.decorator;

public class LoyaltyStatus {
    private LoyaltyLevel loyaltyLevel;

    public LoyaltyStatus(LoyaltyLevel loyaltyLevel) {
        this.loyaltyLevel = loyaltyLevel;
    }

    public double applyDiscount(double totalCost) {
        return totalCost * loyaltyLevel.getDiscountRate();
    }
}

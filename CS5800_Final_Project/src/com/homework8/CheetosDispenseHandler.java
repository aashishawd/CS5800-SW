package com.homework8;

public class CheetosDispenseHandler extends SnackDispenseHandler {

    public CheetosDispenseHandler(SnackDispenseHandler handler){
        super(handler);
    }

    @Override
    public void dispenseSnack(Snack snack, int quantity){
        if(snack.getSnackName().equalsIgnoreCase("cheetos")){
            System.out.printf("Here is your %s%n", snack.getSnackName());
            System.out.printf("Thank you for your order. Please come again.\n");
            snack.setSnackQuantity(snack.getSnackQuantity() - quantity);
        }else{
            super.dispenseSnack(snack, quantity);
        }
    }
}

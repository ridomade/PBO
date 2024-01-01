package model;

public class manajer extends employee implements payment {
    String salary;

    @Override
    public void addPayment() {
        // Implementasi pembayaran untuk manajer
        this.salary =  String.valueOf(CONSTANT_PAYMENT_MANAGER);
    }
    
    public String getSalary(){
       return this.salary;
    }

}

package model;

public class worker extends employee implements payment {  
  
   String salary;
    

    @Override
   public void addPayment() {
        // Implementasi pembayaran untuk pekerja
        this.salary =  String.valueOf(CONSTANT_PAYMENT_WORKER);
    }
   
   public String getSalary(){
       return this.salary;
   }
}
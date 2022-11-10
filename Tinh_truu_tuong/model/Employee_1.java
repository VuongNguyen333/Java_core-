package model;

public abstract class Employee_1 implements IEmployee{
   private String name;
   private int paymentPerHour;

   public Employee_1(String name, int paymentPerHour) {
      this.name = name;
      this.paymentPerHour = paymentPerHour;
   }
   @Override
   public String getName(){
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }

   public int getPaymentPerHour() {
      return paymentPerHour;
   }

   public void setPaymentPerHour(int paymentPerHour) {
      this.paymentPerHour = paymentPerHour;
   }

}

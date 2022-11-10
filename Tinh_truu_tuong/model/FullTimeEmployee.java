package model;

public class FullTimeEmployee extends Employee_1{

   public FullTimeEmployee(String name, int paymentPerHour) {
      super(name, paymentPerHour);
   }
   @Override
   public int calculateSalary(){
      return 8 * getPaymentPerHour();
   }
}

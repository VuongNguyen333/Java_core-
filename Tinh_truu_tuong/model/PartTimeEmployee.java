package model;

public class PartTimeEmployee extends Employee_1{
   private int workingHours;
   public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
      super(name, paymentPerHour);
      this.workingHours = workingHours;
   }
   @Override
   public int calculateSalary(){
      return workingHours * getPaymentPerHour();
   }
}

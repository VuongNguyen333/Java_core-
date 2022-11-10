package model;

public class Manager extends Employee{
   private int bonus;

   public Manager(String name, int salary, int bonus) {
      super(name, salary);
      this.bonus=bonus;
   }

   @Override
   public int getSalary() {
      int i = super.getSalary() + this.bonus;
      return i;
   }

   public int getBonus() {
      return bonus;
   }

   public void setBonus(int bonus) {
      this.bonus = bonus;
   }

   @Override
   public void display(){
      System.out.println("Name: " + getName());
      System.out.println("Salary: " + getSalary());
   }
}

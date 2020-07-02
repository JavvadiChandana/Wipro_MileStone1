package com.wipro.Inheritance;

class GetSet extends Employee{
GetSet(String VariableName){
 this.name=VariableName;
 
}
GetSet(double AnnualSal, int year,String InsuranceNum){
 this.AnnualSalary=AnnualSal;
 this.StartedYear=year;
 this.InsuranceNumber=InsuranceNum;
}
 void getPerson() {
  System.out.println("Member variable name: "+name);
 }
 void getEmp() {
  System.out.println("Annual Salary is : "+AnnualSalary);
  System.out.println("year the employee started to work : "+StartedYear);
  System.out.println("The National insurance number : "+InsuranceNumber);
 }
 
 
}
 public class TestEmployee {
  public static void main(String args[]) {
   GetSet gs1=new GetSet("Chandana");
   GetSet gs2=new GetSet(100000, 2021, "40317");
   gs1.getPerson();
   gs2.getEmp();
  }

}
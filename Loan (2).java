import java.util.*;
class Example{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.println("-------------------------------------------------------------------------------------------------------");
System.out.println("                                     SALARY IFORMATION SYSTEM");
System.out.println("-------------------------------------------------------------------------------------------------------");
System.out.println("             [1] Calculate Income Tax");
System.out.println("             [2] Calculate Annual Bonus");
System.out.println("             [3] Calculate loan Amount");
System.out.print("Enter an Option to Continue ->");
int option =input.nextInt();
if(option==1){
System.out.println("-------------------------------------------------------------------------------------------------------");
System.out.println("                                     Calculate Income Tax");
System.out.println("-------------------------------------------------------------------------------------------------------");
System.out.print("Input Employee name   -");
String name =input.next();
System.out.print("Input Employee salary -");
int salary =input.nextInt();
double tax=0;
if(salary>100000 && salary<=141667){tax = salary*0.06;}
else if(salary>141667 && salary<=183333){tax = salary*0.12;}
else if(salary>183333 && salary<=225000){tax = salary*0.18;}
else if(salary>225000 && salary<=266667){tax = salary*0.24;}
else if(salary>266667&& salary<=308333){tax = salary*0.3;}
else if(salary>308333 ){tax = salary*0.36;}
System.out.println("\n\n\nYou have to pay income tax per month : "+tax);
}
if(option==2){
System.out.println("-------------------------------------------------------------------------------------------------------");
System.out.println("                                     Calculate Annual Bonus");
System.out.println("-------------------------------------------------------------------------------------------------------");
System.out.print("Input Employee name   -");
String name =input.next();
System.out.print("Input Employee salary -");
int salary =input.nextInt();
double bonus=0;
if(salary<100000 ){bonus = 5000.00;}
else if(salary>100000 && salary<=199999){bonus = salary*0.10;}
else if(salary>=200000 && salary<=299999){bonus = salary*0.15;}
else if(salary>=300000 && salary<=399999){bonus = salary*0.20;}
else if(salary>266667&& salary<=308333){bonus = salary*0.3;}
else if(salary>=400000 ){bonus = salary*0.35;}
System.out.println("\n\n\nAnnual bonus : "+bonus);
}

if(option==3){
System.out.println("-------------------------------------------------------------------------------------------------------");
System.out.println("                                     Calculate loan Amount");
System.out.println("-------------------------------------------------------------------------------------------------------");
System.out.print("Input Employee name   -");
String name =input.next();
System.out.print("Input Employee salary -");
int salary =input.nextInt();
if(salary>50000){
	System.out.print("Enter number of year  -");
	int num_of_year =input.nextInt();
	int num_months = num_of_year*12;
	double monthly_installment =salary*0.6;
	double x =Math.pow((1+(0.15/12)),(12* num_of_year*-1));
	double loan_amount= (monthly_installment*(1-x))/(0.15/12);
	int loan =(int)loan_amount/1000;
	loan  *=1000;
	System.out.println("\n\n\nYou can get loan amount : "+loan);
}
else{
	System.out.print("you can not get a loan because your salary lessthan Rs.50000...");
}
}
}
}

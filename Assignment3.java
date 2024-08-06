//Problem Statement
/*
 Create Employee class hasEmp_name, Emp_id, Address, Mail_id, and Mobile_noas 
members. Inherit the classes: Programmer, Team Lead, Assistant Project Manager and Project 
Manager from employee class. Add Basic Pay (BP) as the member of all the inherited classes 
with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. 
Generate pay slips for the employees with their gross and net salary.
*/
package prac;
import java.util.*;
abstract class Empolyee{
 String name;
 int mobile=10;
 int id=6;
 String address;
 String mail_id;
 abstract void getData();
 abstract void display();
}
class Programmer extends Empolyee{
 Scanner s=new Scanner(System.in);
 double gross,net,BP, da=97, hra=10,pf=12,scf=0.1;
 @Override
 void getData() {
	 System.out.println("Enter ID of programmer: ");
	 id=s.nextInt();
	 System.out.println("Enter the name of programmer: ");
	 name=s.next();
	 System.out.println("Enter Mobile no. of programmer: ");
	 mobile= s.nextInt();
	 System.out.println("Enter Address  of programmer: ");
	 address=s.next();
	 System.out.println("Enter email id of programmer: ");
	 mail_id=s.next();
	 System.out.println("Enter Basic Pay no. of programmer: ");
	 BP= s.nextInt();
 }
 public void calulate_salary(){
 gross=BP+(BP*(da+hra))/100;
 net=gross-(BP*(pf+scf))/100;
 }
 @Override
 void display() {
	 System.out.println("----------------Programmer details--------------------");
	 System.out.println("ID of programmer: "+id);
	 System.out.println("Name of Programmer: "+name);
	 System.out.println("Mobile no. of programmer: "+mobile);
	 System.out.println("Address of programmer: "+address);
	 System.out.println("Email id of programmer: "+mail_id);
	 System.out.println("Dearness allowance of programmer: "+(BP*da)/100);
	 System.out.println("Home rent allowance of programmer :"+(BP*hra)/100);
	 System.out.println("Providant fund of programmer :"+(BP*pf)/100);
	 System.out.println("Staff club fund for programmer is "+(BP*scf)/100+"\n");
	 System.out.println("--------------------Pay slip---------------------------");
	 System.out.println("Gross Salary of programmer is "+gross);
	 System.out.println("Net salary of programmer is "+net);
	 System.out.println("--------------------------------------------------------");
 	}
}
class Team_Leader extends Empolyee{
 Scanner s=new Scanner(System.in);
 double gross,net,BP,da=97,hra=10,pf=12,scf=0.1;
 @Override
 void getData() {
	 System.out.println("Enter ID of Team Leader: ");
	 id=s.nextInt();
	 System.out.println("Enter name of team leader: ");
	 name=s.next();
	 System.out.println("Enter mobile no. of team leader: ");
	 mobile=s.nextInt();
	 System.out.println("Enter Address  of team leader: ");
	 address=s.next();
	 System.out.println("Enter email id of team leader: ");
	 mail_id=s.next();
	 System.out.println("Enter basic pay number of team leader: ");
	 BP=s.nextInt();
 }
 public void calculate_salary(){
 gross=BP+(BP*(da+hra))/100;
 net=gross-(BP*(pf+scf))/100;
 }
 
 @Override
 void display() {
	 System.out.println("-----------------Team leader details--------------------");
	 System.out.println("ID of team leader: "+id);
	 System.out.println("Name of Team leader: "+name);
	 System.out.println("Mobile no. of Team leader: "+mobile);
	 System.out.println("Address of team leader: "+address);
	 System.out.println("Email id of team leader: "+mail_id);
	 System.out.println("Dearness allowance of Team leader: "+(BP*da)/100);
	 System.out.println("Home rent allowance of team leader: "+(BP*hra)/100);
	 System.out.println("Providant fund of team leader: "+(BP*pf)/100);
	 System.out.println("Staff club fund of team leader is"+(BP*scf)/100+"\n");
	 System.out.println("--------------------Pay slip---------------------------");
	 System.out.println("Gross salary of team leader: "+gross);
	 System.out.println("Net salary of team leader: "+net);
	 System.out.println("--------------------------------------------------------");
 	}
}
class Assistant_Project_Manager extends Empolyee{
Scanner s=new Scanner(System.in);
	double gross,net,BP,da=97,hra=10,pf=12,scf=0.1;
	@Override
	void getData() {
		 System.out.println("Enter ID of Assiant project manager: ");
		 id=s.nextInt();
		 System.out.println("Enter name of Assiant project manager: ");
		 name=s.next();
		 System.out.println("Enter mobile no. of Assiant project manager: ");
		 mobile=s.nextInt();
		 System.out.println("Enter Address  of Assiant project manager: ");
		 address=s.next();
		 System.out.println("Enter email id of Assiant project manager: ");
		 mail_id=s.next();
		 System.out.println("Enter basic pay number of Assiant project manager: ");
		 BP=s.nextInt();
	 }
	 public void calculate_salary(){
	 gross=BP+(BP*(da+hra))/100;
	 net=gross-(BP*(pf+scf))/100;
	 }
	 
	 @Override
	 void display() {
		 System.out.println("-----------Assiant project manager details---------------");
		 System.out.println("ID of Assiant project manager: "+id);
		 System.out.println("Name of Assiant project manager: "+name);
		 System.out.println("Mobile no. of Assiant project manager: "+mobile);
		 System.out.println("Address of Assiant project manager: "+address);
		 System.out.println("Email id of Assiant project manager: "+mail_id);
		 System.out.println("Dearness allowance of Assiant project manager:"+(BP*da)/100);
		 System.out.println("Home rent allowance of Assiant project manager: "+(BP*hra)/100);
		 System.out.println("Providant fund of Assiant project manager: "+(BP*pf)/100);
		 System.out.println("Staff club fund of Assiant project manager is"+(BP*scf)/100+"\n");
		 System.out.println("--------------------Pay slip---------------------------");
		 System.out.println("Gross salary of Assiant project manager: "+gross);
		 System.out.println("Net salary of Assiant project manager: "+net);
		 System.out.println("--------------------------------------------------------");
	 	}
}
class Project_manager extends Empolyee{
	Scanner s=new Scanner(System.in);
	double gross,net,BP,da=97,hra=10,pf=12,scf=0.1;
	@Override
	void getData() {
		 System.out.println("Enter ID of project manager: ");
		 id=s.nextInt();
		 System.out.println("Enter name of project manager: ");
		 name=s.next();
		 System.out.println("Enter mobile no. of project manager: ");
		 mobile=s.nextInt();
		 System.out.println("Enter Address  of project manager: ");
		 address=s.next();
		 System.out.println("Enter email id of project manager: ");
		 mail_id=s.next();
		 System.out.println("Enter basic pay number of project manager: ");
		 BP=s.nextInt();
	 }
	 public void calculate_salary(){
	 gross=BP+(BP*(da+hra))/100;
	 net=gross-(BP*(pf+scf))/100;
	 }
	 
	 @Override
	 void display() {
		 System.out.println("----------------Project Manager details-----------------");
		 System.out.println("ID of project manager: "+id);
		 System.out.println("Name of project manager: "+name);
		 System.out.println("Mobile no. of project manager: "+mobile);
		 System.out.println("Address of project manager: "+address);
		 System.out.println("Email id of project manager: "+mail_id);
		 System.out.println("Dearness allowance of project manager: "+(BP*da)/100);
		 System.out.println("Home rent allowance of project manager: "+(BP*hra)/100);
		 System.out.println("Providant fund of project manager: "+(BP*pf)/100);
		 System.out.println("Staff club fund of project manager is"+(BP*scf)/100+"\n");
		 System.out.println("--------------------Pay slip---------------------------");
		 System.out.println("Gross salary of project manager: "+gross);
		 System.out.println("Net salary of project manager: "+net);
		 System.out.println("--------------------------------------------------------");
	 	}
}
public class Assignment3 {
 public static void main(String[] args) {
 Programmer p=new Programmer();
 Team_Leader t=new Team_Leader();
 Assistant_Project_Manager A=new Assistant_Project_Manager();
 Project_manager M=new Project_manager();
 p.getData();
 t.getData();
 A.getData();
 M.getData();
 p.calulate_salary();
 p.display();
 t.calculate_salary();
 t.display();
 A.calculate_salary();
 A.display();
 M.calculate_salary();
 M.display();
 }
}
/*output
Enter ID of programmer: 
123
Enter the name of programmer: 
Sachin
Enter Mobile no. of programmer: 
987654312
Enter Address  of programmer: 
Moshi
Enter email id of programmer: 
sv@gmail.com
Enter Basic Pay no. of programmer: 
100000
Enter ID of Team Leader: 
321
Enter name of team leader: 
Om
Enter mobile no. of team leader: 
123456789
Enter Address  of team leader: 
Nagpur
Enter email id of team leader: 
Om@gmail.com
Enter basic pay number of team leader: 
20000
Enter ID of Assiant project manager: 
134
Enter name of Assiant project manager: 
Pravin
Enter mobile no. of Assiant project manager: 
321456789
Enter Address  of Assiant project manager: 
Mumbai
Enter email id of Assiant project manager: 
Pr@gmail.com
Enter basic pay number of Assiant project manager: 
30000
Enter ID of project manager: 
243
Enter name of project manager: 
Saurabh
Enter mobile no. of project manager: 
198273645
Enter Address  of project manager: 
UP
Enter email id of project manager: 
Sr@gmail.com
Enter basic pay number of project manager: 
100000
----------------Programmer details--------------------
ID of programmer: 123
Name of Programmer: Sachin
Mobile no. of programmer: 987654312
Address of programmer: Moshi
Email id of programmer: sv@gmail.com
Dearness allowance of programmer: 97000.0
Home rent allowance of programmer :10000.0
Providant fund of programmer :12000.0
Staff club fund for programmer is 100.0

--------------------Pay slip---------------------------
Gross Salary of programmer is 207000.0
Net salary of programmer is 194900.0
--------------------------------------------------------
-----------------Team leader details--------------------
ID of team leader: 321
Name of Team leader: Om
Mobile no. of Team leader: 123456789
Address of team leader: Nagpur
Email id of team leader: Om@gmail.com
Dearness allowance of Team leader: 19400.0
Home rent allowance of team leader: 2000.0
Providant fund of team leader: 2400.0
Staff club fund of team leader is20.0

--------------------Pay slip---------------------------
Gross salary of team leader: 41400.0
Net salary of team leader: 38980.0
--------------------------------------------------------
-----------Assiant project manager details---------------
ID of Assiant project manager: 134
Name of Assiant project manager: Pravin
Mobile no. of Assiant project manager: 321456789
Address of Assiant project manager: Mumbai
Email id of Assiant project manager: Pr@gmail.com
Dearness allowance of Assiant project manager: 29100.0
Home rent allowance of Assiant project manager: 3000.0
Providant fund of Assiant project manager: 3600.0
Staff club fund of Assiant project manager is30.0

--------------------Pay slip---------------------------
Gross salary of Assiant project manager: 62100.0
Net salary of Assiant project manager: 58470.0
--------------------------------------------------------
----------------Project Manager details-----------------
ID of project manager: 243
Name of project manager: Saurabh
Mobile no. of project manager: 198273645
Address of project manager: UP
Email id of project manager: Sr@gmail.com
Dearness allowance of project manager: 97000.0
Home rent allowance of project manager: 10000.0
Providant fund of project manager: 12000.0
Staff club fund of project manager is100.0

--------------------Pay slip---------------------------
Gross salary of project manager: 207000.0
Net salary of project manager: 194900.0
--------------------------------------------------------
*/

/*Design a base class shape with two double type values and member functions to input the data and
compute_area() for calculating area of figure. Derive two classes’ triangle and rectangle. Make
compute_area() as abstract function and redefine this function in the derived class to suit their
requirements. Write a program that accepts dimensions of triangle/rectangle and display calculated area.
Implement dynamic binding for given case study.
*/
import java.util.*;
abstract class shape{
	double dimention1,dimention2;
	abstract void inputdata();
 	abstract void compute_area();
        Scanner sc = new Scanner(System.in);
}
class triangle extends shape{
	void inputData(){
		System.out.println("enter 1st dimention :");
		dimention1 = sc.nextDouble();
		System.out.println("enter 2st dimention :");
		dimention2 = sc.nextDouble();
	}
	void compute_area(){
		double area=0.5*dimention1*dimention2;
		System.out.println(area);
	}
}
class rectangle extends shape{
	void inputData(){
		System.out.println("enter 1st dimention :");
		dimention1 = sc.nextDouble();
		System.out.println("enter 2st dimention :");
		dimention2 = sc.nextDouble();
	}
	void compute_area(){
		double area=dimention1*dimention2;
		System.out.println(area);
	}
}
public class Main2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("choice shape ");
		System.out.println("1.tringle ");
		System.out.println("2.rectangle ");
		System.out.print("ener a choice :");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				triangle t = new triangle();
				t.inputData();
				t.compute_area();
			case 2:
				rectangle r = new rectangle();
				r.inputData();
				r.compute_area();
		}
	}
}



























package leet.LinkedList1;
class Car
{
	int price;
	String name;
	
	Car(int price,String name)
	{
		this.price=price;
		this.name=name;
	}
	public void display()
	{
		System.out.println(price);
		System.out.println(name);
	}
}
public class Analogy 
{

	public static void main(String[] args) 
	{
		Car c1=new Car(1200000,"Kia");
		c1.display();
		// TODO Auto-generated method stub

	}

}

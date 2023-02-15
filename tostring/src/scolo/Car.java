package scolo;

public class Car {
	String c_color;
	 String c_name;
	String c_type;
	Car(String c_color,String c_name,String c_type)
	{
		this.c_color=c_color;
		this.c_name=c_name;
		this.c_type=c_type;
	}
public String tostring()
{
	return this.c_color;
}
public static void main(String[]args)
{
	Car c1=new Car("white","honda","petrol");
	Car c2=new Car("blk","da","petrol");
	System.out.println(c1.tostring());
}
}

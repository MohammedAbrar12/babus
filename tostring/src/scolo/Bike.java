package scolo;

public class Bike {
	String b_c;
	String b_b;
	int b_co;
	Bike(String b_c,String b_b,int b_co)
	{
		this. b_c= b_c;
		this.b_b=b_b;
		this. b_co= b_co;
     }
public String tostring()
{
	return "Mobile rate is="+ this.b_c+" \n mobile name is="+this.b_b+"\n mobile color is="+ this.b_co;
}
public static void main(String[]args)
{
	Bike m1=new Bike("ktm","honda",2000);
Bike m2=new Bike("ktm","honda",2000);
	System.out.println(m1.tostring());
}
}




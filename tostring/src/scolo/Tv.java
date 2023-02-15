package scolo;

public class Tv {
	int Tv_cost;
	String tv_brand;
	char tv_type;
	Tv(int Tv_cost,String tv_brand,char tv_type)
	{
		this.Tv_cost=Tv_cost;
		this.tv_brand=tv_brand;
		this.tv_type=tv_type;
	}
public String tostring()
{
	return "Mobile rate is="+ this.Tv_cost+" \n mobile name is="+this.tv_brand+"\n mobile color is="+ this.tv_type;
}
public static void main(String[]args)
{
	Tv m1=new Tv(2000,"hp",'c');
Tv m2=new Tv(4000,"led",'d');
	System.out.println(m1.tostring());
}
}


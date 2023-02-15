package scolo;

public class Mobile {
	int m_r;
	String m_n;
	String m_c;
	Mobile(int m_r,String m_n,String m_c)
	{
		this.m_r=m_r;
		this.m_n=m_n;
		this.m_c=m_c;
	}
public String tostring()
{
	return "Mobile rate is="+ this.m_r+" \n mobile name is="+this.m_n+"\n mobile color is="+ this.m_c;
}
public static void main(String[]args)
{
	Mobile m1=new Mobile(2000,"vivo","red");
	Mobile m2=new Mobile(2000,"vivo","red");
	System.out.println(m1.tostring());
}
}

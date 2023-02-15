package Tos;

public class School {
	String s_name;
	int  s_strength;
	char s_grade;
	School(String s_name,int s_strength,char s_grade)
	{
		this.s_grade=s_grade;
		this.s_name=s_name;
		this.s_strength=s_strength;
	}
	public String tostring()
	{
		return"school name is"+ this.s_name+"school grade is"+this.s_grade;
	}
	public static void main(String[]args)
	{
		School s1=new School("abc", 50,'a');
		System.out.println(s1);
	}

}

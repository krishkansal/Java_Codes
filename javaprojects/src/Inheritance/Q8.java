package Inheritance;

interface result
{
	void fa1();
	void fa2();
	void fa3();
	void avg();
}
class G26 implements result
{
	int fa1;
	int fa2;
	int fa3;
	public void fa1()
	{
		fa1=60;
	}
	public void fa2()
	{
		fa2=50;
	}
	public void fa3()
	{
		fa3=45;
	}
	public void avg()
	{
		int avg1=(fa1+fa2+fa3)/3;
		System.out.println("Average of G-26 is :"+avg1);
	}
	
}
class G27 implements result
{
	int fa1,fa2,fa3;
	public void fa1()
	{
		fa1=60;
	}
	public void fa2()
	{
		fa2=40;
	}
	public void fa3()
	{
		fa3=20;
	}
	public void avg()
	{
		int avg2=(fa1+fa2+fa3)/3;
		System.out.println("Average of G-27 is :"+avg2);
	}	
}


public class Q8 {

	public static void main(String[] args) {

		result res1=new G26();
		result res2=new G27();
		res1.fa1();
		res1.fa2();
		res1.fa3();
		res1.avg();
		res2.fa1();
		res2.fa2();
		res2.fa3();
		res2.avg();
	}

}

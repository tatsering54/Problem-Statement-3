class B
{
	public void testAdd(int a,int b)
	{
		System.out.println("Addition is: " +(a+b));
        }
	public void testSubtract(int a,int b)
	{
		System.out.println("Subtraction is: "+(a-b));
	}	
}
class A extends B
{
	public void testMultiply(int a,int b)
	{
		System.out.println("Multiplication is: " +(a*b));
	}
	public void testDivide(int a,int b)
	{
		System.out.println("Division is:"+(a/b));
	}
}
class C extends B
{
 
	public void testDivide(int x,int y)
	{
		if(y== 0) System.out.println("Cant divde a number with zero");
		else super.testDivde(x,y);
	}
}
class CalcTest
{
	public static void main(String[] args)
	{
		C  c = new C();
		c.testAdd(2,2);
		c.testSubtract(5,3);
		c.testMultiply(3,3);
		c.testDivide(10,0);

	}
}

//b.super.test();



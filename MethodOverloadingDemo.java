class MethodOverLoadingDemo
{
}
{

public float sum(float n1,float n2)
{
return n1 + n2;
}

public double sum(double n1,double n2,double n3)
{
return n1 + n2 + n3;
}


	public static void main(String[] args) 
	{
MethodOverLoadingDemo obj = new MethodOverLoadingDemo();

float result1 = obj.sum(10,20);
System.out.println("Result of 2 Numbers "+ result1);

double result2 = obj.sum(5,15,25);
System.out.println("Result of 3 Numbers "+ result2);



	}
}

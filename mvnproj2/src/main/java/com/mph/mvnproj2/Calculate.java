package com.mph.mvnproj2;

public class Calculate {
	public int add(int... number)
	{
		int result=0;
		for(int i: number)
		{
			result=result+i;
		}
		return result;
	}
	public int multiply(int... number)
	{
		int result=1;
		for(int i:number)
		{
			result=result*i;
		}
		return result;
	}
	public static void main(String[] args) {
		Calculate c = new Calculate();
		System.out.println(c.add(10,10));
		System.out.println(c.add(10,10,10));
		System.out.println(c.add(10,10,20,30));
		System.out.println(c.multiply(10,10,10));
	}
	public void divide() throws ArithmeticException
	{
		// TODO Auto-generated method stub
		int z=1/1;
		System.out.println(z);
	}
}

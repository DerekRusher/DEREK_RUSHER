import java.util.Scanner;

public class gpaFinalCondensed
{
	static double ph;
	static double es;
	static double sp;
	static double cs;
	static double im;
	static double el;
	static double us;
	static boolean b1;
	static boolean b2;
	static boolean b3;
	static boolean b4;
	static boolean b5;
	static boolean b6;
	static boolean b7;
	static boolean b8;
	public static void main(String[]args)
	{
		Scanner in = new Scanner(System.in);
		
		ph = printX("What is your current grade in AP Physics 1?", ph);
		es = printX("What is your current grade in ESD?", es);
		sp = printX("What is your current grade in Spanish 2?", sp);
		cs = printX("What is your current grade in AP Comp Sci?", cs);
		im = printX("What is your current grade in IM3H?", im);
		el = printX("What is your current grade in AP Eng Lang?", el);
		us = printX("What is your current grade in APUSH?", us);
		b1 = print("Do you want to see your current GPA?", b1);
		b2 = print("Do you want to see your 10th-11th grade GPA?", b2);
		b3 = print("Do you want to see your 9th-11th grade GPA?", b3);
		b4 = print("Do you want to see your 7th-11th grade GPA?", b4);
		b5 = print("Do you want to see unweighted GPA?", b5);
		b6 = print("Do you want to see weighted GPA?", b6);
		b7 = print("Do you want to see semesters averaged(v1)?", b7);
		b8 = print("Do you want to see semesters unaveraged(v2)?", b8);
		double pGPA = calcTotal(0);
		double tenerGPA = calcTotal(4 + 4 + 4 + 4 + 3.5 + 3);
		double tenerGPAVersion2 = calcTotal(4 + 4 + 4 + 4 + 3 + 3);
		double ninerGPA = calcTotal(4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3.5 + 3);
		double ninerGPAVersion2 = calcTotal(4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3 + 3);
		double sevenerGPA = calcTotal(4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3.5 + 3);
		double sevenerGPAVersion2 = calcTotal(4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 4 + 3 + 3);	
		if(b1 == true)
		{
			if(b5 == true)
				System.out.printf("Your unwieghted GPA for this year is %.1f or %f\n", (pGPA/7), (pGPA/7));
			if(b6 == true)
				System.out.printf("Your wieghted GPA is for this year is %.1f or %f\n", ((pGPA + 5)/7), ((pGPA + 5)/7));
		}
		if(b2 == true)
		{
			if(b5 == true && b7 == true)
				System.out.printf("Your unwieghted GPA for 10th-11th grade (semesters averaged) is %.1f or %f\n", (tenerGPA/13), (tenerGPA/13));
			if(b6 == true && b7 == true)
				System.out.printf("Your wieghted GPA for 10th-11th grade (semesters averaged) is %.1f or %f\n", ((tenerGPA+6)/13), ((tenerGPA+6)/13));
			if(b5 == true && b8 == true)
				System.out.printf("Your unwieghted GPA for 10th-11th grade (semesters not averaged) is %.1f or %f\n", (tenerGPAVersion2/13), (tenerGPAVersion2/13));
			if(b6 == true && b8 == true)
				System.out.printf("Your wieghted GPA for 10th-11th grade (semesters not averaged) is %.1f or %f\n", ((tenerGPAVersion2+6)/13), ((tenerGPAVersion2+6)/13));
		}
		if(b3 == true)
		{
			if(b5 == true && b7 == true)
				System.out.printf("Your unwieghted GPA for 9th-11th grade (semesters averaged) is %.1f or %f\n", (ninerGPA/19), (ninerGPA/19));
			if(b6 == true && b7 == true)
				System.out.printf("Your wieghted GPA for 9th-11th grade (semesters averaged) is %.1f or %f\n", ((ninerGPA+6)/19), ((ninerGPA+6)/19));
			if(b5 == true && b8 == true)
				System.out.printf("Your unwieghted GPA for 9th-11th grade (semesters not averaged) is %.1f or %f\n", (ninerGPAVersion2/19), (ninerGPAVersion2/19));
			if(b6 == true && b8 == true)
				System.out.printf("Your wieghted GPA for 9th-11th grade (semesters not averaged) is %.1f or %f\n", ((ninerGPAVersion2+6)/19), ((ninerGPAVersion2+6)/19));
		}
		if(b4 == true)
		{
			if(b5 == true && b7 == true)
				System.out.printf("Your unwieghted GPA for 7th-11th grade (semesters averaged) is %.1f or %f\n", (sevenerGPA/22), (sevenerGPA/22));
			if(b6 == true && b7 == true)
				System.out.printf("Your wieghted GPA for 7th-11th grade (semesters averaged) is %.1f or %f\n", ((sevenerGPA+6)/22), ((sevenerGPA+6)/22));
			if(b5 == true && b8 == true)
				System.out.printf("Your unwieghted GPA for 7th-11th grade (semesters not averaged) is %.1f or %f\n", (sevenerGPAVersion2/22), (sevenerGPAVersion2/22));
			if(b6 == true && b8 == true)
				System.out.printf("Your wieghted GPA for 7th-11th grade (semesters averaged) is %.1f or %f\n", ((sevenerGPA+6)/22), ((sevenerGPA+6)/22));
		}
		if((b5 == false && b6 == false && b7 == false && b8 == false) || (b1 == false && b2 == false && b3 == false && b4 == false))
			System.out.println("You have selected to print nothing");
	}
	
	public static double calcPoints(double z)
	{
		double one = 0.0;
		if (z >= 90)
			one = 4.0;
		else if (z >= 80)
			one = 3.0;
		else if (z >= 70)
			one = 2.0;
		else if (z >= 60)
			one = 1.0;
		else
			one = 0.0;
		return one;
	}
	
	public static double calcTotal(double lol)
	{
		return lol + calcPoints(ph) + calcPoints(es) + calcPoints(sp) + calcPoints(cs) + calcPoints(im) + calcPoints(el) + calcPoints(us);
	}
	
	public static double printX(String primera, double secunda)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(primera);
		secunda = in.nextDouble();
		return secunda;
	}
	
	public static boolean print(String first, boolean second)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(first + " \"a\" for yes and anything else for no.");
		String a = in.next();
		if(a.equals("a"))
			second = true;
		else
			second = false;
		return second;
	}
}
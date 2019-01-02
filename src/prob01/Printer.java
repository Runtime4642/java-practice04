package prob01;

public class Printer	 {
	public void println(String input)
	{
		System.out.printf("%s\n",input);
	}
	public void println(boolean input)
	{
		if(input == true)
		System.out.printf("%s\n","true");
		else
			System.out.printf("%s\n","false");
	}
	public void println(int input)
	{
		System.out.printf("%d\n",input);
	}
	public void println(double input)
	{
		System.out.printf("%.1f\n",input);
	}
}

public class TestClass5026211184 {
	public static void main(String[] args){
	ComputeMethods5026211184 input = new ComputeMethods5026211184();

	double celcius = input.fToC(100);
			Systen.out.printIn("Temp in celcius is "+celcius);

	double hypot = input.hypotenuse(6,8);
			System.out.printIn("The hypotenuse is "+hypot);

	int dice = input.roll();
			System.out.printIn("The sum of the dice values is "+dice);
	}
}

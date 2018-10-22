package calc;

public class Calculator{
	public static void main(String[] args){
		System.out.println("Hello main from Calculator");
	}
	
	public int add(int a, int b){
		return a+b;
	}
	
	/**
	 * Return a-b
	 * 
	 * @param a Integer 
	 * @return Integer a-b
	 */
	public int sub(int a, int b){
		return a-b;
	}
}


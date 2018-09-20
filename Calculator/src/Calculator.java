
public class Calculator {


public static int add(int a, int b) {
	return a+b;

}
public static int subtract (int a,int b) {
	return a-b;
}
public static int multiple (int a, int b) {
	return a *b;
}
public static  int divide (int a, int b) {
	return a/b;
}
	public static void main(String[] args) {
			
		System.out.printf("The sum result  of the two number is %d\n",add(12,16));
		System.out.printf("The subtraction result  of the two number is %d\n",subtract(30,14));
		System.out.printf("The mulipication result  of the two number is %d\n",multiple(10,5));
		System.out.printf("The division result  of the two number is %d\n",divide(25,5));

	}

}

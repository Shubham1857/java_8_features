package in.ashokit.java8;

@FunctionalInterface
interface MyInterfaceOne {
	public void m1();
}
public class MyAppOne {
	public static void main(String[] args) {
		MyInterfaceOne mi = () -> System.out.println("m1() method called ..!!");
		mi.m1();
	}
}
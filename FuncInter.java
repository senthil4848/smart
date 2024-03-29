package AdvanceJava;
@FunctionalInterface
interface A2
{
	void add();
}
@FunctionalInterface
interface B2
{
	void sub();
}
@FunctionalInterface
interface C2
{
	void mul();
}
@FunctionalInterface
interface D2
{
	void div();
}
public class FuncInter {

	public static void main(String[] args) {
		A2 ref=()->System.out.println("Adding");
		B2 ref1=()->System.out.println("Subtracting");
		C2 ref2=()->System.out.println("Multiply");
		D2 ref3=()->System.out.println("Divide");
ref.add();
ref1.sub();
ref2.mul();
ref3.div();
	}

}

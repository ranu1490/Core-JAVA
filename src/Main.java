class Main {
public static void main() {
	int a = 1;
	A aObj = new A(1);
	modify (a, aObj);
	System.out.println(a);
	System.out.println(aObj.getA());
}
private static void modify(int a, A aObj) {
	a = 2; aObj.setA(2);
}}
class A {
int a;
public A(int a) { this.a = a; }
public void setA(int a) { this.a = a; }
public int getA() { return this.a; }
	} 
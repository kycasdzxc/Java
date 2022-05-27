package a220119;

public class Prev {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		Parent p1 = new Child();
		
		System.out.println(parent.age);
		System.out.println(child.age);
		
//		System.out.println(parent.name); 불가
		System.out.println(child.name);
		
		GrandChild grandChild = new GrandChild();
		System.out.println(grandChild.age);
		System.out.println(grandChild.name);
	}
}

class Parent {
	int age;
}

class Child extends Parent {
	String name;
}

class Child2 extends Parent {
	
}

class GrandChild extends Child {
	
}
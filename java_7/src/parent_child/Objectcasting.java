package parent_child;
public class Objectcasting {
public static void main(String arg[]) {
Parent p2 = new Child();
Child c2 = (Child)p2;
c2.print();
System.out.println("Child val age : " + c2.age);
System.out.println("Child val name : " + c2.name);
System.out.println("Parent val age : " + p2.age);
System.out.println("Parent val name : " + p2.name); 
}
}
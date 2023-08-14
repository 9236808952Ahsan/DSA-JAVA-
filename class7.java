abstract class Parent 
{ 
Parent() 
{ 
System.out.println(this.hashCode()); 
} 
} 
class Child extends Parent 
{ 
Child() 
{ 
System.out.println(this.hashCode());//11394033 
} 
} 
class Test 
{ 
public static void main(String[] args) 
{ 
Child c=new Child(); 
System.out.println(c.hashCode());//11394033 
} 
}
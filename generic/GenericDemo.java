package life_coding.generic;

class EmployeeInfo {
    
	public int rank;
    
	EmployeeInfo(int rank) { this.rank = rank; }

}

class Person<T, S> {
	
  public T info;
	public S id;
    
  Person(T info, S id) { 
		this.info = info;
		this.id = id;
	}
    
}

public class GenericDemo {
	
public static void main(String[] args) {
	  Person<EmployeeInfo, Integer> person = new Person<EmployeeInfo, Integer>(new EmployeeInfo(2), new Integer(2));
	  System.out.println(person.info.rank + ", " + person.id.intValue());
  }
    
}
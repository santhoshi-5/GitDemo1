class Employee implements Comparable<Employee>{
	int id,sal;
	public Employee(int n,int s){
		id=n;
		sal=s;
	}
	public String toString(){
		return "EmpId :"+id+" Salary : "+sal;
	}
	public int compareTo(Employee e){
		if(sal==e.sal)
        	    return 0;
        	else if(sal>=e.sal)
        	    return 1;
        	else 
        	    return -1;
	}
}

class AList8{
   public static void main(String[] args){
      SortedSet<Employee> s=new TreeSet<Employee>();
      s.add(new Employee(101,10000));
      s.add(new Employee(105,40000));
      s.add(new Employee(106,20000));
      s.add(new Employee(102,30000));
      s.add(new Employee(100,50000));
      System.out.println("Employee with minimum salary: \n"+Collections.min(s));
      System.out.println("Employee with maximum salary: \n"+Collections.max(s));
      System.out.println("Employees with salary greater than 30,000 is\n"+s.tailSet(new Employee(0,30001)));
      
  }
}

public class Student {
	int id;
	String name;
	Student (int id, String name){
		this.id=id;
		this.name=name;
	}
	void print(){
        System.out.println("Id: "+id+"\nName: "+name);
   }  
	public static void main(String args[]) {
		Student obj1=new Student(1,"ram");
		Student obj2=new Student(2,"shyam");
		obj1.print();
		obj2.print();
	}
}

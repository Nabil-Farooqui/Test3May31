class Student
{
	 void student()
	
	{
		System.out.println("Student class 1---");
	}
}

class Marks extends Student
{
	 void studMarks()
	
	 {
		System.out.println("Marks class 2---");
	 }
	 
}	 
class Result extends Marks
{	 
	void studMarks()    //override
	{
	System.out.println("Override class 3---");
	}

	 public static void main(String[] args)
{
	
			Student A=new Student();
			A.student();

			System.out.println("------------");
			
			Marks obj = new Marks();
			obj.studMarks();
		//	obj.student();

			System.out.println("------------");
			
			 Result res= new Result();
			res.student();
			res.studMarks();    
			res.studMarks();   //calls child class
			System.out.println("------------");
}		
}
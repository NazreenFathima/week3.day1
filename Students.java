package week3.day1;

public class Students 
{
	public void getStudentInfo() 
	{
		// TODO Auto-generated method stub
		int studID = 3456;
		String studName = "Nazreen";
		String studEmail = "nafa@test.com";
		long studNum = 26160021;
		System.out.println("Student ID :" +studID);
		System.out.println("Student Name :" +studName);
		System.out.println("Student Email :" +studEmail);
		System.out.println("Student Number :" +studNum);
		

	}
	
	public void getStudentInfo(int id, String name) 
	{
		System.out.println("Student ID :" +id);
		System.out.println("Student name :" +name);
	}
	
	public void getStudentInfo(String email)
	{
		System.out.println("Student email ID  :" +email);
	}
	
	public void getStudentInfo(int id, long num)
	{
		System.out.println("Student ID  :" +id);
		System.out.println("Student num  :" +num);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students studObj = new Students();
		studObj.getStudentInfo();
		studObj.getStudentInfo(1234, "Nafa");
		studObj.getStudentInfo("fana@test.com");
		studObj.getStudentInfo(1234, 29098675);
		
	}

}

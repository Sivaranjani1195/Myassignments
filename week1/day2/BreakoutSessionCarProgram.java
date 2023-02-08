package week1.day2;

public class BreakoutSessionCarProgram {
	
	private static int subTwoNums;
	private static int divTwoNums;
	public static void main(String[] args) {
		BreakoutSessionCarProgram obj = new BreakoutSessionCarProgram();
		short regNum = obj.getRegNum();
		System.out.println(regNum);
		String ownerName = obj.getOwnerName();
		System.out.println(ownerName);
		obj.carModel();
		boolean punctured = obj.isPunctured();
		System.out.println(punctured);
		subTwoNums = obj.subTwoNums(5, 3);
		System.out.println(subTwoNums);
		int multiplyingThreeNums = obj.multiplyingThreeNums(2, 3, 4);
		System.out.println(multiplyingThreeNums);
		divTwoNums = obj.divTwoNums(6, 7);
		System.out.println(divTwoNums);
	}
	
	public short getRegNum() 
	{
		short regNo = 1234;
		return regNo;

	}
	private String getOwnerName()
	{
		String name = "Sivaranjani";
		return name;
	}
	void carModel()
	{
		System.out.println("Duster");
	}
	public boolean isPunctured()
	{
		boolean isPunctured = true;
		return isPunctured;
	}
	public int subTwoNums(int num1, int num2) 
	{
		return num1-num2;
	}
	public int multiplyingThreeNums(int num1, int num2, int num3) 
	{
		return num1*num2*num3;
	}
	public int divTwoNums(int num1, int num2) 
	{
		return num1/num2;
	}
	
}	

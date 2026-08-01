


class demo3{
	private String name;
	private int age;
	private String mobileNo;
	private String branch;

	public void setName(String name){
		this.name = name;
	
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}
	public void setmobileNo(String mobileNo){
		this.mobileNo= mobileNo;
	}
	
	public String getmobileNo(){
		return mobileNo;
	}


	public void setbranch(String branch){
		this.branch=branch;
	}
	
	public String getbranch(){
		return branch;
	}
	public static void main(String[] arg){
	
		demo3 d = new demo3();
		d.setName("Priyanka");
		d.setAge(18);
		d.setmobileNo("1234567891");
		d.setbranch("CSE");
		System.out.println(d.getName());
		System.out.println(d.getAge());
		System.out.println(d.getmobileNo());
		System.out.println(d.getbranch());


		
	
	}

}
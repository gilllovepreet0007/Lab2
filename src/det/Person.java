package det;

enum Gender{
	M,F;
};

class Person1 {
             private String fname;
             private String lname;
             private Gender gender;
             private String Phno;
             
             Person1(String fname,String lname,Gender gender, String Phno){
            	 this.fname=fname;
            	 this.lname=lname;
            	 this.gender=gender;
            	 this.Phno=Phno;
             }

			public String getFname() {
				return fname;
			}

			public void setFname(String fname) {
				this.fname = fname;
			}

			public String getLname() {
				return lname;
			}

			public void setLname(String lname) {
				this.lname = lname;
			}

			public Gender getGender() {
				return gender;
			}

			public void setGender(Gender gender) {
				this.gender = gender;
			}

			public String getPhno() {
				return Phno;
			}

			public void setPhno(String phno) {
				Phno = phno;
			}
             
             

             
            
}


class Person{
	public static void main(String[] args) {
		Person1 p=new Person1("Lovepreet","Singh",Gender.M,"9811947284");
		System.out.println(p.getFname());
		System.out.println(p.getLname());
		System.out.println(p.getGender());
		System.out.println(p.getPhno());
	}
	
}
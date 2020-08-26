package UniversityExample;

public class College {
	String collegename;
	String addr;
	College(String col,String add)
	{
		collegename=col;
		addr=add;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	

}

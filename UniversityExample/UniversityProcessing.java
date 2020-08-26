package UniversityExample;

@FunctionalInterface 
interface iCourse
{
	void displayDetails(String type);
//	void viewLink();
	default void feePattern()
	{
		System.out.println("Tri Semester Pattern 15k : Each for UG");
	}
	default void admissionProcess()
	{
		System.out.println("Apply online www.admision.com");
	}
}

@FunctionalInterface
interface iCollegeProcess
{
	String checkAdmission(College college,int mark);
}

@FunctionalInterface
interface iLocationAllocate
{
	boolean showDetails(College college,String nm);
	
}

@FunctionalInterface
interface iCalculate
{
	float calcuPercent(int mark);
}


public class UniversityProcessing {

	
	
	public static void main(String[] args) {

		
		
		iCalculate calcu=x->x*100/500;
		
		
		
		
		
		System.out.println(calcu.calcuPercent(420));
		
//	
						
		//pgcourse.displayDetails("Regular");
		
	College collegemy=new College("ABC College","Bangalore");
	
//	processResult( (c,nm)-> c.getCollegename().equals(nm),
//			collegemy,
//			"ABC College");
	
	}
	
	public static void processResult(iLocationAllocate iproc,College coll,String  nm)
	{
		if(iproc.showDetails(coll,nm))
			System.out.println("College  available " + nm);
		else
			System.out.println("Not Available " + nm);
	}
	 
	
	

}




//iCourse ugcourse= new iCourse() {
//	public void displayDetails(String t)
//	{
//	System.out.println("Streams : Maths,Commerce,CS");	 
//	}
//	public void viewLink()
//	{
//		System.out.println("www.abcuniversity.com");
//	}
//};
//
//iCourse pgcourse=(t)->
//				{System.out.println("course is M.sc,Ph.D type is "+ t);
//					};


//	ugcourse.admissionProcess();
//	ugcourse.displayDetails("Test");
//	ugcourse.viewLink();



//iCollegeProcess collegepr=(college,a)->
//{
//	 if(a>80)
//		 return "Admitted at"+ college.getCollegename();
//	 else
//		 return "Rejected  at" + college.getCollegename();
//};
//
////String ans=collegepr.checkAdmission(collegemy, 85);
////System.out.println(ans);
//
//processResult(collegepr,collegemy,60);


//processResult( (col,mk)->
//{
//if(mk>=80)
//return "Admitted @location "  + col.getAddr();
//else
//return "Rejected , location " + col.getAddr();
//}
//
//,collegemy
//,80);




package week1.day2;

public class calculator {

	int fn,sn,res,fnd,snd,resd;
	double fns,sns, ress,fnm,snm, resm;
	
	public int add(int n1,int n2)
	{
		
		fn=n1;
		sn=n2;
		res=fn+sn;
		return(res);
	}
	
	public int div(int n1,int n2)
	{
		
		fnd=n1;
		snd=n2;
		resd=fnd/snd;
		return(resd);
	}
	
	public double sub(double n1,double n2)
	{
		
		fns=n1;
		sns=n2;
		ress=fns-sns;
		return(ress);
	}
	
	public double mul(double n1,double n2)
	{
		
		fnm=n1;
		snm=n2;
		resm=fnm*snm;
		return(resm);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator cal = new calculator();
		int addoutput=cal.add(5, 5);
		System.out.println("after adding:"+addoutput);
		double suboutput=cal.sub(200.123, 100.123);
		System.out.println("after subtracting:"+suboutput);
		double muloutput=cal.mul(8.3, 2.1);
		System.out.println("after multiplication:"+muloutput);
		int divoutput=cal.div(5, 5);
		System.out.println("after division:"+divoutput);
		
		
		
		

	}

}


public class Exa2 {

	public static void main(String[] args) {
		Exa1 E1=new Exa1();
		E1.sname="shubham";
		E1.rollnum=101;
		//E1.pname="p. singh";
		Exa1.pname="p.singh";
		
		Exa1 E2=new Exa1();
		E2.sname = "priya";
		E2.rollnum = 302;
		//E2.pname="p.singh";
		Exa1.pname = "p.sigh";
		
		E1.studentinfo();
		System.out.println("------------------------");
		E2.studentinfo();
		
		Exa1 E3=new Exa1();
		E3.sname="rekha";
		E3.rollnum=403;
		Exa1.pname="ashish";
		
		Exa1 E4=new Exa1();
		E4.sname="amol";
		E4.rollnum=202;
		Exa1.pname="ashish";
		
		
		
		//Exa1 E7=new Exa1();
		//E7.m3();
		
		System.out.println("------------------------");
		E3.studentinfo();
		System.out.println("---------------------------");
		E4.studentinfo();
		
	}
}

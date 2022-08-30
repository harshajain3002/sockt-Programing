class Account {
	
	private String costommerName ;
	private float custommerIncome ;
	private float custommerAccountno ;
	private float custommerPhoneno ;
	private float custommerPanno ;
	
	public String getCostommername() {
		return costommerName;
	}
	public void setCostommername(String costommername) {
		this.costommerName = costommername;
	}
	
	public float getCustommerIncome() {
		return custommerIncome;
	}
	public void setCustommerIncome(float custommerIncome) {
		this.custommerIncome = custommerIncome;
	}
	public float getCustommeraccountno() {
		return custommerAccountno;
	}
	public void setCustommeraccountno(float custommerAccountno) {
		this.custommerAccountno = custommerAccountno;
	}
	public float getCustommerPhoneno() {
		return custommerPhoneno;
	}
	public void setCustommerPhoneno(float custommerPhoneno) {
		this. custommerPhoneno = custommerPhoneno;
	}
	
	public float getCustommerPanno() {
		return custommerPanno;
	}
	public void setCustommerPanno(float custommerPanno) {
		 this.custommerPanno = custommerPanno;
	}
}
	
public class Bank {
	public static void main(String[] args) { 
Account Ac = new Account() ;
Ac.setCostommername("Veer");
Ac.setCustommerIncome(50000);
Ac.setCustommeraccountno(99654356l);
Ac.setCustommerPhoneno(990646899);
Ac.setCustommerPanno(34587909);
System.out.println("Name :"+ Ac.getCostommername() ) ;
System.out.println("Income :" + Ac.getCustommerIncome() );
System.out.println("accountno :" + Ac.getCustommeraccountno());
System.out.println("Phoneno :" + Ac.getCustommerPhoneno());
System.out.println("Panno :" + Ac.getCustommerPanno());

	}
}


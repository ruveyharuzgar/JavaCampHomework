package interfacesDemo;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	public void add() {
		//manager de i� kodlar�
		customerDal.add();
	}
}

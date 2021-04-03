import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lenscart.dao.IAddressDao;
import com.cg.lenscart.dao.ICustomerDao;
import com.cg.lenscart.entity.Customer;




@Service
public class CustomerService {
	@Autowired
	ICustomerDao dao;
	@Autowired
	IAddressDao aDao;
	public void addCustomer(Customer customer) {
		dao.save(customer);  
	}
	public List<Customer> getAllCustomer(){
		List<Customer> custList=dao.findAll();
		return custList;
	}
	public String deleteCustomer(int customer_id) {
		if(dao.existsById(customer_id)) {
			dao.deleteById(customer_id);
			return "Customer Deleted";
		}
		return "Customer not found";
	}
	public String modifyCustomer(int customer_id,Customer cust) {
		if(dao.existsById(customer_id)) {
			Customer customer=dao.findById(customer_id).get();
			customer.setFirst_name(cust.getFirst_name());
			customer.setLast_name(cust.getLast_name());
			customer.setPhone_number(cust.getPhone_number());
			customer.setEmail_id(cust.getEmail_id());
			customer.setPassword(cust.getPassword());
			aDao.save(cust.getAddress());
			dao.save(customer);
			return "Customer Updated";
		}
		return "Customer not found";
	}

}
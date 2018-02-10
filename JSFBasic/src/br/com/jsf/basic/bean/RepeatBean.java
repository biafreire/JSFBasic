package br.com.jsf.basic.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.jsf.basic.entity.Order;

/**
 * Class to test DataTable. This class is adapted by https://www.mkyong.com/jsf2/jsf-2-datatable-example/.
 * 
 * @author Fabiana Araujo
 *
 */
@ManagedBean
public class RepeatBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static List<Order> orderList;
	
	@PostConstruct
	public void init(){
		if(orderList == null || orderList.isEmpty()){
			System.out.println("Initializing orderList...");
			orderList = new ArrayList<Order>();
			orderList.add(new Order("A0001", "Intel CPU", new BigDecimal("700.00"), 1));
			orderList.add(new Order("A0002", "Harddisk 10TB",new BigDecimal("500.00"), 2));
			orderList.add (new Order("A0003", "Dell Laptop", new BigDecimal("11600.00"), 8));
			orderList.add(new Order("A0004", "Samsung LCD",	new BigDecimal("5200.00"), 3));
			orderList.add (new Order("A0005", "A4Tech Mouse", new BigDecimal("100.00"), 10));
		} else {
			System.out.println("orderList is initialized.");
		}
	}
	
	public void delete(Order order){
		orderList.remove(order);
	}
	
	public void deleteByIndex(int index){
		orderList.remove(index);
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
}

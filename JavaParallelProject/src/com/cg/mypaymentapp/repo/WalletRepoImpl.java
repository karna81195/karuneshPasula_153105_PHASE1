package com.cg.mypaymentapp.repo;

import java.util.HashMap;
import java.util.Map;

import com.cg.mypaymentapp.beans.Customer;

public class WalletRepoImpl implements WalletRepo{

	private Map<String, Customer> data; 
	/*public WalletRepoImpl(Map<String, Customer> data) {
		super();
		this.data = data;
	}*/
	public WalletRepoImpl()
	{
		data=new HashMap<String, Customer>();
	}
	public boolean save(Customer customer) 
	{		
		data.put(customer.getMobileNo(), customer);
		return true;
	}

	public Customer findOne(String mobileNo) 
	{
		Customer customer=null;
		if(data.containsKey(mobileNo))
		{
			customer=data.get(mobileNo);
			return customer;
		}
		else
			return null;
	}
}

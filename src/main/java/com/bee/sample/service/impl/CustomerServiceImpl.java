package com.bee.sample.service.impl;

import org.springframework.stereotype.Service;

import com.bee.sample.service.ICustomerService;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService {

	@Override
	public void saveCustomer() {
		//new Logger().printLog();
		System.out.println("�����˿ͻ�");
	}

	@Override
	public void updateCustomer(int i) {
		System.out.println("�����˿ͻ�");
	}

	@Override
	public void deleteCustomer() {
		System.out.println("ɾ���˿ͻ�");
	}

}

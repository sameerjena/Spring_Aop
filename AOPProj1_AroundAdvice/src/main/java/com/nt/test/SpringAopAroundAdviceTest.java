package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class SpringAopAroundAdviceTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		BankService proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy obj
		proxy=ctx.getBean("pfb",BankService.class);
		System.out.println(proxy.getClass()+"-----"+proxy.getClass().getSuperclass());
		//invoke the method
		System.out.println("Simple interest Amount::"+proxy.calcSimpleInterestAmount(100000, 4, 12));
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Compound interest Amount::"+proxy.calcCompoundInterestAmount(100000, 4, 12));
		
		((AbstractApplicationContext) ctx).close();

	}

}

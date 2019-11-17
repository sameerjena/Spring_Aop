package com.nt.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//Dependent Class,Secondary Logic
public class PerformanceMonitoringAdvice implements MethodInterceptor {
	public long start,end;

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=null;
		
		start=System.currentTimeMillis();
		System.out.println("before entering into target method::"+invocation.getClass());
		retVal=invocation.proceed();
		end=System.currentTimeMillis();
		System.out.println("After Executing into target method");
		
		System.out.println(invocation.getMethod().getName()+"with args"
		                   +Arrays.toString(invocation.getArguments())+"has taken"
				           +(start-end)+"ms to complie to Execution");
	
		return retVal;
	}
	
}

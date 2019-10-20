package com.bee.sample.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
 * 记录日志的操作
 * 计划让其在业务核心方法（切入点方法）执行之间执行。
 */
@Aspect
@Component
public class Logger {
	
	
    private final String POINT_CUT = "execution(public void com.bee.sample.service.impl.CustomerServiceImpl.saveCustomer())";
	/**
     * 命名切点
     * public 切点可访问性修饰符
     *         与类可访问性修饰符的功能是相同的，它可以决定定义的切点可以在哪些类中可使用。
     * pointCut 切点名称
     * void   返回类型
     * 
     *     因为命名切点仅利用方法名及访问修饰符的信息，
     *  一般定义方法的返回类型为 void ，并且方法体为空 
     */
    @Pointcut(POINT_CUT)
    public void pointCut(){}
    
	@Before(value="pointCut()")
	public void printLog() {
		System.out.println("Logger中的printLogfagnfa开始记录日志了！！");
	}

}

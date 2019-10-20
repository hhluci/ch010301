package com.bee.sample.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
 * ��¼��־�Ĳ���
 * �ƻ�������ҵ����ķ���������㷽����ִ��֮��ִ�С�
 */
@Aspect
@Component
public class Logger {
	
	
    private final String POINT_CUT = "execution(public void com.bee.sample.service.impl.CustomerServiceImpl.saveCustomer())";
	/**
     * �����е�
     * public �е�ɷ��������η�
     *         ����ɷ��������η��Ĺ�������ͬ�ģ������Ծ���������е��������Щ���п�ʹ�á�
     * pointCut �е�����
     * void   ��������
     * 
     *     ��Ϊ�����е�����÷��������������η�����Ϣ��
     *  һ�㶨�巽���ķ�������Ϊ void �����ҷ�����Ϊ�� 
     */
    @Pointcut(POINT_CUT)
    public void pointCut(){}
    
	@Before(value="pointCut()")
	public void printLog() {
		System.out.println("Logger�е�printLogfagnfa��ʼ��¼��־�ˣ���");
	}

}

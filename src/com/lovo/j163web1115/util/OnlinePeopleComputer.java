package com.lovo.j163web1115.util;

/**
 * ������
 * 
 * ���ã�����ͳ����������
 * 
 * @author Administrator
 *
 */
public class OnlinePeopleComputer {
	
	private OnlinePeopleComputer() {
		
	}
	
	private static int onlinePeople = 0;
	
	public static void add() {
		onlinePeople = onlinePeople + 1;
	}
	
	public static void minus() {
		onlinePeople = onlinePeople - 1;
	}
	
	public static int getOnlinePeople() {
		
		return onlinePeople;
	}

}

package com.lovo.j163web1115.util;

/**
 * 计数器
 * 
 * 作用：粗略统计在线人数
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

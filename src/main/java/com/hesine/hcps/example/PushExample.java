package com.hesine.hcps.example;


public class PushExample {
	/**
	 * ID of CP assigned by HCPS 
	 */
	private static String cpId = "mockCpId";
	
	/**
	 * password of CP ID, assigned by HCPS
	 */
	private static String cpPwd = "mockCpPwd";
	
	/**
	 * HCPS URI
	 */
	private static String url = "http://test.hcps.com";
	
	public static void main(String[] args) throws Exception {
		new UnicastPush(url+"/message/push", cpId, cpPwd).push();
		new BroadcastPush(url+"/message/push", cpId, cpPwd).push();
		new BroadappPush(url+"/message/push", cpId, cpPwd).push();
		new GroupPush(url+"/group/add", cpId, cpPwd).push();
		new QueryPush(url+"/message/query", cpId, cpPwd).push();
	}

}

/**
 * 
 */
package com.hesine.hcps.example;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wanghua
 * 
 */
public class QueryPush extends BasePush {

	public QueryPush(String requestUrl, String cpId, String cpPwd)
			throws MalformedURLException {
		super(requestUrl, cpId, cpPwd);
	}

	@Override
	public Map<String, Object> buildData() {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("notifId", 5);
		/**
		 * if query specify regId, remove the follow comments.
		 * and the target query regId should be added to regIdList.
		 */
		 /*
		   List<String> regIdList = new ArrayList<String>();
		   regIdList.add("right_regid"); 
		   paramMap.put("regIdList", regIdList);
		 */
		return paramMap;
	}

}

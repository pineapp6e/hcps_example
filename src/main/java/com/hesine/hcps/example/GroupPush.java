/**
 * 
 */
package com.hesine.hcps.example;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author wanghua
 *
 */
public class GroupPush extends BasePush {

	public GroupPush(String requestUrl, String cpId, String cpPwd)
			throws MalformedURLException {
		super(requestUrl, cpId, cpPwd);
	}

	@Override
	public Map<String, Object> buildData() {
		Set<String> registrationList = new HashSet<String>();
		registrationList.add("BFCBEF265F3AEE26F7657244");
		registrationList.add("BFCBEF26326FEE26F7657244");
		registrationList.add("BFCBEF264A3EEE26F7657244");
		registrationList.add("BFCBEF26B13EEE26F7657244");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("name", "group name");
		paramMap.put("desc", "group description");
		paramMap.put("regIdList", registrationList);
		return paramMap;
	}

}

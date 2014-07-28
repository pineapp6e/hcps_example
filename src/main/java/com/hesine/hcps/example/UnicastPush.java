/**
 * 
 */
package com.hesine.hcps.example;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import com.hesine.hcps.common.EnumConstants;

/**
 * @author wanghua
 *
 */
public class UnicastPush extends BasePush {

	public UnicastPush(String requestUrl, String cpId, String cpPwd)
			throws MalformedURLException {
		super(requestUrl, cpId, cpPwd);
	}

	@Override
	public Map<String, Object> buildData() {
		/**
		 * add push data to map.
		 */
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("notifType", EnumConstants.UNICAST);
		paramMap.put("payload", "payload test.");
		paramMap.put("regId", "89ca51571074e20e396810b9d75c046e57e3fff4c0e99ec3f38e9fae734f91d9");
		paramMap.put("pnType", EnumConstants.APNS);
		
		return paramMap;
	}
	
}

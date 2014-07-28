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
public class BroadcastPush extends BasePush {

	public BroadcastPush(String requestUrl, String cpId, String cpPwd)
			throws MalformedURLException {
		super(requestUrl, cpId, cpPwd);
	}

	@Override
	public Map<String, Object> buildData() {
		/**
		 * add push data to map.
		 */
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("notifyType", EnumConstants.BROADCAST);
		paramMap.put("payload", "payload test.");
		paramMap.put("pnType", EnumConstants.HPNS);
		paramMap.put("groupId", 1);
		return paramMap;
	}


}

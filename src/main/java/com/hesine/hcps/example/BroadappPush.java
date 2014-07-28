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
public class BroadappPush extends BasePush {

	/**
	 * 
	 * @param requestUrl
	 * @param cpId
	 * @param cpPwd
	 * @throws MalformedURLException
	 */
	public BroadappPush(String requestUrl, String cpId, String cpPwd)
			throws MalformedURLException {
		super(requestUrl, cpId, cpPwd);
	}

	@Override
	public Map<String, Object> buildData() {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("notifyType", EnumConstants.BROAD_APP);
		paramMap.put("payload", "payload test.");
		paramMap.put("pnType", EnumConstants.HPNS);
		paramMap.put("appId", 12121);
		return paramMap;
	}

}

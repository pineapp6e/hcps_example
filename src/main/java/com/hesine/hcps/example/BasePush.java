/**
 * 
 */
package com.hesine.hcps.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.hesine.util.HttpClientUtil;

/**
 * @author wanghua
 * 
 */
public abstract class BasePush {
	protected String requestUrl;
	protected String host;
	protected int port;
	protected String cpId;
	protected String cpPwd;

	public BasePush(String requestUrl, String cpId, String cpPwd)
			throws MalformedURLException {
		this.requestUrl = requestUrl;
		URL url = new URL(requestUrl);
		this.host = url.getHost();
		this.port = url.getPort();
		this.cpId = cpId;
		this.cpPwd = cpPwd;
	}

	/**
	 * communicate to HCPS server.
	 * 
	 * @throws Exception
	 */
	void push() throws Exception {
		CloseableHttpClient httpClient = HttpClientUtil.getHttpClient(host,
				port);
		try {
			Map<String, Object> paramMap = buildData();
			/**
			 * execute post request.
			 */
			CloseableHttpResponse response = HcpsPost.createPost(this,
					JSON.toJSONString(paramMap)).execute(httpClient);
			String content = EntityUtils.toString(response.getEntity());
			System.out.println("Response:" + content);
		} finally {
			httpClient.close();
		}

	}

	/**
	 * 
	 */
	public abstract Map<String, Object> buildData();

	/**
	 * @return the requestUrl
	 */
	public String getRequestUrl() {
		return requestUrl;
	}

	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @return the cpId
	 */
	public String getCpId() {
		return cpId;
	}

	/**
	 * @return the cpPwd
	 */
	public String getCpPwd() {
		return cpPwd;
	}

}

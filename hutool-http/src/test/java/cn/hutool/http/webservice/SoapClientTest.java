package cn.hutool.http.webservice;

import org.junit.Ignore;
import org.junit.Test;

import cn.hutool.core.lang.Console;

/**
 * SOAP相关单元测试
 * 
 * @author looly
 *
 */
public class SoapClientTest {

	@Test
	@Ignore
	public void requestTest() {
		SoapClient client = SoapClient.create("http://www.webxml.com.cn/WebServices/IpAddressSearchWebService.asmx")
		.setMethod("web:getCountryCityByIp", "http://WebXml.com.cn/")
		.setParam("theIpAddress", "218.21.240.106");
		
		Console.log(client.getMsgStr(true));
		
		Console.log(client.execute(true));
	}
}

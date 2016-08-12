/**   
* @Title: IService.java 
* @Package me.test.axis.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author yaowf
* @date 2016年8月11日 下午5:16:44 
* @version V1.0   
*/
package me.test.axis.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/** 
* @ClassName: IService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yaowf
* @date 2016年8月11日 下午5:16:44 
*  
*/
@WebService
public interface ITestService {

	@WebMethod
	public String testMethod(@WebParam(name="name")String param1,@WebParam(name="type")String param2,@WebParam(name="num")String param3);
	
}

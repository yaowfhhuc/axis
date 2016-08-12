/**   
* @Title: Service.java 
* @Package me.test.axis.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author yaowf
* @date 2016年8月11日 下午5:19:40 
* @version V1.0   
*/
package me.test.axis.service;

/** 
* @ClassName: Service 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yaowf
* @date 2016年8月11日 下午5:19:40 
*  
*/
public class TestService implements ITestService{

	/* (non-Javadoc) 
	* <p>Title: testMethod</p> 
	* <p>Description: </p> 
	* @param param1
	* @param param2
	* @param param3
	* @return 
	* @see me.test.axis.service.IService#testMethod(java.lang.String, java.lang.String, java.lang.String) 
	*/
	@Override
	public String testMethod(String name, String type, String num) {
		String rString = "result";
		System.out.println(name+type+num);
		
		
		
		return rString;
	}

}

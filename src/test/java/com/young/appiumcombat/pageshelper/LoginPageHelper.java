package com.young.appiumcombat.pageshelper;

import org.apache.log4j.Logger;
import org.junit.Assert;

import com.young.appiumcombat.pages.GroupsPage;
import com.young.appiumcombat.pages.LoginPage;
import com.young.appiumcombat.utils.AppiumUtil;

/**
 * @author wudsh
 * @version 创建时间：2017年7月18日 下午3:07:44
 * 类说明
 */

public class LoginPageHelper {
	
	//本类日志对象
	public static Logger logger = Logger.getLogger(LoginPageHelper.class);
	
	/**等待首页元素显示出来*/
	public static void waitHomeUI(AppiumUtil appiumUtil,int elementTimeOut){
		logger.info("正在等待APP首页元素加载");
		appiumUtil.waitForElementToLoad(elementTimeOut, LoginPage.LP_USERNAME_INPUT);
		appiumUtil.waitForElementToLoad(elementTimeOut, LoginPage.LP_PASSWORD_INPUT);
		appiumUtil.waitForElementToLoad(elementTimeOut, LoginPage.LP_LOGIN_BUTTON);
		logger.info("APP首页元素加载完成");
	}
	
	/**
	 * @description 登录91勾搭
	 * @param appiumUtil
	 */
	public static void Login(AppiumUtil appiumUtil){
		appiumUtil.clear(LoginPage.LP_USERNAME_INPUT);
		appiumUtil.typeContent(LoginPage.LP_USERNAME_INPUT, "13554913807");
		appiumUtil.clear(LoginPage.LP_PASSWORD_INPUT);
		appiumUtil.typeContent(LoginPage.LP_PASSWORD_INPUT, "123456");
		appiumUtil.click(LoginPage.LP_LOGIN_BUTTON);
	}
	
	/**
	 * @description 验证登录是否成功
	 * @param appiumUtil
	 * @param elementTimeOut
	 */
	public static void checkLoginSuccess(AppiumUtil appiumUtil,int elementTimeOut){
		try {
			appiumUtil.waitForElementToLoad(elementTimeOut, GroupsPage.GP_WIFI_RADIO);
			Assert.assertTrue("登录成功", true);
			logger.info("登录成功");
		} catch (Exception e) {
			logger.info(e);
			Assert.fail("登录失败");
			logger.info("登录失败");
		}
	}
	
	/**
	 * @description 判断定位选项是否显示出来了 ，如果显示了点击允许按钮
	 * @param appiumUtil
	 */
	public static void clickIfButtonExist(AppiumUtil appiumUtil) {
		boolean flag = appiumUtil
				.doesElementsExist(LoginPage.LP_DINGWEI_BUTTON);
		if (flag) {
			appiumUtil.click(LoginPage.LP_DINGWEI_BUTTON);
		}
	}
}

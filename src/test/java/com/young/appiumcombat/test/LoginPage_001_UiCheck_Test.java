package com.young.appiumcombat.test;

import org.testng.annotations.Test;

import com.young.appiumcombat.base.BasePrepare;
import com.young.appiumcombat.pageshelper.LoginPageHelper;

/**
 * @author wudsh
 * @version 创建时间：2017年7月18日 下午3:24:11
 * 类说明
 */

public class LoginPage_001_UiCheck_Test extends BasePrepare {
	
	@Test(description="91勾搭")
	public void loginOuYu(){
		//  http://updates.jenkins-ci.org/download/war/
		//http://localhost:8080/login?from=%2F
		LoginPageHelper.waitHomeUI(appiumUtil, elementTimeOut);
		LoginPageHelper.Login(appiumUtil);
		LoginPageHelper.checkLoginSuccess(appiumUtil, elementTimeOut);
	}
}

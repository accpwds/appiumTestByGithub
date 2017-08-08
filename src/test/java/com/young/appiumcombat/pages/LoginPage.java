package com.young.appiumcombat.pages;

import org.openqa.selenium.By;

/**
 * @author wudsh
 * @version 创建时间：2017年7月18日 下午3:02:33
 * 类说明
 */

public class LoginPage {

	public static final By LP_USERNAME_INPUT = By.id("com.lebaonline.ouyu:id/username_et");
	
	public static final By LP_PASSWORD_INPUT = By.id("com.lebaonline.ouyu:id/check_pw_et");
	
	public static final By LP_LOGIN_BUTTON = By.id("com.lebaonline.ouyu:id/login_btn");
	
	/* 允许定位按钮  */
	public static final By LP_DINGWEI_BUTTON = By.id("com.lbe.security.miui:id/accept");
}

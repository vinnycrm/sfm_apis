package com.sfm.webservices.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sfm.auth.UserSessionMapManager;

public class LogoutService
{
	private static Logger OUT = LoggerFactory.getLogger(LogoutService.class);

	public void doDeleteTokenFromMap(String userLoginId) throws Exception
	{
		OUT.debug("Removing token for user: {}", userLoginId);
		UserSessionMapManager.getInstance().doDelete(userLoginId);
	}
}

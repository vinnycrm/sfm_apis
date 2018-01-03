package com.sfm.services.userauthentication;

import java.security.GeneralSecurityException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sfm.dao.user.UserAuthenticationDAO;
import com.sfm.dto.common.ApplicationConstants;
import com.sfm.dto.user.UserAuthenticationDTO;

public class UserAuthenticationService
{
	private static final Logger OUT = LoggerFactory.getLogger(UserAuthenticationService.class);

	public UserAuthenticationDTO getUserAuthByUserLoginId(String userLoginId) throws Exception
	{
		UserAuthenticationDTO userAuthenticationDTO = null;
		try
		{
			userAuthenticationDTO = new UserAuthenticationDAO().getUserAuthByUserLoginId(userLoginId);
		}
		catch (GeneralSecurityException e)
		{
			OUT.error(ApplicationConstants.getException(), e);
		}
		return userAuthenticationDTO;
	}
}

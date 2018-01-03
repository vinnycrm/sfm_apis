package com.sfm.webservices.service;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.sfm.common.exception.SFMException;
import com.sfm.common.utils.AESCipher;
import com.sfm.dto.common.ApplicationConstants;
import com.sfm.dto.user.UserAuthenticationDTO;
import com.sfm.dto.user.UserSessionDTO;
import com.sfm.services.userauthentication.UserAuthenticationService;
import com.sfm.webservices.errors.GeneralError;
import com.sfm.webservices.params.LoginObject;
import com.sfm.webservices.utils.SFMApplicationUtils;

public class LoginService
{
	private static final Logger OUT = LoggerFactory.getLogger(LoginService.class);

	public User login(LoginObject loginObject, UserSessionDTO userSessionDTO) throws Exception
	{
		if (loginObject.getLoginId() == null || loginObject.getPassword() == null || loginObject.getLoginId().trim().isEmpty()
				|| loginObject.getPassword().isEmpty())
		{
			throw new SFMException(GeneralError.INVALID_PARMS.getErrorCode(), GeneralError.INVALID_PARMS.name());
		}
		UserAuthenticationDTO userAuthenticationDTO = new UserAuthenticationService().getUserAuthByUserLoginId(loginObject.getLoginId());
		if (userAuthenticationDTO == null)
		{
			throw new SFMException(GeneralError.UNAUTHORIZED.getErrorCode(), GeneralError.UNAUTHORIZED.name());
		}

		User user = null;
		try
		{
			String dbpassword = new String(AESCipher.decrypt(userAuthenticationDTO.getPassword()));
			if (dbpassword.equals(loginObject.getPassword()))
			{
				List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
				user = new User(SFMApplicationUtils.getAuthJSON(userAuthenticationDTO), loginObject.getPassword(), true, true, true, true, authorities);
				userSessionDTO.setUserLoginId(userAuthenticationDTO.getLoginId());
				userSessionDTO.setUserId(userAuthenticationDTO.getId());
			}
			else
			{
				OUT.warn("Invalid Credentails for userId passed {}", loginObject.getLoginId());
				throw new SFMException(GeneralError.UNAUTHORIZED.getErrorCode(), GeneralError.UNAUTHORIZED.name());
			}
		}
		catch (GeneralSecurityException e)
		{
			OUT.error(ApplicationConstants.getException(), e);
			throw new SFMException(GeneralError.UNAUTHORIZED.getErrorCode(), GeneralError.UNAUTHORIZED.name());
		}
		return user;
	}

}
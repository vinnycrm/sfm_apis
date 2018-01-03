package com.sfm.webservices.controller.auth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfm.common.consts.URIConstants;
import com.sfm.common.exception.SFMException;
import com.sfm.dto.common.ApplicationConstants;
import com.sfm.dto.user.UserSessionDTO;
import com.sfm.webservices.common.CommonResponse;
import com.sfm.webservices.errors.GeneralError;
import com.sfm.webservices.security.TokenAuthenticationService;
import com.sfm.webservices.service.LogoutService;
import com.sfm.webservices.utils.SFMApplicationUtils;

@RestController

public class LogoutController
{
	private static final Logger	OUT	= LoggerFactory.getLogger(LogoutController.class);

	@Autowired
	TokenAuthenticationService	authService;

	@RequestMapping(value = URIConstants.LOGOUT)
	public CommonResponse logout(Authentication auth) throws Exception
	{
		CommonResponse commonResponse = new CommonResponse();
		OUT.info("LOGOUT: logout operation starting...");
		try
		{
			UserSessionDTO userSessionDTO = SFMApplicationUtils.getUserSessionFromAuth(auth);
			new LogoutService().doDeleteTokenFromMap(userSessionDTO.getUserLoginId());
			commonResponse.setStatus(ApplicationConstants.getSuccess());
		}
		catch (SFMException e)
		{
			OUT.error(ApplicationConstants.getException(), e);
			SFMApplicationUtils.setErrorResponse(commonResponse, e.getMessage(), e.getErrorMessage());
		}
		catch (Exception e)
		{
			OUT.error(ApplicationConstants.getException(), e);
			SFMApplicationUtils.setErrorResponse(commonResponse, GeneralError.INTERNAL_ERROR.getErrorCode(), e.getMessage());
		}
		OUT.info("LOGOUT: logout operation completed");
		return commonResponse;

	}
}

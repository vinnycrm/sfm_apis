package com.sfm.webservices.controller.auth;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sfm.auth.UserSessionMapManager;
import com.sfm.common.consts.URIConstants;
import com.sfm.common.exception.SFMException;
import com.sfm.dto.common.ApplicationConstants;
import com.sfm.dto.user.UserSessionDTO;
import com.sfm.webservices.common.CommonResponse;
import com.sfm.webservices.errors.GeneralError;
import com.sfm.webservices.params.LoginObject;
import com.sfm.webservices.security.TokenAuthenticationService;
import com.sfm.webservices.security.UserAuthentication;
import com.sfm.webservices.service.LoginService;
import com.sfm.webservices.utils.SFMApplicationUtils;

@RestController
@RequestMapping(value = URIConstants.LOGIN)
public class LoginController
{
	private static final Logger	OUT	= LoggerFactory.getLogger(LoginController.class);

	@Autowired
	TokenAuthenticationService	authService;

	@RequestMapping(method = RequestMethod.POST)
	public CommonResponse login(HttpServletResponse response, @RequestBody(required = true) LoginObject loginParams) throws Exception
	{
		CommonResponse commonResponseDTO = null;
		UserSessionDTO userSessionDTO = new UserSessionDTO();
		OUT.info("REQ: for Login for Login Id : {}", loginParams.getLoginId());
		try
		{
			commonResponseDTO = new CommonResponse();
			User user = new LoginService().login(loginParams, userSessionDTO);
			authService.addAuthentication(response, new UserAuthentication(user), userSessionDTO);
			UserSessionMapManager.getInstance().doInsert(userSessionDTO);
			commonResponseDTO.setStatus(ApplicationConstants.getSuccess());
		}
		catch (SFMException e)
		{
			OUT.error(ApplicationConstants.getException(), e);
			SFMApplicationUtils.setErrorResponse(commonResponseDTO, e.getMessage(), e.getErrorMessage());
		}
		catch (Exception e)
		{
			OUT.error(ApplicationConstants.getException(), e);
			SFMApplicationUtils.setErrorResponse(commonResponseDTO, GeneralError.INTERNAL_ERROR.getErrorCode(), e.getMessage());
		}
		OUT.info("RESP: for Login for Login Id {} completed with status: {}", loginParams.getLoginId(), commonResponseDTO.getStatus());
		return commonResponseDTO;
	}

}
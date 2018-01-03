package com.sfm.webservices.controller.userrole;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sfm.common.consts.URIConstants;
import com.sfm.common.exception.SFMException;
import com.sfm.dto.common.ApplicationConstants;
import com.sfm.services.userrole.UserRoleService;
import com.sfm.webservices.common.CommonResponse;
import com.sfm.webservices.errors.GeneralError;
import com.sfm.webservices.utils.SFMApplicationUtils;

/***
 * @author vinaya.crm
 */
@RestController
public class UserRoleController
{
	private static final Logger OUT = LoggerFactory.getLogger(UserRoleController.class);

	@RequestMapping(value = URIConstants.UR_SUMMARY, method = RequestMethod.GET)
	public CommonResponse getSummaryDetails()
	{
		OUT.debug("REQ: Started getting user role summary details");
		CommonResponse commonResponse = null;
		try
		{
			commonResponse = new CommonResponse();
			commonResponse.setResponseObject(new UserRoleService().getSummaryDetails());

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
		OUT.debug("RESP: Completed getting user role summary details with status : {}", ApplicationConstants.getSuccess());
		return commonResponse;
	}
}

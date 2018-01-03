package com.sfm.webservices.controller.start;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sfm.common.consts.URIConstants;
import com.sfm.common.enums.ResposeStatusEnum;
import com.sfm.webservices.common.CommonResponse;

@RestController
public class StartController
{

	@RequestMapping(value = URIConstants.START_DETAILS, method = RequestMethod.POST)
	public CommonResponse getServerdetailsById()
	{
		CommonResponse commonResponse = new CommonResponse();
		commonResponse.setStatus(ResposeStatusEnum.success.getStatus());
		return commonResponse;
	}
}

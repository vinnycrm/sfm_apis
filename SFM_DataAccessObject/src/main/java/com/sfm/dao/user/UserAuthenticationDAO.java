package com.sfm.dao.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sfm.dao.DBMappingConstants;
import com.sfm.dao.common.DBManager;
import com.sfm.dto.user.UserAuthenticationDTO;

public class UserAuthenticationDAO
{
	private static final Logger OUT = LoggerFactory.getLogger(UserAuthenticationDAO.class);
	
	public UserAuthenticationDTO getUserAuthByUserLoginId(String userLoginId) throws Exception
	{
		OUT.debug("Getting user authentication details by login id: {}", userLoginId);
		UserAuthenticationDTO userAuthenticationDTO = (UserAuthenticationDTO) DBManager.getInstance()
				.getResultAsObject(DBMappingConstants.GET_USER_AUTH_BY_USER_LOGINID, userLoginId);
		OUT.debug("User auth details {} for user login id: {}", userAuthenticationDTO != null ? " FOUND " : " NOT FOUND", userLoginId);
		return userAuthenticationDTO;
	}
}

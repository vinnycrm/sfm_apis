package com.sfm.dao.userrole;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sfm.dao.DBMappingConstants;
import com.sfm.dao.common.DBManager;
import com.sfm.dto.userrole.UserRoleDTO;

public class UserRoleDAO
{
	private static final Logger OUT = LoggerFactory.getLogger(UserRoleDAO.class);

	public List<UserRoleDTO> getAll() throws Exception
	{
		OUT.debug("Getting all user role details");
		List<UserRoleDTO> list = DBManager.getInstance().getResultList(DBMappingConstants.GET_ALL_USER_ROLE, null);
		OUT.debug("user role details found : {}", list.size() > 0 ? list.size() : "NOT FOUND");
		return list;
	}

}

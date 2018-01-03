package com.sfm.services.userrole;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sfm.dao.userrole.UserRoleDAO;
import com.sfm.dto.userrole.UserRoleDTO;

/***
 * @author vinaya.crm
 */
public class UserRoleService
{
	private static final Logger OUT = LoggerFactory.getLogger(UserRoleService.class);

	public List<UserRoleDTO> getSummaryDetails() throws Exception
	{
		OUT.debug("Getting user role summary details");
		List<UserRoleDTO> list = new UserRoleDAO().getAll();
		return list;
	}
}

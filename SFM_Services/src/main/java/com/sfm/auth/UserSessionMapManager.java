package com.sfm.auth;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sfm.dto.user.UserSessionDTO;

public class UserSessionMapManager
{
	private static final Logger					OUT				= LoggerFactory.getLogger(UserSessionMapManager.class);
	private static final UserSessionMapManager	INSTANCE		= new UserSessionMapManager();
	private static Map<String, UserSessionDTO>	userSessionMap	= new HashMap<String, UserSessionDTO>();

	public void doUpdate(UserSessionDTO userSessionDTO)
	{
		OUT.debug("Update user Session details from Map , userLoginId: {}", userSessionDTO.getUserLoginId());
		userSessionMap.put(userSessionDTO.getUserLoginId(), userSessionDTO);
		OUT.debug("Update user Session details in cache, getUserLoginId: {} successful", userSessionDTO);
	}

	public void doInsert(UserSessionDTO userSessionDTO)
	{
		OUT.debug("Update user Session details from Map , userLoginId: {}", userSessionDTO.getUserLoginId());
		userSessionMap.put(userSessionDTO.getUserLoginId(), userSessionDTO);
		OUT.debug("Update user Session details in cache, getUserLoginId: {} successful", userSessionDTO);
	}

	public void doDelete(String userLoginId)
	{
		OUT.debug("Remove user Session from Map , userLoginId: {}", userLoginId);
		if (userSessionMap.containsKey(userLoginId))
			userSessionMap.remove(userLoginId);
	}

	/**
	 * @param userLoginId
	 */
	public UserSessionDTO getUserSessionByUserLoginId(String userLoginId)
	{
		OUT.debug("Getting user details from Map, userLoginId: {}", userLoginId);
		UserSessionDTO values = null;
		values = userSessionMap.get(userLoginId);
		return values;
	}

	/**
	 * @param Allc
	 *            userSessions
	 */
	public List<UserSessionDTO> getALLUserSessions()
	{
		OUT.debug("Getting all user details from cache");
		Collection<UserSessionDTO> values = null;
		values = userSessionMap.values();
		OUT.debug("Number of user auth details found: {}", values != null ? values.size() : 0);
		return (List<UserSessionDTO>) values;
	}

	public static UserSessionMapManager getInstance()
	{
		return INSTANCE;
	}
}

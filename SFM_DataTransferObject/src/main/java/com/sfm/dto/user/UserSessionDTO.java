package com.sfm.dto.user;

import java.io.Serializable;

public class UserSessionDTO implements Serializable
{
	private static final long	serialVersionUID	= 1L;

	private String				userLoginId;
	private int					userId;
	private String				jwtToken;

	public int getUserId()
	{
		return userId;
	}

	public void setUserId(int userId)
	{
		this.userId = userId;
	}

	public String getUserLoginId()
	{
		return userLoginId;
	}

	public void setUserLoginId(String userLoginId)
	{
		this.userLoginId = userLoginId;
	}

	public String getJwtToken()
	{
		return jwtToken;
	}

	public void setJwtToken(String jwtToken)
	{
		this.jwtToken = jwtToken;
	}

	@Override
	public String toString()
	{
		return "UserSessionDTO [userLoginId=" + userLoginId + ", userId=" + userId + ", jwtToken=" + jwtToken + "]";
	}

}

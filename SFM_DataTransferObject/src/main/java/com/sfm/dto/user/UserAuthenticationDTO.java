package com.sfm.dto.user;

import com.sfm.dto.IModel;

public class UserAuthenticationDTO implements IModel
{
	private static final long	serialVersionUID	= 1L;

	private int					id;
	private String				loginId;
	private byte[]				password;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public byte[] getPassword()
	{
		return password;
	}

	public void setPassword(byte[] password)
	{
		this.password = password;
	}

	public String getLoginId()
	{
		return loginId;
	}

	public void setLoginId(String loginId)
	{
		this.loginId = loginId;
	}

}

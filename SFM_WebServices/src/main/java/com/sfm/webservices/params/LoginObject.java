package com.sfm.webservices.params;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class LoginObject
{
	@NotEmpty
	private String	loginId;

	@NotEmpty(message = "Password should not be empty.")
	@Size(min = 6, message = "Password length should be more than 5 Characters.")
	private String	password;

	public String getLoginId()
	{
		return loginId;
	}

	public void setLoginId(String loginId)
	{
		this.loginId = loginId;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

}

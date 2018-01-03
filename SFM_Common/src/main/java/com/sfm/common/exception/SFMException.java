package com.sfm.common.exception;

public class SFMException extends RuntimeException
{
	private static final long	serialVersionUID	= 1L;

	private String				errorMessage;
	private String[]			errorParams;

	private String				errorCode;

	public SFMException(String errorCode, String errorMessage, String... errorParams)
	{
		super(errorMessage);
		this.errorCode = errorCode;
		this.errorParams = errorParams;
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage()
	{
		return errorMessage;
	}

	public String[] getErrorParams()
	{
		return errorParams;
	}

	public String getErrorCode()
	{
		return errorCode;
	}
}

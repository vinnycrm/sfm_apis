package com.sfm.common.consts;

public interface URIConstants
{
	String	LOGIN			= "/login";

	String	BASE_PATH		= "/authn";
	String	START_DETAILS	= BASE_PATH + "/startdetais";
	
	// user role
	String	USER_ROLE		= BASE_PATH + "/userrole";
	String	UR_SUMMARY		= USER_ROLE + "/getall";

	String	LOGOUT			= BASE_PATH + "/logout";
}

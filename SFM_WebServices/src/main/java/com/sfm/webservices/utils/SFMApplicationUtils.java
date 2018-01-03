package com.sfm.webservices.utils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import com.sfm.auth.UserSessionMapManager;
import com.sfm.dto.common.ApplicationConstants;
import com.sfm.dto.user.UserAuthenticationDTO;
import com.sfm.dto.user.UserSessionDTO;
import com.sfm.webservices.common.CommonErrorObject;
import com.sfm.webservices.common.CommonResponse;

public class SFMApplicationUtils
{
	public static String getAuthJSON(UserAuthenticationDTO authenticationDTO) throws JSONException
	{
		JSONObject authHJson = new JSONObject();
		authHJson.put(ApplicationConstants.USER_LOGIN_ID, authenticationDTO.getLoginId());
		return authHJson.toString();
	}

	public static String getUserDetailsFromAuth(Authentication auth) throws JSONException
	{
		JSONObject authHJson = new JSONObject(((User) auth.getDetails()).getUsername());
		String userLoginId = authHJson.getString(ApplicationConstants.USER_LOGIN_ID);
		return userLoginId;
	}

	public static void setErrorResponse(CommonResponse commonResponseDTO, String errorCode, String errorMessage)
	{
		commonResponseDTO.setErrorcode(errorCode);
		commonResponseDTO.setInternalErrorMessage(errorMessage);
		commonResponseDTO.setStatus(ApplicationConstants.getFailure());
	}

	public static Date getSessionTimeOut(String sessionTimeOut)
	{
		Calendar sessionTimeOutCal = Calendar.getInstance();
		// sessionTimeOutCal.add(Calendar.MINUTE, 30);
		sessionTimeOutCal.add(Calendar.MINUTE, Integer.parseInt(sessionTimeOut));
		return sessionTimeOutCal.getTime();
	}

	public static void setFieldErrorResponse(CommonResponse commonResponseDTO, List<ObjectError> errorCodeList)
	{
		List<CommonErrorObject> commonErrorObjectList = new ArrayList<CommonErrorObject>();
		CommonErrorObject commonErrorObject;
		for (Object Object : errorCodeList)
		{
			if (Object instanceof ObjectError && Object instanceof FieldError)
			{
				commonErrorObject = new CommonErrorObject();
				ObjectError objectError = (ObjectError) Object;
				FieldError fieldError = (FieldError) Object;
				commonErrorObject.setErrorCode(objectError.getDefaultMessage());
				commonErrorObject.setErrorField(fieldError.getField());
				commonErrorObjectList.add(commonErrorObject);
			}
		}
		commonResponseDTO.setErrorCodeList(commonErrorObjectList);
		commonResponseDTO.setStatus(ApplicationConstants.getFailure());
	}

	public static long resetToTime(long toTime, boolean compare)
	{
		if (!compare)
		{
			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMaximum(Calendar.HOUR_OF_DAY));
			calendar.set(Calendar.MINUTE, calendar.getActualMaximum(Calendar.MINUTE));
			calendar.set(Calendar.SECOND, calendar.getActualMaximum(Calendar.SECOND));
			calendar.set(Calendar.MILLISECOND, calendar.getActualMaximum(Calendar.MILLISECOND));

			if (toTime > calendar.getTimeInMillis())
			{
				toTime = calendar.getTimeInMillis();
			}
		}
		return toTime;
	}

	public static UserSessionDTO getUserSessionFromAuth(Authentication auth) throws JSONException
	{
		String userLoginId = getUserDetailsFromAuth(auth);
		UserSessionDTO userSessionDTO = UserSessionMapManager.getInstance().getUserSessionByUserLoginId(userLoginId);
		return userSessionDTO;
	}
}

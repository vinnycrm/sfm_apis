package com.sfm.dto.common;

import com.sfm.common.enums.ActionsEnum;

public class ApplicationConstants
{
	private static final String	SEARCH_XML										= "searchXML";
	public static final String	EXCEPTION										= "Exception";
	public static final String	JSONEXCEPTION									= "JSONException";
	private static final String	SUCCESS											= "SUCCESS";
	private static final String	FAILURE											= "FAILURE";
	private static final String	USER_SESSION_OBJECT								= "userSessionObj";

	public static final String	AUTHN											= "/authn";
	public static final String	AUTHZ											= AUTHN + "/authz";

	public static final String	SCREEN											= "screen";
	public static final String	ADD												= ActionsEnum.ActionURI.DO_ADD;
	public static final String	MOD												= ActionsEnum.ActionURI.DO_MODIFY;
	public static final String	DELETE											= ActionsEnum.ActionURI.DO_DELETE;
	public static final String	VIEW											= ActionsEnum.ActionURI.DO_VIEW;

	public static final String	ANON											= "ANON";

	// DbProperty constants
	private static final String	PASSWORD										= "password";
	private static final String	USER											= "user";
	private static final String	DRIVER											= "driver";
	private static final String	URL												= "url";

	public static final String	DEVICE_XS										= "xsmall";
	public static final String	DEVICE_S										= "small";
	public static final String	DEVICE_M										= "medium";
	public static final String	DEVICE_L										= "large";

	public static final String	EXCEL_FILE_TYPE									= "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
	public static final String	ELECTRICAL_DEVICES								= "ElectricalDevices";
	public static final String	ACIDIC											= "ACIDIC";
	public static final String	ALKALINE										= "ALKALINE";
	public static final String	GOOD											= "GOOD";
	public static final String	ACIDIC_COLOR									= "#BF1E2E";
	public static final String	ALKALINE_COLOR									= "#92278F";
	public static final String	GOOD_COLOR										= "#8DC73F";

	/*
	 * if pH <= ACIDIC_UPPER_BOND then nature is ACIDIC if pH >= ALKALINE_LOWER_BOND
	 * then nature is ALKALINE else nature is GOOD
	 * 
	 */
	public static final double	ACIDIC_UPPER_BOND								= 6.7;
	public static final double	ALKALINE_LOWER_BOND								= 7.4;

	// Web Service Auth
	public static final String	USER_LOGIN_ID									= "USER_LOGIN_ID";
	public static final String	USER_ID											= "USER_ID";

	private static final String	VALID											= "valid";
	public static final String	NA												= "NA";

	// Root parent id
	public static final int		rootParentId									= 0;

	// Application Constants
	private static final String	TOKEN_TIMEOUT									= "com.ed.jwttoken.timeout.min";
	public static final String	THREADPOOL_SIZE									= "com.ed.correlation.threadpool.size";
	public static final String	CORRELATION_INTERVAL_IN_MINUTES					= "com.ed.correlation.interval.in.minutes";
	public static final String	RCP_ESTIMATED_POWER_CONSUMPTION_PER_HOUR		= "com.ed.rcp.estimated.power.consumption.per.hour";
	public static final String	ESTIMATED_FLARE_OUTPUT_PER_HOUR					= "com.ed.estimated.flare.output.per.hour";
	public static final String	ESTIMATED_FLARE_RATE_PER_HOUR					= "com.ed.estimated.flare.rate.per.hour";
	public static final String	HEATER_ESTIMATED_POWER_CONSUMPTION_PER_HOUR		= "com.ed.heater.estimated.power.consumption.per.hour";
	public static final String	CRUSHER_ESTIMATED_POWER_CONSUMPTION_PER_HOUR	= "com.ed.crusher.estimated.power.consumption.per.hour";
	public static final String	COMPRESSOR_ESTIMATED_POWER_CONSUMPTION_PER_HOUR	= "com.ed.compressor.estimated.power.consumption.per.hour";
	public static final String	ECO_DIGESTER									= "com.ed.systemdetails.systemname";
	public static final String	SYSTEM_CAPACITY									= "com.ed.systemdetails.capacity";
	private static final String	GS_BASE_LINE_VALUE								= "com.ed.estimated.gas.per.kg.of.feed";
	private static final String	GS_SET_POINT_VALUE								= "com.ed.secondary.storage.setpoint.pressure";
	private static final String	GS_TEMPERATURE_SET_POINT_VALUE					= "com.ed.ideal.secondary.storage.temperature";
	private static final String	GS_DESIRABLE_PH_VALUE							= "com.ed.bio.reactor.desired.pH";
	private static final String	GS_LPG_CYLINDER_VOLUME							= "com.ed.commercial.cylender.volume";
	public static final String	GS_METHANE_PERCENTAGE_IN_BIOGAS					= "com.ed.methane.percentage.in.biogas";

	/*
	 * 'com.ed.volume.secondary.storage.litters'
	 * 'com.ed.volume.secondary.storage.cubic.meters'
	 * 'com.ed.secondary.storage.setpoint.pressure'
	 * 'com.ed.bio.reactor.desired.temprature'
	 */

	// Excel File Header Names
	public static final String	EXCEL_PH_ID										= "com.ed.excel.ph.id.label";
	public static final String	EXCEL_PH_SYSTEM_NAME							= "com.ed.excel.ph.systemname.label";
	public static final String	EXCEL_PH_RECORD_ON								= "com.ed.excel.ph.recordon.label";
	public static final String	EXCEL_PH_PH_VALUE								= "com.ed.excel.ph.phvalue.label";
	public static final String	EXCEL_PH_STATUS									= "com.ed.excel.ph.status.label";

	public static final String	EXCEL_GP_ID										= "com.ed.excel.gp.id.label";
	public static final String	EXCEL_GP_SYSTEM_NAME							= "com.ed.excel.gp.systemname.label";
	public static final String	EXCEL_GP_RECORD_ON								= "com.ed.excel.gp.recordon.label";
	public static final String	EXCEL_GP_GAS_PRODUCED							= "com.ed.excel.gp.gasproduced.label";

	public static final String	EXCEL_IF_ID										= "com.ed.excel.if.id.label";
	public static final String	EXCEL_IF_SYSTEM_NAME							= "com.ed.excel.if.systemname.label";
	public static final String	EXCEL_IF_RECORD_ON								= "com.ed.excel.if.recordon.label";
	public static final String	EXCEL_IF_INPUT_FEED								= "com.ed.excel.if.inputfeed.label";

	public static final String	EXCEL_FD_ID										= "com.ed.excel.fd.id.label";
	public static final String	EXCEL_FD_SYSTEM_NAME							= "com.ed.excel.fd.systemname.label";
	public static final String	EXCEL_FD_ON_TIME								= "com.ed.excel.fd.ontime.label";
	public static final String	EXCEL_FD_OFF_TIME								= "com.ed.excel.fd.offtime.label";
	public static final String	EXCEL_FD_RUN_TIME								= "com.ed.excel.fd.runtime.label";
	public static final String	EXCEL_FD_FLARE_OUT								= "com.ed.excel.fd.flareout.label";
	public static final String	EXCEL_FD_FLARE_VOLUME							= "com.ed.excel.fd.flarevolume.label";

	public static final String	EXCEL_DD_ID										= "com.ed.excel.dd.id.label";
	public static final String	EXCEL_DD_SYSTEM_NAME							= "com.ed.excel.dd.systemname.label";
	public static final String	EXCEL_DD_DEVICE_NAME							= "com.ed.excel.dd.devicename.label";
	public static final String	EXCEL_DD_DEVICE_TYPE							= "com.ed.excel.dd.devicetype.label";
	public static final String	EXCEL_DD_ON_TIME								= "com.ed.excel.dd.ontime.label";
	public static final String	EXCEL_DD_OFF_TIME								= "com.ed.excel.dd.offtime.label";
	public static final String	EXCEL_DD_RUN_TIME								= "com.ed.excel.dd.runtime.label";

	public static final String	EXCEL_OS_DATE_LABEL								= "com.ed.excel.os.date.label";
	public static final String	EXCEL_OS_INPUT_FEED								= "com.ed.excel.os.inputfeed.label";
	public static final String	EXCEL_OS_CRUSHER_PC								= "com.ed.excel.os.crusher.pc.label";
	public static final String	EXCEL_OS_CRUSHER_RUN_TIME						= "com.ed.excel.os.crusher.rt.label";
	public static final String	EXCEL_OS_HEATER_PC								= "com.ed.excel.os.heater.pc.label";
	public static final String	EXCEL_OS_HEATER_RUN_TIME						= "com.ed.excel.os.heater.rt.label";
	public static final String	EXCEL_OS_RCP_PC									= "com.ed.excel.os.rcp.pc.label";
	public static final String	EXCEL_OS_RCP_RUN_TIME							= "com.ed.excel.os.rcp.rt.label";
	public static final String	EXCEL_OS_COMPRESSOR_PC							= "com.ed.excel.os.compressor.pc.label";
	public static final String	EXCEL_OS_COMPRESSOR_RUN_TIME					= "com.ed.excel.os.compressor.rt.label";
	public static final String	EXCEL_OS_FLARE_PC								= "com.ed.excel.os.flare.pc.label";
	public static final String	EXCEL_OS_FLARE_RUN_TIME							= "com.ed.excel.os.flare.rt.label";
	public static final String	EXCEL_OS_TOTAL_PC								= "com.ed.excel.os.total.pc.label";
	public static final String	EXCEL_OS_PH										= "com.ed.excel.os.ph.label";
	public static final String	EXCEL_OS_BIOGAS									= "com.ed.excel.os.biogas.label";
	public static final String	EXCEL_OS_BIOGAS_PER_KG_FEED						= "com.ed.excel.os.biogas.wrt.feed.label";
	public static final String	EXCEL_OS_BIOGAS_PER__KWH_POWER					= "com.ed.excel.os.biogas.wrt.pc.label";

	public static String getException()
	{
		return EXCEPTION;
	}

	public static String getJSONException()
	{
		return JSONEXCEPTION;
	}

	public static String getSuccess()
	{
		return SUCCESS;
	}

	public static String getFailure()
	{
		return FAILURE;
	}

	public static String getUserSessionObject()
	{
		return USER_SESSION_OBJECT;
	}

	public static String getPassword()
	{
		return PASSWORD;
	}

	public static String getUser()
	{
		return USER;
	}

	public static String getDriver()
	{
		return DRIVER;
	}

	public static String getUrl()
	{
		return URL;
	}

	public static String getSearchXml()
	{
		return SEARCH_XML;
	}

	public static String getValid()
	{
		return VALID;
	}

	public static String getTokenTimeout()
	{
		return TOKEN_TIMEOUT;
	}

	public static String getSystemCapacity()
	{
		return SYSTEM_CAPACITY;
	}

	public static String getGsBaseLineValue()
	{
		return GS_BASE_LINE_VALUE;
	}

	public static String getGsSetPointValue()
	{
		return GS_SET_POINT_VALUE;
	}

	public static String getGsTemperatureSetPointValue()
	{
		return GS_TEMPERATURE_SET_POINT_VALUE;
	}

	public static String getGsDesirablePhValue()
	{
		return GS_DESIRABLE_PH_VALUE;
	}

	public static String getGsLpgCylinderVolume()
	{
		return GS_LPG_CYLINDER_VOLUME;
	}
}

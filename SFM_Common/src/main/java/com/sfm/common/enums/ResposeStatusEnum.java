package com.sfm.common.enums;

public enum ResposeStatusEnum {

	success("SUCCESS"), failed("FAILED");

	private String status;

	private ResposeStatusEnum(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

}

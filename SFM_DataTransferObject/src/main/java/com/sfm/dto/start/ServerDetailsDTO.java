package com.sfm.dto.start;

import com.sfm.dto.IModel;

public class ServerDetailsDTO implements IModel {

	private static final long serialVersionUID = 1L;

	private String version;

	private String name;
	private String administrator;
	private String bandWidthIn;
	private String bandWidthOut;
	private String activeSession;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdministrator() {
		return administrator;
	}

	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}

	public String getBandWidthIn() {
		return bandWidthIn;
	}

	public void setBandWidthIn(String bandWidthIn) {
		this.bandWidthIn = bandWidthIn;
	}

	public String getBandWidthOut() {
		return bandWidthOut;
	}

	public void setBandWidthOut(String bandWidthOut) {
		this.bandWidthOut = bandWidthOut;
	}

	public String getActiveSession() {
		return activeSession;
	}

	public void setActiveSession(String activeSession) {
		this.activeSession = activeSession;
	}

	@Override
	public String toString() {
		return "ServerDetailsDTO [version=" + version + ", name=" + name + ", administrator=" + administrator
				+ ", bandWidthIn=" + bandWidthIn + ", bandWidthOut=" + bandWidthOut + ", activeSession=" + activeSession
				+ "]";
	}

}

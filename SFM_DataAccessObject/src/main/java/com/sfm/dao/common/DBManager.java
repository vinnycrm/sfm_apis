package com.sfm.dao.common;

public class DBManager extends AbstractDBManager {
	private static final String configPath = "com/sfm/dao/SFMMybatisConfig.xml";

	private static DBManager INSTANCE = null;

	private DBManager(String configPath) {
		super(configPath);
	}

	public static DBManagerInterface getInstance() {
		if (INSTANCE != null) {
			return INSTANCE;
		} else {
			INSTANCE = new DBManager(configPath);
			return INSTANCE;
		}
	}
}

package com.sfm.webservices.listener;

import javax.servlet.ServletContextEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoaderListener;

import com.sfm.dao.common.DBManager;

public class ApplicationContextLoader extends ContextLoaderListener {
	private static final Logger OUT = LoggerFactory.getLogger(ApplicationContextLoader.class);

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {

			intDatabase();
			OUT.info("***********************************************************");
			OUT.info("         SFM Webservice initialized successfully.          ");
			OUT.info("***********************************************************");
		} catch (Exception e) {
			OUT.error("SFM Exception :", e);
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		super.contextDestroyed(arg0);
		OUT.info("***********************************************************");
		OUT.info("         SFM Webservice uninitialized successfully.          ");
		OUT.info("***********************************************************");
	}

	private void intDatabase() {
		DBManager.getInstance();
	}
}

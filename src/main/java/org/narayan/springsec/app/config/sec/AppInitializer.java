package org.narayan.springsec.app.config.sec;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class AppInitializer extends AbstractSecurityWebApplicationInitializer {

	public AppInitializer() {
		super(AppSecContext.class);
	}
}

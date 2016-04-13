package org.narayan.springsec.app.config.sec;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * 
 * @author unmattavesa
 *
 */
public class AppInitializer implements WebApplicationInitializer {

	private static final int LOAD_ON_STARTUP = 1;
	private static final String URL_MAPPING = "/";
	private static final String DISPATCHER_SERVLET = "dispatcherServlet";
	
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(AppContext.class);
		context.setDisplayName("spring-sec-learning");
		
		servletContext.addListener(new ContextLoaderListener(context));
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet(DISPATCHER_SERVLET, dispatcherServlet);
		dispatcher.addMapping(URL_MAPPING);
		dispatcher.setLoadOnStartup(LOAD_ON_STARTUP);
		
		
	}
	
	
}

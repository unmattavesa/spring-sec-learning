package org.narayan.springsec.app.config.sec;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "org.narayan.springsec.app" })
public class AppContext extends WebMvcConfigurerAdapter {

	private static final String VIEW_PREFIX = "/WEB-INF/views/";
	private static final String VIEW_SUFFIX = ".jsp";
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		return new InternalResourceViewResolver() {{
			setPrefix(VIEW_PREFIX);
			setSuffix(VIEW_SUFFIX);
		}};
	}

	
}

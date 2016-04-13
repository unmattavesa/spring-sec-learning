package org.narayan.springsec.app.config.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 
 * @author unmattavesa
 *
 */
//@EnableWebSecurity
public class AppSecContext extends WebSecurityConfigurerAdapter {

//	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
				.withUser("narayana")
					.password("secret")
						.roles("USER", "ADMIN");
	}
}

package com.s1mob.mini_ecommerce_project.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ServletInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup (ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ctx =
				new AnnotationConfigWebApplicationContext();
		ctx.register(WebMvcConfig.class);
		ctx.register(HibernateConfig.class);
		ctx.register(SpringSecurityConfig.class);
		ctx.setServletContext(servletContext);

		ServletRegistration.Dynamic servlet =
				servletContext.addServlet("springDispatcherServlet",
						new DispatcherServlet(ctx));

		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
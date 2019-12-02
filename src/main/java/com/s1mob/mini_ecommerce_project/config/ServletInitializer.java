package com.s1mob.mini_ecommerce_project.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ServletInitializer implements WebApplicationInitializer {

//	@Override
//	protected Class<?>[] getRootConfigClasses() {
//		return new Class[] { HibernateConfig.class };
//	}
//
//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		return new Class[] { WebMvcConfig.class };
//	}
//
//	@Override
//	protected String[] getServletMappings() {
//		return new String[] { "/" };
//	}

	@Override
	public void onStartup (ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext ctx =
				new AnnotationConfigWebApplicationContext();
		ctx.register(WebMvcConfig.class);
		ctx.register(HibernateConfig.class);
		ctx.setServletContext(servletContext);

		ServletRegistration.Dynamic servlet =
				servletContext.addServlet("springDispatcherServlet",
						new DispatcherServlet(ctx));

		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
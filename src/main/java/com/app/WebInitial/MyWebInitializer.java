//package com.app.WebInitial;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.context.support.XmlWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import com.app.config.AppConfig;
//
//public class MyWebInitializer implements WebApplicationInitializer {
//
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		// TODO Auto-generated method stub
//		
////		XmlWebApplicationContext webapp = new XmlWebApplicationContext();
////		webapp.setConfigLocation("classpath:app-config.xml");
//		
//		AnnotationConfigWebApplicationContext webapp = new AnnotationConfigWebApplicationContext();
//		webapp.register(AppConfig.class);
//		
//		DispatcherServlet dispatcher =new DispatcherServlet(webapp);
//		
//
//		ServletRegistration.Dynamic registeredServlet = servletContext.addServlet("myDispatcher", dispatcher);
//		
//		registeredServlet.addMapping("/app/*");
//		registeredServlet.setLoadOnStartup(1);
//		
//		
//	}
//
//}

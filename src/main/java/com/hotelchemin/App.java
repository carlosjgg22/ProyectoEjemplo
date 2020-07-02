package com.hotelchemin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class App extends SpringBootServletInitializer
{
	//Archivos war desde tomcat
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
		return app.sources(App.class);
	}
	
	//Archivos JAR
	public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
        System.out.println( "Hola tu aplicación de Maven esta andando correctamente" );
    }
	
}

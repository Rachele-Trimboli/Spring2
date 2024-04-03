package com.epicode.U5D1;

import com.epicode.U5D1.entities.AppConfig;
import com.epicode.U5D1.entities.Menu;
import com.epicode.U5D1.entities.MyRunner;
import com.epicode.U5D1.entities.Ordine;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class U5D1Application{

	public static void main(String[] args) throws Exception {
		SpringApplication.run(U5D1Application.class, args);

		MyRunner m = new MyRunner();
		m.run();


	}

}
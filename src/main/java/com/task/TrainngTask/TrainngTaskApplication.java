package com.task.TrainngTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.task.controller.ModelController;

@ComponentScan("com.task")
@SpringBootApplication
public class TrainngTaskApplication implements CommandLineRunner {
	@Autowired
	private ModelController modelController;

	public static void main(String[] args) {
		SpringApplication.run(TrainngTaskApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		modelController.TrainModel();
	}

}

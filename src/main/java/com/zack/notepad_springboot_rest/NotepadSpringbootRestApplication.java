package com.zack.notepad_springboot_rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.zack.notepad_springboot_rest.*")
@EnableJpaRepositories("com.zack.notepad_springboot_rest.*")
public class NotepadSpringbootRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotepadSpringbootRestApplication.class, args);
    }
}

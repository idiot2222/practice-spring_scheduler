package me.boguen.cheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling  // Scheduler 사용을 위한 어노테이션 설정
public class PracticeSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeSchedulerApplication.class, args);
    }

}

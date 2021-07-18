package me.boguen.cheduler.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

@Configuration // Scheduler 관련 설정
public class SchedulerConfig implements SchedulingConfigurer {

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        ThreadPoolTaskScheduler tpts = new ThreadPoolTaskScheduler();

        tpts.setPoolSize(1);   // default = 1인데 걍 해봄.
        tpts.initialize();

        taskRegistrar.setTaskScheduler(tpts);
    }

}

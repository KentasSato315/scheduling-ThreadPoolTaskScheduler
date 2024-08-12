package scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

@Getter
@Component
@Configuration
public class TaskSchedulerConfiguration {

    @Value("${scheduler.task.scheduling.cron}")
    private String cron;

    @Bean
    public ThreadPoolTaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        taskScheduler.setPoolSize(1);
        taskScheduler.setThreadNamePrefix("SampleScheduleTask-");
        return taskScheduler;
    }
}

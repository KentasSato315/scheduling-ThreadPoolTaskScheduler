package scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulingThreadPoolTaskSchedulerApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SchedulingThreadPoolTaskSchedulerApplication.class, args);
    }

    /**
     * @see SpringBootServletInitializer#configure(SpringApplicationBuilder)
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SchedulingThreadPoolTaskSchedulerApplication.class);
    }
}

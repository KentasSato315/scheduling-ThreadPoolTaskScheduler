package scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.runner;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.Task.SampleTask;
import scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.Task.SampleTaskManager;
import scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.config.TaskSchedulerConfiguration;

@Configuration
@RequiredArgsConstructor
public class TaskStartupRunner implements ApplicationRunner {

    private final SampleTaskManager sampleTaskManager;

    private final SampleTask sampleTask;

    private final TaskSchedulerConfiguration schedulerConfiguration;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        sampleTaskManager.startTask(sampleTask::sampleTask,
                schedulerConfiguration.getCron());
    }
}

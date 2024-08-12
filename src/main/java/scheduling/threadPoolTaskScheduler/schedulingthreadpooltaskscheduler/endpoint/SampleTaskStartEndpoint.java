package scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.endpoint;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;
import scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.Task.SampleTask;
import scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.Task.SampleTaskManager;
import scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.config.TaskSchedulerConfiguration;

@Component
@Endpoint(id="sampleTaskStart")
@RequiredArgsConstructor
@Slf4j
public class SampleTaskStartEndpoint {

    private final SampleTaskManager taskManager;

    private final SampleTask task;

    private final TaskSchedulerConfiguration schedulerConfiguration;

    @WriteOperation
    public void start() {
        boolean taskStarted = taskManager.startTask(task::sampleTask, schedulerConfiguration.getCron());
        log.info("Sample task {}", taskStarted ? "started" : "not started");
    }
}

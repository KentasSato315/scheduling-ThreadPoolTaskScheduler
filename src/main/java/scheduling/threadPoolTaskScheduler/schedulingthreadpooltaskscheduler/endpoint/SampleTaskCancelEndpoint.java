package scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.endpoint;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;
import scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.Task.SampleTaskManager;

@Component
@Endpoint(id="sampleTaskCancel")
@RequiredArgsConstructor
@Slf4j
public class SampleTaskCancelEndpoint {

    private final SampleTaskManager taskManager;

    @WriteOperation
    public void cancelTask() {
        boolean taskStarted = taskManager.cancelTask();
        log.info("Sample task {}", taskStarted ? "cancelled" : "not cancelled");
    }
}

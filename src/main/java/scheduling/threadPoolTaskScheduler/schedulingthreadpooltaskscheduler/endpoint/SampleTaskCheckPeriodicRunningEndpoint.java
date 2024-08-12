package scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.endpoint;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.Task.SampleTaskManager;

@Component
@Endpoint(id="sampleTaskCheckPeriodicRunning")
@RequiredArgsConstructor
@Slf4j
public class SampleTaskCheckPeriodicRunningEndpoint {

    private final SampleTaskManager taskManager;

    @ReadOperation
    public void checkPeriodicRunning() {
        log.info("Sample task is {}", taskManager.isPeriodicRunning() ? "periodic running" : "periodic not running");
    }
}

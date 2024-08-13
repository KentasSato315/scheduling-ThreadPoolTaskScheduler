package scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.task;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class SampleTask {

    @Value("${spring.application.name}")
    private String applicationName;

    public void sampleTask() {
        log.info("{}: を開始します。", applicationName);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            log.info("{}: を終了します。", applicationName);
        }
    }
}

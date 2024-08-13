package scheduling.threadPoolTaskScheduler.schedulingthreadpooltaskscheduler.task;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class SampleTaskManager {

    private final ThreadPoolTaskScheduler taskScheduler;

    private ScheduledFuture<?> scheduledFuture;

    /**
     * 定期実行を開始する
     */
    public boolean startTask(Runnable task, String cron) {
        try {
            if (!isPeriodicRunning()) {
                scheduledFuture = taskScheduler.schedule(task, new CronTrigger(cron));
                return true;
            }
        } catch (RejectedExecutionException e) {
            log.error("Error has occurred. message={}.", e.getMessage());
        }
        return false;
    }

    /**
     * 定期実行をキャンセルする（実行中のタスクを中断せずにキャンセル）
     */
    public boolean cancelTask() {
        if (scheduledFuture != null) {
            return scheduledFuture.cancel(false);
        }
        return false;
    }

    /**
     * 定期実行が実行中かどうかを判定
     *
     * @return 定期実行が実行中の場合はtrue、それ以外の場合はfalse
     */
    public boolean isPeriodicRunning() {
        return scheduledFuture != null && !scheduledFuture.isCancelled();
    }
}

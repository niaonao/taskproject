package pers.niaonao.taskweb;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import pers.niaonao.taskservice.UserAssetTask;

import javax.annotation.Resource;

/**
 * @Description :定时器
 * @Author:
 * @Date: 2018/9/20 15:17
 */
@Component
public class AutoTask {

    @Resource
    private UserAssetTask userAssetTask;

    /**
     * 用户资产定时更新任务
     * 10s 更新一次
     */
    @Scheduled(cron="0/10 * *  * * ? ")
    public void platformUserAssetUpdate(){
        userAssetTask.platformUserAssetUpdate();
    }
}
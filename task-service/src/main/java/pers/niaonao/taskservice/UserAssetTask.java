package pers.niaonao.taskservice;

import org.springframework.stereotype.Service;

/**
 * @Description :用户资产任务
 * @Author: niaonao
 * @Date: 2018/9/20 15:20
 */
@Service(value = "userAssetTask")
public class UserAssetTask {

    /**
     * 平台用户资产更新任务
     */
    public void platformUserAssetUpdate(){
        // 调用你的service、util、entity 等，编写你的定时任务业务代码
        System.out.println("平台用户资产更新完成！");
    }
}
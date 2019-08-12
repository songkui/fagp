package com.fagp.basics.sdp.quartz;

import com.fagp.basics.dc.model.user.UserDomain;
import com.fagp.basics.dc.service.user.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Auther: SK
 * @Date: 2019/8/3 22:50
 * @Description:
 */
@Component
public class RedisWriteDBQuartz {

    @Autowired
    private UserService userService;

    //    每分钟启动
//    @Scheduled(cron = "0/10 * * * * ?")
    public void timerToNow(){
        PageInfo<UserDomain> pageInfo = userService.findAllUser(0, 10);
        pageInfo.getList().stream().forEach(userDomain -> {
            System.out.println(userDomain.getPhone());
        });
        System.out.println("======每分钟执行一次");

    }

}

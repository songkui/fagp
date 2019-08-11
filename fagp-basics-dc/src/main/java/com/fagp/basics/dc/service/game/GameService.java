package com.fagp.basics.dc.service.game;

import com.fagp.basics.dc.dao.game.GameDao;
import com.fagp.basics.dc.model.game.Game;
import com.fagp.basics.dc.model.user.UserDomain;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Test
 */
@Service
@Transactional
public class GameService {

    @Autowired
    private GameDao gameDao;//这里会报错，但是并不会影响

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private Gson gson;

    public int addGame(Game game) {

        return gameDao.insert(game);
    }

    /*
    * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
    * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
    * pageNum 开始页数
    * pageSize 每页显示的数据条数
    * */
    public PageInfo<UserDomain> findAllGame(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<Game> userDomains = gameDao.selectGame();
        PageInfo result = new PageInfo(userDomains);
        stringRedisTemplate.opsForValue().set("user:2", gson.toJson(result));
        return result;
    }
}

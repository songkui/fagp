package com.fagp.basics.sdp.controller;


import com.fagp.basics.dc.model.game.Game;
import com.fagp.basics.dc.model.user.UserDomain;
import com.fagp.basics.dc.service.game.GameService;
import com.fagp.basics.dc.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/8/16.
 */
@Controller
@RequestMapping(value = "/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(Game user){
        return gameService.addGame(user);
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllGame(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize){
        return gameService.findAllGame(pageNum,pageSize);
    }
}

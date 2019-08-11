package com.fagp.basics.dc.dao.game;



import com.fagp.basics.dc.model.game.Game;
import com.fagp.basics.dc.model.user.UserDomain;

import java.util.List;

public interface GameDao {


    int insert(Game record);



    List<Game> selectGame();
}
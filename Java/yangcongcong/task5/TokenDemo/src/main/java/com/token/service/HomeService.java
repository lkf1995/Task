package com.token.service;


import com.token.model.Home;

import java.util.List;

public interface HomeService {
    int addHome(Home home);

    int  deleteHome(long id);

    int updateHome(Home home);

    Home getById(long id);

    List<Home> getAll();
}

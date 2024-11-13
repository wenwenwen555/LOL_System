package com.kun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kun.pojo.Hero;
import com.kun.service.HeroService;
import com.kun.mapper.HeroMapper;
import org.springframework.stereotype.Service;

/**
* @author WenHua
* @description 针对表【lol_hero(英雄表)】的数据库操作Service实现
* @createDate 2024-11-13 21:14:37
*/
@Service
public class HeroServiceImpl extends ServiceImpl<HeroMapper, Hero>
    implements HeroService{

}





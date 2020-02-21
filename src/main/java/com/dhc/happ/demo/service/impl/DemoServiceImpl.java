package com.dhc.happ.demo.service.impl;

import com.dhc.happ.demo.mapper.WgKqMeetingMapper;
import com.dhc.happ.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;

public class DemoServiceImpl implements DemoService {

    @Autowired
    private WgKqMeetingMapper wgKqMeetingMapper;


    @Override
    public String getString() {
        return null;
    }
}

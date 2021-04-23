package com.hospital.demo.controller;

import com.hospital.demo.dao.DetectionMapper;
import com.hospital.demo.domain.Detection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DelectionController {
    @Autowired
    private DetectionMapper detectionMapper;

    @RequestMapping("/insertDetection")
    public Integer insertDetection(Detection d){
        return detectionMapper.insertDetection(d);
    }

    @RequestMapping("/deleteDetection")
    public Integer deleteDetection(Integer id){
        return detectionMapper.deleteDetection(id);
    }

    @RequestMapping("/updateDetection")
    public Integer updateDetection(Detection d){
        return detectionMapper.updateDetection(d);
    }

    @RequestMapping("/searchDetection")
    public List<Detection> searchDetection(Integer id) {
        return detectionMapper.searchDetection(id);
    }

}


package com.hospital.demo.dao;

import com.hospital.demo.domain.Detection;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DetectionMapper {
    public Integer insertDetection(Detection d);
    public Integer deleteDetection(Integer id);
    public Integer updateDetection(Detection d);
    public List<Detection> searchDetection(Integer id);
}

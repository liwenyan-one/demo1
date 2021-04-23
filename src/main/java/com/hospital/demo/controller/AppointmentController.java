package com.hospital.demo.controller;

import com.hospital.demo.dao.AppointmentMapper;
import com.hospital.demo.domain.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppointmentController {
    @Autowired
    private AppointmentMapper appointmentMapper;

    @RequestMapping("searchAllAppointment")
    public List<Appointment> searchAllAppointment(){
        return appointmentMapper.searchAllAppointment();
    }

    @RequestMapping("searchAppointmentByRecord_id")
    public List<Appointment> searchAppointmentByRecord_id(Integer record_id){
        return appointmentMapper.searchAppointmentByRecord_id(record_id);
    }

    @RequestMapping("searchAppointmentByName")
    public List<Appointment> searchAppointmentByName(String name){
        return appointmentMapper.searchAppointmentByName(name);
    }

    @RequestMapping("searchAppointmentByTel")
    public List<Appointment> searchAppointmentByTel(String tel){
        return appointmentMapper.searchAppointmentByTel(tel);
    }

    @RequestMapping("insertAppointment")
    public Integer insertAppointment(Appointment a){
        return appointmentMapper.insertAppointment(a);
    }

}

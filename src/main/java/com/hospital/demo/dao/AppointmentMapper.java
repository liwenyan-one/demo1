package com.hospital.demo.dao;

import com.hospital.demo.domain.Appointment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AppointmentMapper {
    public List<Appointment> searchAllAppointment();
    public List<Appointment> searchAppointmentByRecord_id(Integer id);
    public List<Appointment> searchAppointmentByName(String name);
    public List<Appointment> searchAppointmentByTel(String tel);

    public Integer insertAppointment(Appointment a);
}

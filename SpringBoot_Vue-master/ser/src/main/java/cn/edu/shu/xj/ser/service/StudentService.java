package cn.edu.shu.xj.ser.service;


import cn.edu.shu.xj.ser.entity.Student;
import cn.edu.shu.xj.ser.mapper.StudentMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Provider;
import java.util.ServiceLoader;


@Service
public class StudentService extends ServiceImpl<StudentMapper,Student> implements IstudentService{

    @Autowired
    StudentMapper studentMapper;

    public Student findOneStudent(Integer sid){

        return studentMapper.findOneStudent(sid);
    }

    @Override
    public Integer findStudentAge(String name) {
        return studentMapper.queryStudentAge(name);
    }

}

package cn.edu.shu.xj.ser.service;

import cn.edu.shu.xj.ser.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IstudentService extends IService<Student> {
    //找到该id的学生信息
    Student findOneStudent(Integer sid);

    Integer findStudentAge(String name);
}

package cn.edu.shu.xj.ser.controller;


import cn.edu.shu.xj.ser.entity.Student;
import cn.edu.shu.xj.ser.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ServiceLoader;

@Api(tags = "测试接口")
@RestController
public class HelloController {

    @Autowired
    StudentService studentService;

    @ApiOperation(value = "查询学生")
    @GetMapping("/query")
    public Student queryStudent(Integer sid){
        Student oneStudent = studentService.findOneStudent(sid);
        return oneStudent;
    }

    @ApiOperation(value = "查询学生")
    @GetMapping("/query")
    public String getStudent(Integer sid){
        Student oneStudent = studentService.findOneStudent(sid);
        if(oneStudent != null){
            return oneStudent.getName();
        }else{
            return "未找到该学生";
        }
    }

    @ApiOperation(value = "查询学生年龄")
    @GetMapping("/queryAge")
    public Integer queryStudentAge(String name){
        Integer age = studentService.findStudentAge(name);
        return age;
    }

    //通用查询接口
    @ApiOperation(value = "查询学生信息")
    @GetMapping("/list")
    public List<Student> queryStudent(){
        return studentService.list();
    }

    @ApiOperation(value = "查询学生数量")
    @GetMapping("/count")
    public Integer countStudent() {
        return studentService.count();
    }
}

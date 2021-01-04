package com.ximi.mybatis.demo;

import com.ximi.mybatis.demo.mapper.StudentMapper;
import com.ximi.mybatis.demo.pojo.Student;
import com.ximi.mybatis.demo.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StudentTest {

    @Test
    public void getStudentAndTeacher() {
        SqlSession sqlSession = MyBatisUtils.getSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentAndTeacherList = studentMapper.getStudentAndTeacher();
        for (Student student : studentAndTeacherList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}


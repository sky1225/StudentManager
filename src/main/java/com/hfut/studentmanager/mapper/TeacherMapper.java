package com.hfut.studentmanager.mapper;

import com.hfut.studentmanager.pojo.Teacher;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {

    @Select("select * from teacher")
    public List<Teacher> findAllTeacher();

    @Select("select * from teacher where id=#{id}")
    public Teacher findTeacherById(Integer id);

    @Select("select id from teacher where number=#{number}")
    public Integer findIdByNumber(@Param("number") String number);

    @Insert("insert into teacher(number, name, sex, phone, qq) values" +
            "(#{number}, #{name}, #{sex}, #{phone}, #{qq})")
    public boolean insertTeacher(Teacher teacher);

    @Delete("delete from teacher where id=#{id}")
    public boolean deleteTeacher(Integer id);
}

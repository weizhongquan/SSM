package com.wzq.service;

import com.wzq.domain.StudentInfo;

import java.util.List;

public interface IStudentInfoService {
    /**
     * 获取列表
     * @return
     */
    List<StudentInfo> getList();

    /**
     * 根据id查询记录
     * @param id
     * @return
     */
    StudentInfo findById(Integer id);

    /**
     * 保存一条记录
     * @param studentInfo
     */
    void save(StudentInfo studentInfo);

    /**
     * 更新一条记录
     * @param studentInfo
     */
    void update(StudentInfo studentInfo);

    /**
     * 删除一条记录
     * @param id
     */
    void delete(Integer id);
}

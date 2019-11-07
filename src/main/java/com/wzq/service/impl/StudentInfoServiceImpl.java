package com.wzq.service.impl;

import com.wzq.dao.IStudentInfoDao;
import com.wzq.domain.StudentInfo;
import com.wzq.service.IStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentInfoService")
public class StudentInfoServiceImpl implements IStudentInfoService {

    @Autowired
    private IStudentInfoDao studentInfoDao;

    //@Autowired
    ///private AccountDao accountDao;


    @Override
    public List<StudentInfo> getList() {
        return studentInfoDao.getList();
    }

    @Override
    public StudentInfo findById(Integer id) {
        return studentInfoDao.findById(id);
    }

    @Override
    public void save(StudentInfo studentInfo) {

        studentInfoDao.save(studentInfo);
    }

    @Override
    public void update(StudentInfo studentInfo) {
        studentInfoDao.update(studentInfo);
    }

    @Override
    public void delete(Integer id) {
        studentInfoDao.delete(id);
    }
}

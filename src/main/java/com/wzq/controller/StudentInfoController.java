package com.wzq.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzq.domain.Msg;
import com.wzq.domain.StudentInfo;
import com.wzq.service.IStudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//@Controller和@ResponseBody的结合

public class StudentInfoController {

    @Autowired
    private IStudentInfoService studentInfoService;

    @GetMapping(path="/studentinfo.do")
    //相当于下面@RequestMapping(path="/studentinfo",method = RequestMethod.GET)
    public Msg getListWithJson(Integer pageNo){

        //这是一个分页查询
        //引入PageHelp分页插件
        //在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(pageNo,8);//自动添加limit 0,8
        //startPage后面紧跟的查询就是分页查询
        List<StudentInfo> studentInfoList= studentInfoService.getList();
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        //封装了详细的分页信息,传入连续显示的页数
        PageInfo pageInfo=new PageInfo(studentInfoList,5);
        return Msg.sucess().add("pageInfo",pageInfo);
    }

    /**
     * 保存学生信息
     * @param studentInfo
     * @return
     */
    @PostMapping("/studentinfo.do")
    //@RequestMapping(path="/studentinfo",method = RequestMethod.POST)
    public Msg save(StudentInfo studentInfo){
        System.out.println(studentInfo);
        studentInfo.setFlag("0");
        studentInfoService.save(studentInfo);
        return Msg.sucess();
    }

    /**
     * 更新
     * @param studentInfo
     * @return
     */
    @PutMapping("/studentinfo/{id}.do")
    public Msg update(StudentInfo studentInfo){
        System.out.println(studentInfo);
        studentInfo.setFlag("0");
        studentInfoService.update(studentInfo);
        return Msg.sucess();

    }


    /**
     * 删除
     * @param id
     * @return
     */
    @DeleteMapping("/studentinfo/{id}.do")
    public Msg delete(@PathVariable("id") Integer id){
        System.out.println("id:"+id);
        studentInfoService.delete(id);
        return Msg.sucess();
    }


}

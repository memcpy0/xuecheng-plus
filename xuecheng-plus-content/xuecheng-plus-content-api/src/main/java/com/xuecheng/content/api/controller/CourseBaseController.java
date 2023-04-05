package com.xuecheng.content.api.controller;

import com.xuecheng.content.service.CourseBaseInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 课程基本信息 前端控制器
 * </p>
 *
 * @author memcpy0
 */
@Slf4j
@RestController
@RequestMapping("courseBase")
public class CourseBaseController {

    @Autowired
    private CourseBaseInfoService  courseBaseInfoService;
}

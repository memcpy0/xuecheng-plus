package com.xuecheng.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @author memcpy0
 * @version 1.0
 * @description 课程信息管理业务接口
 * @date 2022/9/6 21:45
 */
public interface CourseBaseInfoService extends IService<CourseBase> {

    /**
     * @description 课程分页查询
     * @param pageParams 分页查询的参数
     * @param courseParamsDto 查询条件
     * @return com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase> 查询结果
     * @author memcpy0
     * @date 2023/4/5 16:21
     */
    public PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto courseParamsDto);
}

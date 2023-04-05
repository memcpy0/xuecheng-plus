package com.xuecheng.content;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author memcpy0
 * @version 1.0
 * @description 课程信息管理业务实现类测试
 * @date 2023/4/5 16:28
 */
@SpringBootTest
public class CourseBaseInfoServiceTests {
    @Autowired
    CourseBaseInfoService courseBaseInfoService;
    @Test
    public void testCourseBaseInfoService() {
        // 详细进行分页查询的单元测试
        QueryCourseParamsDto courseParamsDto = new QueryCourseParamsDto();
        courseParamsDto.setCourseName("java"); // 课程名称查询条件
        courseParamsDto.setAuditStatus("202004"); // 表示课程审核通过
        // 创建Page分页参数对象，参数：当前页码，每页记录数
        PageParams pageParams = new PageParams();
        pageParams.setPageNo(1L);
        pageParams.setPageSize(2L);

        PageResult<CourseBase> courseBasePageResult = courseBaseInfoService.queryCourseBaseList(pageParams, courseParamsDto);
        System.out.println(courseBasePageResult);
    }
}

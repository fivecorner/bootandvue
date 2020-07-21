package io.github.forezp.modules.system.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.github.forezp.modules.system.entity.SysLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author forezp
 * @since 2019-07-26
 */
@Mapper
public interface SysLogMapper extends BaseMapper<SysLog> {

    IPage<SysLog> selectPageSysLog(Page page, @Param("createBy") String createBy,
                                   @Param("method") String method,
                                   @Param("beginTime") String beginTime,
                                   @Param("endTime") String endTime);

}

package com.chenm.common.mapper;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface ProBaseMapper<T> extends BaseMapper<T>, MySqlMapper<T> {
}

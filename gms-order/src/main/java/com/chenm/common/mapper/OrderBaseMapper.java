package com.chenm.common.mapper;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface OrderBaseMapper<T> extends BaseMapper<T>, MySqlMapper<T> {
}

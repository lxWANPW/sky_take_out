package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author sky
 * @date 2023/10/8
 * @description 自动填充注解
 * 用于标识某个方法需要进功能字段自动填充处理
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //操作类型：Update，Insert
    /**
     * 操作类型
     * @return
     */
    OperationType value();

}

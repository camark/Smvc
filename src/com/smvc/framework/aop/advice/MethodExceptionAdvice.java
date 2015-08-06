/**
 * @filename MethodExceptionAdvice.java
 * @createtime 2015年8月2日
 * @author dingxiangyong
 * @comment 
 */
package com.smvc.framework.aop.advice;

import java.lang.reflect.Method;

/**
 * @author Big Martin
 *
 */
public abstract class MethodExceptionAdvice extends BaseAdvice{
    /**
     * Do something before method invoking.
     * @param method
     * @param args
     */
    protected void doBefore(Method method, Object[] args)
    {
        return;
    }
    
    /**
     * Do something after method invoked.
     * Note: if method return nothing, the resultVal will be null.
     * @param method
     * @param args
     * @param resutlVal 
     */
    protected void doAfter(Method method, Object[] args, Object resutlVal)
    {
        return;
    }
}

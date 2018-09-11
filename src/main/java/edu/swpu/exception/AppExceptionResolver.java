package edu.swpu.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ${自定义异常解析器}
 * cdzhuzhiyong
 * 2018/9/8 15:04
 **/
public class AppExceptionResolver  implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                         Object handler, Exception e) {
        e.printStackTrace();
        String message;
        AppException appException = null;
        if (e instanceof AppException){
            appException = (AppException)e;
        }else {
            appException = new AppException("系统繁忙,请稍后再试");
        }
        message = appException.getMessage();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message",message);
        modelAndView.setViewName("error");
        return modelAndView;
    }
}

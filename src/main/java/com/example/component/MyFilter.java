package com.example.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@Slf4j
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("start filter..");
        MyHttpServletRequestWrapper requestWrapper = new MyHttpServletRequestWrapper((HttpServletRequest) servletRequest);
        log.info("request body : {}", requestWrapper.getBody());
        filterChain.doFilter(requestWrapper, servletResponse);
        log.info("end filter..");
    }
}

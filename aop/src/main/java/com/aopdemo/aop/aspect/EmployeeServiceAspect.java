package com.aopdemo.aop.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EmployeeServiceAspect {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceAspect.class) ;

    @Before(value = "execution(* com.aopdemo.aop.Service.EmployeeService.*(..)) && args( empId,  name ,  age)")
    public void beforeAdvice(JoinPoint joinPoint, String empId, String name, int age){
        logger.info("Before Method: " + joinPoint.getSignature());
        logger.info("Creating Employee with name- " + name + " and age- "+ age);
    }
}

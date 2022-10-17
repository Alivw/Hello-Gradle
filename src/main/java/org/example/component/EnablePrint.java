package org.example.component;

import java.lang.annotation.*;

/**
 * @description:
 * @author: Jalivv
 * @create: 2022-10-17 16:12
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface EnablePrint {

    String value();
}

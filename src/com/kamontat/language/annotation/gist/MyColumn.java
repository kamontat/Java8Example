package com.kamontat.language.annotation.gist;

import java.lang.annotation.*;

/**
 * @author kamontat
 * @since 7/5/59 - 14:04
 */
@Retention(RetentionPolicy.RUNTIME) //กำหนดว่าใช้เวลา Runtime
// in java 8 can have 2 new element type to describe context
// example "@Target( { ElementType.TYPE_USE, ElementType.TYPE_PARAMETER } )"
@Target({ElementType.FIELD}) //กำหนดว่าใช้กับ Field
public @interface MyColumn {
	String name();
}

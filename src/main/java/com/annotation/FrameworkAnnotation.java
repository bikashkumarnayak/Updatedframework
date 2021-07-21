package com.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.Enum.CatagaryType;

@Retention(RUNTIME)
@Target(METHOD)
public @interface FrameworkAnnotation {

	public String[] authors();
	public CatagaryType[] category();
}

package com.kamontat.language.annotation.gist;

import java.lang.reflect.Field;

/**
 * @author kamontat
 * @since 7/5/59 - 14:05
 */
public class Main {
	public static void main(String[] args) {
		MyObject o = new MyObject("Jonathan", "Jo", "GREEN");
		//อีกเทคนิคหนึ่งที่ใช้ร่วมกับ Annotation คือ reflect เพื่อเรียกดูข้อมูลของ Class
		Class klazz = o.getClass();
		//ดู field ทั้งหมดที่ประกาศ
		for (Field f : klazz.getDeclaredFields()) {
			MyColumn myCol = f.getAnnotation(MyColumn.class);
			if (myCol != null) System.out.println("anno_name:" + myCol.name() + ",field_name:" + f.getName());
		}
	}
}

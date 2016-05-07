package com.kamontat.language.annotation.gist;

/**
 * @author kamontat
 * @since 7/5/59 - 14:03
 */

public class MyObject {
	@MyColumn(name = "COL_NAME")
	private String name;
	@MyColumn(name = "COL_NICKNAME")
	private String nickname;
	@MyColumn(name = "COL_COLOR")
	private String color;

	public MyObject() {
	}

	public MyObject(String name, String nickname, String color) {
		this.name = name;
		this.nickname = nickname;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
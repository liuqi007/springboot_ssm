package com.jip.springboot_ssm.entity;

/**
 * @Time:2018/11/15 19:37
 * @Author:Jip
 * @Version:1.0
 */
public class Dept {
	private Integer uuid;
	private String name;
	private Integer tele;

	public Integer getUuid() {
		return uuid;
	}

	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTele() {
		return tele;
	}

	public void setTele(Integer tele) {
		this.tele = tele;
	}

	@Override
	public String toString() {
		return "Dept{" +
				"uuid=" + uuid +
				", name='" + name + '\'' +
				", tele=" + tele +
				'}';
	}
}

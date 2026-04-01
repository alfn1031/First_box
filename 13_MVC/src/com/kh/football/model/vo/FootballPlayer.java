package com.kh.football.model.vo;

import java.util.Objects;

// 우리가 UPDATE를 구현하는데 record로 구현하면
// 필드에 final키워드가 붙어 수정이 불가능해지기 떄문에
public class FootballPlayer {
	private int id; // 식별값을 저장할 필드 -> 자료형 -> 실제 들어갈 값 -> 1, 2, 3, ++
	private String name; // 이름 저장할 필드 -> 자료형?? -> 실제 들어갈 값 -> 크리스티아노 도스 산토스 아베이루
	private String position; // 포지션 저장할 필드 -> 자료형 -> 실제 들어갈 값 -> 공격수, 수비수, 미드필더...
	private Integer backNmber; // 등번호 저장할 필드 -> 자료형 -> 실제 들어갈 값 -> 1234
	
	public FootballPlayer(int id, String name, String position, Integer backNumber) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.backNmber = backNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Integer getBackNmber() {
		return backNmber;
	}
	public void setBackNmber(Integer backNmber) {
		this.backNmber = backNmber;
	}
	@Override
	public String toString() {
		return "FootballPlayer [id=" + id + ", name=" + name + ", position=" + position + ", backNmber=" + backNmber
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(backNmber, id, name, position);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FootballPlayer other = (FootballPlayer) obj;
		return Objects.equals(backNmber, other.backNmber) && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(position, other.position);
	}
	
}

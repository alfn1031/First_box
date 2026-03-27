package cim.kh.sw.model.vo;

public class Switch {
	private boolean on;

	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public Switch(boolean on) {
		super();
		this.on = on;
	}
	public Switch() {
		super();
	}
	@Override
	public String toString() {
		return "Switch [on=" + on + "]";
	}
	
	
}

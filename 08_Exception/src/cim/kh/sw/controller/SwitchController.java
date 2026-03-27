package cim.kh.sw.controller;

import cim.kh.sw.model.vo.Switch;
import cim.kh.sw.util.SwitchUtil;
import cim.kh.sw.util.SwitchUtilImpl;

public class SwitchController {
	private Switch s = new Switch(false);
	
	public boolean toggleSwitch() {
		SwitchUtil su = new SwitchUtilImpl();
		boolean on = su.toogle(s);
		return on;
	}
	
	

}

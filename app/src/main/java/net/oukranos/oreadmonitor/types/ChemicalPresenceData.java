package net.oukranos.oreadmonitor.types;

import net.oukranos.oreadmonitor.interfaces.CapturedImageMetaData;;

public class ChemicalPresenceData extends CapturedImageMetaData {
	private int id = 0;
	
	public ChemicalPresenceData(int id) {
		this.id = id;
		
		return;
	}
	
	public ChemicalPresenceData(ChemicalPresenceData data) {
		if (data == null) {
			throw new NullPointerException();
		}
		this.id = data.id;
		this.setCaptureFile(data.getCaptureFileName(), data.getCaptureFilePath());
		
		return;
	}
	
	public int getId() {
		return this.id;
	}
}

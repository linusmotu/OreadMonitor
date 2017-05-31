package net.oukranos.oreadmonitor.interfaces.bridge;

import net.oukranos.oreadmonitor.types.Status;

public interface IFeatureBridge {
	public String getId();
	public String getPlatform();
	public boolean isReady();
	public Status initialize(Object initObject);
}

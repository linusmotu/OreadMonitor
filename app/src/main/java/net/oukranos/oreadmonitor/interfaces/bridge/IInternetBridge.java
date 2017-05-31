package net.oukranos.oreadmonitor.interfaces.bridge;

import net.oukranos.oreadmonitor.types.SendableData;
import net.oukranos.oreadmonitor.types.Status;

public interface IInternetBridge extends IFeatureBridge {
	public Status initialize(Object initObject);
	public Status send(SendableData sendableData);
	public byte[] getResponse();
	public Status destroy();
}

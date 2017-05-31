package net.oukranos.oreadmonitor.interfaces.bridge;

import net.oukranos.oreadmonitor.types.Status;

public interface IConnectivityBridge extends IFeatureBridge {
	public Status initialize(Object initObject);
	public boolean isConnected();
	public String getConnectionType();
	public int getGsmSignalStrength();
	public int getCdmaSignalStrength();
	public int getEvdoSignalStrength();
	public Status destroy();
}

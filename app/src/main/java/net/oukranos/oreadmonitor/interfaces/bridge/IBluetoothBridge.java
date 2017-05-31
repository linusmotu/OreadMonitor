package net.oukranos.oreadmonitor.interfaces.bridge;

import net.oukranos.oreadmonitor.interfaces.BluetoothEventHandler;
import net.oukranos.oreadmonitor.types.Status;

public interface IBluetoothBridge extends IFeatureBridge {

	public Status initialize(Object initObject);
	public Status connectDeviceByAddress(String address);
	public Status connectDeviceByName(String name);
	public Status broadcast(byte[] data);
	public Status destroy();
	public Status setEventHandler(BluetoothEventHandler eventHandler);
}

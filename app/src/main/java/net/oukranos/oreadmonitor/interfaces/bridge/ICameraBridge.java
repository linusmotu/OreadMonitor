package net.oukranos.oreadmonitor.interfaces.bridge;

import net.oukranos.oreadmonitor.interfaces.CapturedImageMetaData;
import net.oukranos.oreadmonitor.types.Status;

public interface ICameraBridge extends IFeatureBridge {
	public Status initialize(Object initObject);
	public Status capture(CapturedImageMetaData container);
	public Status shutdown();
}

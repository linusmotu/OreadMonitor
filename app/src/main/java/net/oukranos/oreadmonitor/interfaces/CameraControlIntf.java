package net.oukranos.oreadmonitor.interfaces;

import net.oukranos.oreadmonitor.types.Status;

public interface CameraControlIntf {
	public Status triggerCameraInitialize();
	public Status triggerCameraCapture(CapturedImageMetaData container);
	public Status triggerCameraShutdown();
}

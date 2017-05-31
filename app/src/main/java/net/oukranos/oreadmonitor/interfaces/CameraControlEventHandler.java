package net.oukranos.oreadmonitor.interfaces;

import net.oukranos.oreadmonitor.types.CameraTaskType;
import net.oukranos.oreadmonitor.types.Status;

public interface CameraControlEventHandler {
	public void onCameraEventDone(CameraTaskType type, Status status);
}

package net.oukranos.oreadmonitor.interfaces;
import net.oukranos.oreadmonitor.types.OreadServiceWaterQualityData;
import net.oukranos.oreadmonitor.types.OreadServiceControllerStatus;
import net.oukranos.oreadmonitor.types.OreadServiceProcStateChangeInfo;
import net.oukranos.oreadmonitor.types.OreadServiceProcChangeInfo;
import net.oukranos.oreadmonitor.types.OreadServiceTaskChangeInfo;
import net.oukranos.oreadmonitor.interfaces.OreadServiceListener;

interface OreadServiceApi {
    void start();
    void stop();
    String runCommand(String command, String params);
    OreadServiceWaterQualityData getData();
    OreadServiceControllerStatus getStatus();
    String getLogs(int lines);
    void addListener(OreadServiceListener listener);
    void removeListener(OreadServiceListener listener);
    OreadServiceProcStateChangeInfo getProcStates();
    OreadServiceProcChangeInfo getProc();
    OreadServiceTaskChangeInfo getTask();
}
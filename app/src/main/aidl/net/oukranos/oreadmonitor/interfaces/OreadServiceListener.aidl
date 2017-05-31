package net.oukranos.oreadmonitor.interfaces;

interface OreadServiceListener {
    void handleWaterQualityData();
    void handleOperationProcStateChanged();
    void handleOperationProcChanged();
    void handleOperationTaskChanged();
}


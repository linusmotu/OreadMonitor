package net.oukranos.oreadmonitor.interfaces;

import org.apache.http.HttpEntity;

public interface HttpEncodableData {
	public HttpEntity encodeDataToHttpEntity();
}

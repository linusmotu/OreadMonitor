package net.oukranos.oreadmonitor.interfaces;

import org.json.JSONObject;

public interface JsonEncodableData {
	public String encodeToJsonString();
	public JSONObject encodeToJsonObject();
}

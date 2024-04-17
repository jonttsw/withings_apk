package com.withings.webservices.legacy.withings.model.airable;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes4.dex */
public class WsAirableNode {
    public List<WsAirableNode> children;

    /* renamed from: id  reason: collision with root package name */
    public String f46862id;
    public long radios;
    public String title;

    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<WsAirableNode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public WsAirableNode deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            JsonElement jsonElement2;
            WsAirableNode wsAirableNode = new WsAirableNode();
            wsAirableNode.f46862id = v1.r0(jsonElement, "id", null);
            wsAirableNode.title = v1.r0(jsonElement, "title", null);
            wsAirableNode.radios = v1.p0(jsonElement, "radios", 0L);
            wsAirableNode.children = new ArrayList();
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject != null && (jsonElement2 = asJsonObject.get("children")) != null && jsonElement2.isJsonArray()) {
                Iterator<JsonElement> it = jsonElement2.getAsJsonArray().iterator();
                while (it.hasNext()) {
                    wsAirableNode.children.add(deserialize(it.next(), type, jsonDeserializationContext));
                }
            }
            return wsAirableNode;
        }
    }
}

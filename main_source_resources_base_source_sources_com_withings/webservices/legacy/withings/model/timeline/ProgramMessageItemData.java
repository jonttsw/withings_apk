package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.PushMessageItemData;
/* loaded from: classes4.dex */
public class ProgramMessageItemData extends PushMessageItemData {
    public static final String WS_TYPE = "programpushmessage";
    public long programId;
    public Concerned source;
    public Concerned target;

    /* loaded from: classes4.dex */
    public static class Concerned {

        /* renamed from: id  reason: collision with root package name */
        public long f46866id;
        public PushMessageItemData.ImageP4 imageP4;
        public String name;
        public String shortName;
        public String type;
    }

    /* loaded from: classes4.dex */
    public static class Serializer extends PushMessageItemData.BaseSerializer<ProgramMessageItemData> {
        private static final String KEY_CONCERNED_ID = "id";
        private static final String KEY_CONCERNED_IMAGE_P4 = "p4";
        private static final String KEY_CONCERNED_NAME = "name";
        private static final String KEY_CONCERNED_SHORT_NAME = "short";
        private static final String KEY_CONCERNED_TYPE = "type";
        private static final String KEY_PROGRAM_ID = "programid";
        private static final String KEY_SOURCE = "source";
        private static final String KEY_TARGET = "target";

        private Concerned deserializeConcerned(JsonObject jsonObject) {
            Concerned concerned = new Concerned();
            concerned.f46866id = v1.p0(jsonObject, "id", 0L);
            if (jsonObject.has(KEY_CONCERNED_IMAGE_P4) && jsonObject.get(KEY_CONCERNED_IMAGE_P4).isJsonObject()) {
                concerned.imageP4 = deserializeImageP4(jsonObject.get(KEY_CONCERNED_IMAGE_P4).getAsJsonObject());
            }
            concerned.name = v1.r0(jsonObject, "name", null);
            concerned.shortName = v1.r0(jsonObject, KEY_CONCERNED_SHORT_NAME, null);
            concerned.type = v1.r0(jsonObject, "type", null);
            return concerned;
        }

        private JsonObject serializeConcerned(Concerned concerned) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("id", Long.valueOf(concerned.f46866id));
            PushMessageItemData.ImageP4 imageP4 = concerned.imageP4;
            if (imageP4 != null) {
                jsonObject.add(KEY_CONCERNED_IMAGE_P4, serializeImageP4(imageP4));
            }
            jsonObject.addProperty("name", concerned.name);
            jsonObject.addProperty(KEY_CONCERNED_SHORT_NAME, concerned.shortName);
            jsonObject.addProperty("type", concerned.type);
            return jsonObject;
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public ProgramMessageItemData newItemData() {
            return new ProgramMessageItemData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.PushMessageItemData.BaseSerializer, com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, ProgramMessageItemData programMessageItemData) {
            super.deserializeIntoData(jsonObject, (JsonObject) programMessageItemData);
            programMessageItemData.programId = v1.p0(jsonObject, KEY_PROGRAM_ID, 0L);
            if (jsonObject.has(KEY_TARGET) && jsonObject.get(KEY_TARGET).isJsonObject()) {
                programMessageItemData.target = deserializeConcerned(jsonObject.get(KEY_TARGET).getAsJsonObject());
            }
            if (jsonObject.has("source") && jsonObject.get("source").isJsonObject()) {
                programMessageItemData.source = deserializeConcerned(jsonObject.get("source").getAsJsonObject());
            }
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.PushMessageItemData.BaseSerializer, com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(ProgramMessageItemData programMessageItemData, JsonObject jsonObject) {
            super.serializeIntoJson((Serializer) programMessageItemData, jsonObject);
            jsonObject.addProperty(KEY_PROGRAM_ID, Long.valueOf(programMessageItemData.programId));
            Concerned concerned = programMessageItemData.target;
            if (concerned != null) {
                jsonObject.add(KEY_TARGET, serializeConcerned(concerned));
            }
            Concerned concerned2 = programMessageItemData.source;
            if (concerned2 != null) {
                jsonObject.add("source", serializeConcerned(concerned2));
            }
        }
    }

    public ProgramMessageItemData() {
        super(WS_TYPE);
    }
}

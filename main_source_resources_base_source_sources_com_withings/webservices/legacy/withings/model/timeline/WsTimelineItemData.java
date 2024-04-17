package com.withings.webservices.legacy.withings.model.timeline;

import android.text.TextUtils;
import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonObject;
import java.io.Serializable;
import u70.f;
/* loaded from: classes4.dex */
public class WsTimelineItemData implements Serializable {
    public String crmId;
    private String wsType;

    /* loaded from: classes4.dex */
    public static abstract class Serializer<D extends WsTimelineItemData> implements f<D> {
        private static final String KEY_CRM_ID = "crmid";

        public abstract void deserializeIntoData(JsonObject jsonObject, D d11);

        public abstract D newItemData();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // u70.f
        public /* bridge */ /* synthetic */ JsonObject serialize(Object obj) {
            return serialize((Serializer<D>) ((WsTimelineItemData) obj));
        }

        public abstract void serializeIntoJson(D d11, JsonObject jsonObject);

        @Override // u70.f
        public final D deserialize(JsonObject jsonObject) {
            D newItemData = newItemData();
            newItemData.crmId = v1.r0(jsonObject, KEY_CRM_ID, null);
            deserializeIntoData(jsonObject, newItemData);
            return newItemData;
        }

        public final JsonObject serialize(D d11) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(KEY_CRM_ID, d11.crmId);
            serializeIntoJson(d11, jsonObject);
            return jsonObject;
        }
    }

    public WsTimelineItemData(String str) {
        this.wsType = str;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof WsTimelineItemData)) {
            return false;
        }
        WsTimelineItemData wsTimelineItemData = (WsTimelineItemData) obj;
        if (!TextUtils.equals(this.crmId, wsTimelineItemData.crmId) || !TextUtils.equals(this.wsType, wsTimelineItemData.wsType)) {
            return false;
        }
        return true;
    }

    public String getWsType() {
        return this.wsType;
    }

    public int hashCode() {
        int i11;
        String str = this.wsType;
        int i12 = 0;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i13 = i11 * 31;
        String str2 = this.crmId;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return i13 + i12;
    }
}

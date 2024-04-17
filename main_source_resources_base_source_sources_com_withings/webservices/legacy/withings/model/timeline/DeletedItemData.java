package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
/* loaded from: classes4.dex */
public class DeletedItemData extends WsTimelineItemData {
    public static final String WS_TYPE = "deleted";
    public long itemid;

    /* loaded from: classes4.dex */
    public static class Serializer extends WsTimelineItemData.Serializer<DeletedItemData> {
        private static final String KEY_ITEM_ID = "itemid";

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, DeletedItemData deletedItemData) {
            deletedItemData.itemid = v1.p0(jsonObject, KEY_ITEM_ID, Long.MIN_VALUE);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public DeletedItemData newItemData() {
            return new DeletedItemData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(DeletedItemData deletedItemData, JsonObject jsonObject) {
            jsonObject.addProperty(KEY_ITEM_ID, Long.valueOf(deletedItemData.itemid));
        }
    }

    public DeletedItemData() {
        super("deleted");
    }
}

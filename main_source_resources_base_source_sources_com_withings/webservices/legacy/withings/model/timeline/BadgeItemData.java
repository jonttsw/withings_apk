package com.withings.webservices.legacy.withings.model.timeline;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
/* loaded from: classes4.dex */
public class BadgeItemData extends WsTimelineItemData {
    public static final String WS_TYPE = "badgev2";
    public String date;
    public String key;
    public String learnMoreImageUrl;
    public String learnMoreUrl;
    public String longDescription;
    public String shareId;
    public String shareText;
    public String shortDescription;
    public String subtitle;
    public String title;
    public String unit;
    public int value;

    /* loaded from: classes4.dex */
    public static class Serializer extends WsTimelineItemData.Serializer<BadgeItemData> {
        private static final String KEY_DATE = "date";
        private static final String KEY_KEY = "key";
        private static final String KEY_LEARN_MORE_IMAGE_URL = "url_lmphoto";
        private static final String KEY_LEARN_MORE_URL = "url_lm";
        private static final String KEY_LONG_DESCRIPTION = "long_desc";
        private static final String KEY_SHARE_ID = "shareid";
        private static final String KEY_SHARE_TEXT = "sharetext";
        private static final String KEY_SHORT_DESCRIPTION = "short_desc";
        private static final String KEY_SUBTITLE = "subtitle";
        private static final String KEY_TITLE = "title";
        private static final String KEY_UNIT = "unit";
        private static final String KEY_VALUE = "value";

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void deserializeIntoData(JsonObject jsonObject, BadgeItemData badgeItemData) {
            badgeItemData.key = v1.r0(jsonObject, "key", null);
            badgeItemData.date = v1.r0(jsonObject, "date", null);
            badgeItemData.title = v1.r0(jsonObject, "title", null);
            badgeItemData.subtitle = v1.r0(jsonObject, KEY_SUBTITLE, null);
            badgeItemData.value = v1.o0(0, "value", jsonObject);
            badgeItemData.unit = v1.r0(jsonObject, "unit", null);
            badgeItemData.shareId = v1.r0(jsonObject, KEY_SHARE_ID, null);
            badgeItemData.shareText = v1.r0(jsonObject, KEY_SHARE_TEXT, null);
            badgeItemData.shortDescription = v1.r0(jsonObject, KEY_SHORT_DESCRIPTION, null);
            badgeItemData.longDescription = v1.r0(jsonObject, KEY_LONG_DESCRIPTION, null);
            badgeItemData.learnMoreUrl = v1.r0(jsonObject, KEY_LEARN_MORE_URL, null);
            badgeItemData.learnMoreImageUrl = v1.r0(jsonObject, KEY_LEARN_MORE_IMAGE_URL, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public BadgeItemData newItemData() {
            return new BadgeItemData();
        }

        @Override // com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData.Serializer
        public void serializeIntoJson(BadgeItemData badgeItemData, JsonObject jsonObject) {
            jsonObject.addProperty("key", badgeItemData.key);
            jsonObject.addProperty("date", badgeItemData.date);
            jsonObject.addProperty("title", badgeItemData.title);
            jsonObject.addProperty(KEY_SUBTITLE, badgeItemData.subtitle);
            jsonObject.addProperty("value", Integer.valueOf(badgeItemData.value));
            jsonObject.addProperty("unit", badgeItemData.unit);
            jsonObject.addProperty(KEY_SHARE_ID, badgeItemData.shareId);
            jsonObject.addProperty(KEY_SHARE_TEXT, badgeItemData.shareText);
            jsonObject.addProperty(KEY_SHORT_DESCRIPTION, badgeItemData.shortDescription);
            jsonObject.addProperty(KEY_LONG_DESCRIPTION, badgeItemData.longDescription);
            jsonObject.addProperty(KEY_LEARN_MORE_URL, badgeItemData.learnMoreUrl);
            jsonObject.addProperty(KEY_LEARN_MORE_IMAGE_URL, badgeItemData.learnMoreImageUrl);
        }
    }

    public BadgeItemData() {
        super(WS_TYPE);
    }
}

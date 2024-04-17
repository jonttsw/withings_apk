package com.withings.insight.android.entity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.withings.webservices.legacy.withings.model.timeline.ConversationItemData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
/* compiled from: CoachRoomConverters.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006H\u0007J \u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rH\u0007J\u001a\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007J \u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u0012"}, d2 = {"Lcom/withings/insight/android/entity/CoachRoomConverters;", "", "()V", "conversationToString", "", ConversationItemData.WS_TYPE, "", "Lcom/withings/insight/android/entity/Conversation;", "exchangeToString", "exchange", "Lcom/withings/insight/android/entity/SelectedExchange;", "mapToString", "map", "", "stringToConversation", "stringToExchange", "stringToMap", "mapString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoachRoomConverters {
    public static final CoachRoomConverters INSTANCE = new CoachRoomConverters();

    private CoachRoomConverters() {
    }

    public static final String conversationToString(List<Conversation> list) {
        if (list != null) {
            return new Gson().toJson(list);
        }
        return null;
    }

    public static final String exchangeToString(List<SelectedExchange> list) {
        if (list != null) {
            return new Gson().toJson(list);
        }
        return null;
    }

    public static final String mapToString(Map<String, String> map) {
        if (map != null) {
            return new Gson().toJson(map);
        }
        return null;
    }

    public static final List<Conversation> stringToConversation(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) new Gson().fromJson(str, new TypeToken<ArrayList<Conversation>>() { // from class: com.withings.insight.android.entity.CoachRoomConverters$stringToConversation$listType$1
        }.getType());
        if (arrayList == null) {
            return null;
        }
        return x.Q0(arrayList);
    }

    public static final List<SelectedExchange> stringToExchange(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) new Gson().fromJson(str, new TypeToken<ArrayList<SelectedExchange>>() { // from class: com.withings.insight.android.entity.CoachRoomConverters$stringToExchange$listType$1
        }.getType());
        if (arrayList == null) {
            return null;
        }
        return x.Q0(arrayList);
    }

    public static final Map<String, String> stringToMap(String str) {
        if (str != null) {
            return (Map) new Gson().fromJson(str, new TypeToken<Map<String, String>>() { // from class: com.withings.insight.android.entity.CoachRoomConverters$stringToMap$1$listType$1
            }.getType());
        }
        return null;
    }
}

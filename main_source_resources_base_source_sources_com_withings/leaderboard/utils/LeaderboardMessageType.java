package com.withings.leaderboard.utils;

import com.google.gson.JsonObject;
import com.samsung.android.sdk.healthdata.HealthConstants;
import dp0.j;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LeaderboardMessageType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/withings/leaderboard/utils/LeaderboardMessageType;", "", "category", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getOptions", "CHEER", "TAUNT", "MESSAGE", "CUSTOM", "OVERTAKING", "OVERTAKEN", "Companion", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeaderboardMessageType {
    private static final /* synthetic */ sm0.a $ENTRIES;
    private static final /* synthetic */ LeaderboardMessageType[] $VALUES;
    public static final Companion Companion;
    private final String category;
    public static final LeaderboardMessageType CHEER = new LeaderboardMessageType("CHEER", 0, "cheer");
    public static final LeaderboardMessageType TAUNT = new LeaderboardMessageType("TAUNT", 1, "taunt");
    public static final LeaderboardMessageType MESSAGE = new LeaderboardMessageType("MESSAGE", 2, "message");
    public static final LeaderboardMessageType CUSTOM = new LeaderboardMessageType("CUSTOM", 3, HealthConstants.Common.CUSTOM);
    public static final LeaderboardMessageType OVERTAKING = new LeaderboardMessageType("OVERTAKING", 4, "overtaking");
    public static final LeaderboardMessageType OVERTAKEN = new LeaderboardMessageType("OVERTAKEN", 5, "overtaken");

    /* compiled from: LeaderboardMessageType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/withings/leaderboard/utils/LeaderboardMessageType$Companion;", "", "()V", "fromString", "Lcom/withings/leaderboard/utils/LeaderboardMessageType;", "value", "", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final LeaderboardMessageType fromString(String value) {
            Object obj;
            u.j(value, "value");
            Iterator<E> it = LeaderboardMessageType.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    LeaderboardMessageType leaderboardMessageType = (LeaderboardMessageType) obj;
                    if (!j.x(leaderboardMessageType.getCategory(), value)) {
                        if (j.x(leaderboardMessageType.name(), value)) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LeaderboardMessageType leaderboardMessageType2 = (LeaderboardMessageType) obj;
            if (leaderboardMessageType2 != null) {
                return leaderboardMessageType2;
            }
            throw new IllegalStateException("Unknown message type");
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ LeaderboardMessageType[] $values() {
        return new LeaderboardMessageType[]{CHEER, TAUNT, MESSAGE, CUSTOM, OVERTAKING, OVERTAKEN};
    }

    static {
        LeaderboardMessageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = sm0.b.a($values);
        Companion = new Companion(null);
    }

    private LeaderboardMessageType(String str, int i11, String str2) {
        this.category = str2;
    }

    public static final LeaderboardMessageType fromString(String str) {
        return Companion.fromString(str);
    }

    public static sm0.a<LeaderboardMessageType> getEntries() {
        return $ENTRIES;
    }

    public static LeaderboardMessageType valueOf(String str) {
        return (LeaderboardMessageType) Enum.valueOf(LeaderboardMessageType.class, str);
    }

    public static LeaderboardMessageType[] values() {
        return (LeaderboardMessageType[]) $VALUES.clone();
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getOptions() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("category", this.category);
        String jsonElement = jsonObject.toString();
        u.i(jsonElement, "toString(...)");
        return jsonElement;
    }
}

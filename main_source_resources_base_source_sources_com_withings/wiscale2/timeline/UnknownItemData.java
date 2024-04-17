package com.withings.wiscale2.timeline;

import com.google.gson.JsonObject;
import com.withings.webservices.legacy.withings.model.timeline.WsTimelineItemData;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import sm0.b;
/* compiled from: UnknownItemData.kt */
/* loaded from: classes5.dex */
public final class UnknownItemData extends WsTimelineItemData {

    /* renamed from: a  reason: collision with root package name */
    private final JsonObject f61729a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnknownItemData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/timeline/UnknownItemData$Reason;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class Reason {

        /* renamed from: a  reason: collision with root package name */
        public static final Reason f61730a;

        /* renamed from: b  reason: collision with root package name */
        public static final Reason f61731b;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ Reason[] f61732c;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.wiscale2.timeline.UnknownItemData$Reason] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.wiscale2.timeline.UnknownItemData$Reason] */
        static {
            ?? r02 = new Enum("UnknownWsType", 0);
            f61730a = r02;
            ?? r12 = new Enum("MalformedData", 1);
            f61731b = r12;
            Reason[] reasonArr = {r02, r12};
            f61732c = reasonArr;
            b.a(reasonArr);
        }

        private Reason() {
            throw null;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) f61732c.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownItemData(String wsType, JsonObject data, Reason reason) {
        super(wsType);
        u.j(wsType, "wsType");
        u.j(data, "data");
        this.f61729a = data;
    }

    public final JsonObject a() {
        return this.f61729a;
    }
}

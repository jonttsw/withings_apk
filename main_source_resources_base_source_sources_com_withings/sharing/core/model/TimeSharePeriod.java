package com.withings.sharing.core.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TimeSharePeriod.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/sharing/core/model/TimeSharePeriod;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TimeSharePeriod {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeSharePeriod f43998a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ TimeSharePeriod[] f43999b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.sharing.core.model.TimeSharePeriod] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.sharing.core.model.TimeSharePeriod] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.sharing.core.model.TimeSharePeriod] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.sharing.core.model.TimeSharePeriod] */
    static {
        ?? r02 = new Enum("ONE_DAY", 0);
        f43998a = r02;
        TimeSharePeriod[] timeSharePeriodArr = {r02, new Enum("ONE_WEEK", 1), new Enum("ONE_MONTH", 2), new Enum("NO_LIMIT", 3)};
        f43999b = timeSharePeriodArr;
        b.a(timeSharePeriodArr);
    }

    private TimeSharePeriod() {
        throw null;
    }

    public static TimeSharePeriod valueOf(String str) {
        return (TimeSharePeriod) Enum.valueOf(TimeSharePeriod.class, str);
    }

    public static TimeSharePeriod[] values() {
        return (TimeSharePeriod[]) f43999b.clone();
    }
}

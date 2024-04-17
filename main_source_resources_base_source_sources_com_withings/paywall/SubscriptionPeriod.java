package com.withings.paywall;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SubscriptionDuration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/paywall/SubscriptionPeriod;", "", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SubscriptionPeriod {

    /* renamed from: a  reason: collision with root package name */
    public static final SubscriptionPeriod f43570a;

    /* renamed from: b  reason: collision with root package name */
    public static final SubscriptionPeriod f43571b;

    /* renamed from: c  reason: collision with root package name */
    public static final SubscriptionPeriod f43572c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ SubscriptionPeriod[] f43573d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.paywall.SubscriptionPeriod] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.paywall.SubscriptionPeriod] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.paywall.SubscriptionPeriod] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.paywall.SubscriptionPeriod] */
    static {
        ?? r02 = new Enum("DAY", 0);
        ?? r12 = new Enum("WEEK", 1);
        f43570a = r12;
        ?? r22 = new Enum("MONTH", 2);
        f43571b = r22;
        ?? r32 = new Enum("YEAR", 3);
        f43572c = r32;
        SubscriptionPeriod[] subscriptionPeriodArr = {r02, r12, r22, r32};
        f43573d = subscriptionPeriodArr;
        sm0.b.a(subscriptionPeriodArr);
    }

    private SubscriptionPeriod() {
        throw null;
    }

    public static SubscriptionPeriod valueOf(String str) {
        return (SubscriptionPeriod) Enum.valueOf(SubscriptionPeriod.class, str);
    }

    public static SubscriptionPeriod[] values() {
        return (SubscriptionPeriod[]) f43573d.clone();
    }
}

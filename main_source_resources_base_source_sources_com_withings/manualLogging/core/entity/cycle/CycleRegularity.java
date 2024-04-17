package com.withings.manualLogging.core.entity.cycle;

import com.huawei.hms.hihealth.data.DeviceInfo;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CycleRegularity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/manualLogging/core/entity/cycle/CycleRegularity;", "", "a", "manual-logging-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CycleRegularity {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40681a;

    /* renamed from: b  reason: collision with root package name */
    public static final CycleRegularity f40682b;

    /* renamed from: c  reason: collision with root package name */
    public static final CycleRegularity f40683c;

    /* renamed from: d  reason: collision with root package name */
    public static final CycleRegularity f40684d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ CycleRegularity[] f40685e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f40686f;

    /* compiled from: CycleRegularity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.CycleRegularity] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.withings.manualLogging.core.entity.cycle.CycleRegularity$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.CycleRegularity] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.manualLogging.core.entity.cycle.CycleRegularity] */
    static {
        ?? r02 = new Enum("Regular", 0);
        f40682b = r02;
        ?? r12 = new Enum("Irregular", 1);
        f40683c = r12;
        ?? r22 = new Enum(DeviceInfo.STR_TYPE_UNKNOWN, 2);
        f40684d = r22;
        CycleRegularity[] cycleRegularityArr = {r02, r12, r22};
        f40685e = cycleRegularityArr;
        f40686f = b.a(cycleRegularityArr);
        f40681a = new Object();
    }

    private CycleRegularity() {
        throw null;
    }

    public static sm0.a<CycleRegularity> a() {
        return f40686f;
    }

    public static CycleRegularity valueOf(String str) {
        return (CycleRegularity) Enum.valueOf(CycleRegularity.class, str);
    }

    public static CycleRegularity[] values() {
        return (CycleRegularity[]) f40685e.clone();
    }
}

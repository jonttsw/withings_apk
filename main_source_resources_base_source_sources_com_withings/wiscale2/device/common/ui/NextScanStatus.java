package com.withings.wiscale2.device.common.ui;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RespiratoryScanSettingsActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/NextScanStatus;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NextScanStatus {

    /* renamed from: a  reason: collision with root package name */
    public static final NextScanStatus f53736a;

    /* renamed from: b  reason: collision with root package name */
    public static final NextScanStatus f53737b;

    /* renamed from: c  reason: collision with root package name */
    public static final NextScanStatus f53738c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ NextScanStatus[] f53739d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.wiscale2.device.common.ui.NextScanStatus] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.wiscale2.device.common.ui.NextScanStatus] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.wiscale2.device.common.ui.NextScanStatus] */
    static {
        ?? r02 = new Enum("Deactivated", 0);
        f53736a = r02;
        ?? r12 = new Enum("SkipThisScan", 1);
        f53737b = r12;
        ?? r22 = new Enum("ActivateTonight", 2);
        f53738c = r22;
        NextScanStatus[] nextScanStatusArr = {r02, r12, r22};
        f53739d = nextScanStatusArr;
        sm0.b.a(nextScanStatusArr);
    }

    private NextScanStatus() {
        throw null;
    }

    public static NextScanStatus valueOf(String str) {
        return (NextScanStatus) Enum.valueOf(NextScanStatus.class, str);
    }

    public static NextScanStatus[] values() {
        return (NextScanStatus[]) f53739d.clone();
    }
}

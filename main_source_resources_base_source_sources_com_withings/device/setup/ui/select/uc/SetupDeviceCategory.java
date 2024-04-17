package com.withings.device.setup.ui.select.uc;

import com.huawei.hms.hihealth.data.DeviceInfo;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GetSetupDeviceCategoriesUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/ui/select/uc/SetupDeviceCategory;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetupDeviceCategory {

    /* renamed from: a  reason: collision with root package name */
    public static final SetupDeviceCategory f37619a;

    /* renamed from: b  reason: collision with root package name */
    public static final SetupDeviceCategory f37620b;

    /* renamed from: c  reason: collision with root package name */
    public static final SetupDeviceCategory f37621c;

    /* renamed from: d  reason: collision with root package name */
    public static final SetupDeviceCategory f37622d;

    /* renamed from: e  reason: collision with root package name */
    public static final SetupDeviceCategory f37623e;

    /* renamed from: f  reason: collision with root package name */
    public static final SetupDeviceCategory f37624f;

    /* renamed from: g  reason: collision with root package name */
    public static final SetupDeviceCategory f37625g;

    /* renamed from: h  reason: collision with root package name */
    public static final SetupDeviceCategory f37626h;

    /* renamed from: i  reason: collision with root package name */
    public static final SetupDeviceCategory f37627i;

    /* renamed from: j  reason: collision with root package name */
    public static final SetupDeviceCategory f37628j;

    /* renamed from: k  reason: collision with root package name */
    private static final /* synthetic */ SetupDeviceCategory[] f37629k;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.device.setup.ui.select.uc.SetupDeviceCategory] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.device.setup.ui.select.uc.SetupDeviceCategory] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.device.setup.ui.select.uc.SetupDeviceCategory] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.device.setup.ui.select.uc.SetupDeviceCategory] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.device.setup.ui.select.uc.SetupDeviceCategory] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.withings.device.setup.ui.select.uc.SetupDeviceCategory] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, com.withings.device.setup.ui.select.uc.SetupDeviceCategory] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, com.withings.device.setup.ui.select.uc.SetupDeviceCategory] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, com.withings.device.setup.ui.select.uc.SetupDeviceCategory] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Enum, com.withings.device.setup.ui.select.uc.SetupDeviceCategory] */
    static {
        ?? r02 = new Enum(DeviceInfo.STR_TYPE_SCALES, 0);
        f37619a = r02;
        ?? r12 = new Enum("Watches", 1);
        f37620b = r12;
        ?? r22 = new Enum("Trackers", 2);
        f37621c = r22;
        ?? r32 = new Enum("BloodPressureMonitors", 3);
        f37622d = r32;
        ?? r42 = new Enum("SleepSensors", 4);
        f37623e = r42;
        ?? r52 = new Enum("MultiScopes", 5);
        f37624f = r52;
        ?? r62 = new Enum(DeviceInfo.STR_TYPE_THERMOMETERS, 6);
        f37625g = r62;
        ?? r7 = new Enum("UrineAnalysers", 7);
        f37626h = r7;
        ?? r82 = new Enum("Alarms", 8);
        f37627i = r82;
        ?? r92 = new Enum("DeprecatedSleepSensors", 9);
        f37628j = r92;
        SetupDeviceCategory[] setupDeviceCategoryArr = {r02, r12, r22, r32, r42, r52, r62, r7, r82, r92};
        f37629k = setupDeviceCategoryArr;
        sm0.b.a(setupDeviceCategoryArr);
    }

    private SetupDeviceCategory() {
        throw null;
    }

    public static SetupDeviceCategory valueOf(String str) {
        return (SetupDeviceCategory) Enum.valueOf(SetupDeviceCategory.class, str);
    }

    public static SetupDeviceCategory[] values() {
        return (SetupDeviceCategory[]) f37629k.clone();
    }
}

package com.withings.device.details.elabel;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ElabelDeviceActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/device/details/elabel/LabeledDeviceModel;", "", "a", "device-details-common_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LabeledDeviceModel {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36799a;

    /* renamed from: b  reason: collision with root package name */
    public static final LabeledDeviceModel f36800b;

    /* renamed from: c  reason: collision with root package name */
    public static final LabeledDeviceModel f36801c;

    /* renamed from: d  reason: collision with root package name */
    public static final LabeledDeviceModel f36802d;

    /* renamed from: e  reason: collision with root package name */
    public static final LabeledDeviceModel f36803e;

    /* renamed from: f  reason: collision with root package name */
    public static final LabeledDeviceModel f36804f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ LabeledDeviceModel[] f36805g;

    /* compiled from: ElabelDeviceActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.device.details.elabel.LabeledDeviceModel] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.withings.device.details.elabel.LabeledDeviceModel$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.device.details.elabel.LabeledDeviceModel] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.device.details.elabel.LabeledDeviceModel] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.device.details.elabel.LabeledDeviceModel] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.device.details.elabel.LabeledDeviceModel] */
    static {
        ?? r02 = new Enum("Hwa08", 0);
        f36800b = r02;
        ?? r12 = new Enum("Hwa09", 1);
        f36801c = r12;
        ?? r22 = new Enum("Hwa10", 2);
        f36802d = r22;
        ?? r32 = new Enum("Wbs08", 3);
        f36803e = r32;
        ?? r42 = new Enum("Wsm02", 4);
        f36804f = r42;
        LabeledDeviceModel[] labeledDeviceModelArr = {r02, r12, r22, r32, r42};
        f36805g = labeledDeviceModelArr;
        sm0.b.a(labeledDeviceModelArr);
        f36799a = new Object();
    }

    private LabeledDeviceModel() {
        throw null;
    }

    public static LabeledDeviceModel valueOf(String str) {
        return (LabeledDeviceModel) Enum.valueOf(LabeledDeviceModel.class, str);
    }

    public static LabeledDeviceModel[] values() {
        return (LabeledDeviceModel[]) f36805g.clone();
    }
}

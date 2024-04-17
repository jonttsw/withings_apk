package com.withings.common.compose.component;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemGoal.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/CircleCanvaSize;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CircleCanvaSize {

    /* renamed from: f  reason: collision with root package name */
    public static final CircleCanvaSize f33314f;

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ CircleCanvaSize[] f33315g;

    /* renamed from: a  reason: collision with root package name */
    private final float f33316a;

    /* renamed from: b  reason: collision with root package name */
    private final float f33317b;

    /* renamed from: c  reason: collision with root package name */
    private final float f33318c;

    /* renamed from: d  reason: collision with root package name */
    private final float f33319d;

    /* renamed from: e  reason: collision with root package name */
    private final float f33320e;

    static {
        float f11 = 12;
        float f12 = 2;
        CircleCanvaSize circleCanvaSize = new CircleCanvaSize("SmallInside", 0, 33, f11, f12, -215.0f, 250.0f);
        CircleCanvaSize circleCanvaSize2 = new CircleCanvaSize("SmallOutside", 1, 62, f11, f12, -210.0f, 240.0f);
        f33314f = circleCanvaSize2;
        float f13 = 35;
        float f14 = 5;
        CircleCanvaSize[] circleCanvaSizeArr = {circleCanvaSize, circleCanvaSize2, new CircleCanvaSize("BigInside", 2, 121, f13, f14, -215.0f, 250.0f), new CircleCanvaSize("BigOutside", 3, 226, f13, f14, -210.0f, 240.0f)};
        f33315g = circleCanvaSizeArr;
        sm0.b.a(circleCanvaSizeArr);
    }

    private CircleCanvaSize(String str, int i11, float f11, float f12, float f13, float f14, float f15) {
        this.f33316a = f11;
        this.f33317b = f12;
        this.f33318c = f13;
        this.f33319d = f14;
        this.f33320e = f15;
    }

    public static CircleCanvaSize valueOf(String str) {
        return (CircleCanvaSize) Enum.valueOf(CircleCanvaSize.class, str);
    }

    public static CircleCanvaSize[] values() {
        return (CircleCanvaSize[]) f33315g.clone();
    }

    public final float a() {
        return this.f33318c;
    }

    public final float b() {
        return this.f33316a;
    }

    public final float d() {
        return this.f33317b;
    }

    public final float e() {
        return this.f33320e;
    }

    public final float f() {
        return this.f33319d;
    }
}

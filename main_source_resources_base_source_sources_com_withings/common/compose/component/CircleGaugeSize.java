package com.withings.common.compose.component;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemGoal.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/CircleGaugeSize;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CircleGaugeSize {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ CircleGaugeSize[] f33321a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.common.compose.component.CircleGaugeSize] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Enum, com.withings.common.compose.component.CircleGaugeSize] */
    static {
        CircleCanvaSize circleCanvaSize = CircleCanvaSize.f33314f;
        CircleGaugeSize[] circleGaugeSizeArr = {new Enum("Small", 0), new Enum("Big", 1)};
        f33321a = circleGaugeSizeArr;
        sm0.b.a(circleGaugeSizeArr);
    }

    private CircleGaugeSize() {
        throw null;
    }

    public static CircleGaugeSize valueOf(String str) {
        return (CircleGaugeSize) Enum.valueOf(CircleGaugeSize.class, str);
    }

    public static CircleGaugeSize[] values() {
        return (CircleGaugeSize[]) f33321a.clone();
    }
}

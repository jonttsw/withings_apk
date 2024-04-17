package com.withings.common.compose.component;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Buttons.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/ColorStyle;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ColorStyle {

    /* renamed from: a  reason: collision with root package name */
    public static final ColorStyle f33322a;

    /* renamed from: b  reason: collision with root package name */
    public static final ColorStyle f33323b;

    /* renamed from: c  reason: collision with root package name */
    public static final ColorStyle f33324c;

    /* renamed from: d  reason: collision with root package name */
    public static final ColorStyle f33325d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ ColorStyle[] f33326e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.common.compose.component.ColorStyle] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.common.compose.component.ColorStyle] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.common.compose.component.ColorStyle] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.common.compose.component.ColorStyle] */
    static {
        ?? r02 = new Enum("Default", 0);
        f33322a = r02;
        ?? r12 = new Enum("Bad", 1);
        f33323b = r12;
        ?? r22 = new Enum("Quiet", 2);
        f33324c = r22;
        ?? r32 = new Enum("Conversion", 3);
        f33325d = r32;
        ColorStyle[] colorStyleArr = {r02, r12, r22, r32};
        f33326e = colorStyleArr;
        sm0.b.a(colorStyleArr);
    }

    private ColorStyle() {
        throw null;
    }

    public static ColorStyle valueOf(String str) {
        return (ColorStyle) Enum.valueOf(ColorStyle.class, str);
    }

    public static ColorStyle[] values() {
        return (ColorStyle[]) f33326e.clone();
    }
}

package com.withings.common.compose.component;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Toast.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/ToastStyle;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ToastStyle {

    /* renamed from: a  reason: collision with root package name */
    public static final ToastStyle f33348a;

    /* renamed from: b  reason: collision with root package name */
    public static final ToastStyle f33349b;

    /* renamed from: c  reason: collision with root package name */
    public static final ToastStyle f33350c;

    /* renamed from: d  reason: collision with root package name */
    public static final ToastStyle f33351d;

    /* renamed from: e  reason: collision with root package name */
    public static final ToastStyle f33352e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ ToastStyle[] f33353f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.common.compose.component.ToastStyle] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.common.compose.component.ToastStyle] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.common.compose.component.ToastStyle] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.common.compose.component.ToastStyle] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.common.compose.component.ToastStyle] */
    static {
        ?? r02 = new Enum("Good", 0);
        f33348a = r02;
        ?? r12 = new Enum("Medium", 1);
        f33349b = r12;
        ?? r22 = new Enum("Bad", 2);
        f33350c = r22;
        ?? r32 = new Enum("Informative", 3);
        f33351d = r32;
        ?? r42 = new Enum("Timer", 4);
        f33352e = r42;
        ToastStyle[] toastStyleArr = {r02, r12, r22, r32, r42};
        f33353f = toastStyleArr;
        sm0.b.a(toastStyleArr);
    }

    private ToastStyle() {
        throw null;
    }

    public static ToastStyle valueOf(String str) {
        return (ToastStyle) Enum.valueOf(ToastStyle.class, str);
    }

    public static ToastStyle[] values() {
        return (ToastStyle[]) f33353f.clone();
    }
}

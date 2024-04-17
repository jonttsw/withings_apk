package com.withings.common.compose.component;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToastHost.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/ToastResult;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ToastResult {

    /* renamed from: a  reason: collision with root package name */
    public static final ToastResult f33345a;

    /* renamed from: b  reason: collision with root package name */
    public static final ToastResult f33346b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ ToastResult[] f33347c;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.common.compose.component.ToastResult, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.common.compose.component.ToastResult, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Dismissed", 0);
        f33345a = r02;
        ?? r12 = new Enum("ActionPerformed", 1);
        f33346b = r12;
        ToastResult[] toastResultArr = {r02, r12};
        f33347c = toastResultArr;
        sm0.b.a(toastResultArr);
    }

    private ToastResult() {
        throw null;
    }

    public static ToastResult valueOf(String str) {
        return (ToastResult) Enum.valueOf(ToastResult.class, str);
    }

    public static ToastResult[] values() {
        return (ToastResult[]) f33347c.clone();
    }
}

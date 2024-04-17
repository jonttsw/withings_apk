package com.withings.common.compose.component;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Cells.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/CellVerticalMargin;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CellVerticalMargin {

    /* renamed from: a  reason: collision with root package name */
    public static final CellVerticalMargin f33309a;

    /* renamed from: b  reason: collision with root package name */
    public static final CellVerticalMargin f33310b;

    /* renamed from: c  reason: collision with root package name */
    public static final CellVerticalMargin f33311c;

    /* renamed from: d  reason: collision with root package name */
    public static final CellVerticalMargin f33312d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ CellVerticalMargin[] f33313e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.common.compose.component.CellVerticalMargin] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.common.compose.component.CellVerticalMargin] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.common.compose.component.CellVerticalMargin] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.common.compose.component.CellVerticalMargin] */
    static {
        ?? r02 = new Enum("MEDIUM", 0);
        f33309a = r02;
        ?? r12 = new Enum("NORMAL", 1);
        f33310b = r12;
        ?? r22 = new Enum("SMALL", 2);
        f33311c = r22;
        ?? r32 = new Enum("NONE", 3);
        f33312d = r32;
        CellVerticalMargin[] cellVerticalMarginArr = {r02, r12, r22, r32};
        f33313e = cellVerticalMarginArr;
        sm0.b.a(cellVerticalMarginArr);
    }

    private CellVerticalMargin() {
        throw null;
    }

    public static CellVerticalMargin valueOf(String str) {
        return (CellVerticalMargin) Enum.valueOf(CellVerticalMargin.class, str);
    }

    public static CellVerticalMargin[] values() {
        return (CellVerticalMargin[]) f33313e.clone();
    }
}

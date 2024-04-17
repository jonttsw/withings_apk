package com.withings.common.compose.component.text;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Header.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/text/HeaderStyle;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HeaderStyle {

    /* renamed from: a  reason: collision with root package name */
    public static final HeaderStyle f34757a;

    /* renamed from: b  reason: collision with root package name */
    public static final HeaderStyle f34758b;

    /* renamed from: c  reason: collision with root package name */
    public static final HeaderStyle f34759c;

    /* renamed from: d  reason: collision with root package name */
    public static final HeaderStyle f34760d;

    /* renamed from: e  reason: collision with root package name */
    public static final HeaderStyle f34761e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ HeaderStyle[] f34762f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.common.compose.component.text.HeaderStyle] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.common.compose.component.text.HeaderStyle] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.common.compose.component.text.HeaderStyle] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.common.compose.component.text.HeaderStyle] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.common.compose.component.text.HeaderStyle] */
    static {
        ?? r02 = new Enum("Header1", 0);
        f34757a = r02;
        ?? r12 = new Enum("Header2", 1);
        f34758b = r12;
        ?? r22 = new Enum("Header3", 2);
        f34759c = r22;
        ?? r32 = new Enum("Header4", 3);
        f34760d = r32;
        ?? r42 = new Enum("Eyebrow", 4);
        f34761e = r42;
        HeaderStyle[] headerStyleArr = {r02, r12, r22, r32, r42};
        f34762f = headerStyleArr;
        b.a(headerStyleArr);
    }

    private HeaderStyle() {
        throw null;
    }

    public static HeaderStyle valueOf(String str) {
        return (HeaderStyle) Enum.valueOf(HeaderStyle.class, str);
    }

    public static HeaderStyle[] values() {
        return (HeaderStyle[]) f34762f.clone();
    }
}

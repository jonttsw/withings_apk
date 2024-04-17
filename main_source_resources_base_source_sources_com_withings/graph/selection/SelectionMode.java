package com.withings.graph.selection;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionMode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/graph/selection/SelectionMode;", "", "graph_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SelectionMode {

    /* renamed from: a  reason: collision with root package name */
    public static final SelectionMode f39997a;

    /* renamed from: b  reason: collision with root package name */
    public static final SelectionMode f39998b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ SelectionMode[] f39999c;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.graph.selection.SelectionMode, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.graph.selection.SelectionMode, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.graph.selection.SelectionMode, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.graph.selection.SelectionMode, java.lang.Enum] */
    static {
        ?? r02 = new Enum("SINGLE_DATUM", 0);
        f39997a = r02;
        ?? r12 = new Enum("MULTIPLE_DATUMS", 1);
        ?? r22 = new Enum("AXIS", 2);
        f39998b = r22;
        SelectionMode[] selectionModeArr = {r02, r12, r22, new Enum("MULTIPLE_DATUMS_WITH_AXIS", 3)};
        f39999c = selectionModeArr;
        b.a(selectionModeArr);
    }

    private SelectionMode() {
        throw null;
    }

    public static SelectionMode valueOf(String str) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) f39999c.clone();
    }
}

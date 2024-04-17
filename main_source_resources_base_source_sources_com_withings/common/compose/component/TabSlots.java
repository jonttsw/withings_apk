package com.withings.common.compose.component;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScrollableTabRow.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/compose/component/TabSlots;", "", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class TabSlots {

    /* renamed from: a  reason: collision with root package name */
    public static final TabSlots f33340a;

    /* renamed from: b  reason: collision with root package name */
    public static final TabSlots f33341b;

    /* renamed from: c  reason: collision with root package name */
    public static final TabSlots f33342c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ TabSlots[] f33343d;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.common.compose.component.TabSlots, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.common.compose.component.TabSlots, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.common.compose.component.TabSlots, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Tabs", 0);
        f33340a = r02;
        ?? r12 = new Enum("Divider", 1);
        f33341b = r12;
        ?? r22 = new Enum("Indicator", 2);
        f33342c = r22;
        TabSlots[] tabSlotsArr = {r02, r12, r22};
        f33343d = tabSlotsArr;
        sm0.b.a(tabSlotsArr);
    }

    private TabSlots() {
        throw null;
    }

    public static TabSlots valueOf(String str) {
        return (TabSlots) Enum.valueOf(TabSlots.class, str);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) f33343d.clone();
    }
}

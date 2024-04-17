package com.withings.tutorials.core.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TabType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/core/model/TabType;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class TabType {

    /* renamed from: b  reason: collision with root package name */
    public static final TabType f44588b;

    /* renamed from: c  reason: collision with root package name */
    public static final TabType f44589c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ TabType[] f44590d;

    /* renamed from: a  reason: collision with root package name */
    private final String f44591a;

    static {
        TabType tabType = new TabType("Achieve", 0, "achieve_tab");
        f44588b = tabType;
        TabType tabType2 = new TabType("Measure", 1, "measure_tab");
        f44589c = tabType2;
        TabType[] tabTypeArr = {tabType, tabType2};
        f44590d = tabTypeArr;
        b.a(tabTypeArr);
    }

    private TabType(String str, int i11, String str2) {
        this.f44591a = str2;
    }

    public static TabType valueOf(String str) {
        return (TabType) Enum.valueOf(TabType.class, str);
    }

    public static TabType[] values() {
        return (TabType[]) f44590d.clone();
    }

    public final String a() {
        return this.f44591a;
    }
}

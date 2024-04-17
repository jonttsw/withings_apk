package com.withings.tutorials.core;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UtilityIntroduction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/core/UtilityIntroduction;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class UtilityIntroduction {

    /* renamed from: a  reason: collision with root package name */
    public static final UtilityIntroduction f44577a;

    /* renamed from: b  reason: collision with root package name */
    public static final UtilityIntroduction f44578b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ UtilityIntroduction[] f44579c;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.tutorials.core.UtilityIntroduction, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.tutorials.core.UtilityIntroduction, java.lang.Enum] */
    static {
        ?? r02 = new Enum("CUSTOMIZE_SCREENS", 0);
        f44577a = r02;
        ?? r12 = new Enum("WEATHER_AND_AIR_QUALITY", 1);
        f44578b = r12;
        UtilityIntroduction[] utilityIntroductionArr = {r02, r12};
        f44579c = utilityIntroductionArr;
        b.a(utilityIntroductionArr);
    }

    private UtilityIntroduction() {
        throw null;
    }

    public static UtilityIntroduction valueOf(String str) {
        return (UtilityIntroduction) Enum.valueOf(UtilityIntroduction.class, str);
    }

    public static UtilityIntroduction[] values() {
        return (UtilityIntroduction[]) f44579c.clone();
    }
}

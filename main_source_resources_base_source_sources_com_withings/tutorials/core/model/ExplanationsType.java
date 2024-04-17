package com.withings.tutorials.core.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExplanationsType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/core/model/ExplanationsType;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ExplanationsType {

    /* renamed from: a  reason: collision with root package name */
    public static final ExplanationsType f44580a;

    /* renamed from: b  reason: collision with root package name */
    public static final ExplanationsType f44581b;

    /* renamed from: c  reason: collision with root package name */
    public static final ExplanationsType f44582c;

    /* renamed from: d  reason: collision with root package name */
    public static final ExplanationsType f44583d;

    /* renamed from: e  reason: collision with root package name */
    public static final ExplanationsType f44584e;

    /* renamed from: f  reason: collision with root package name */
    public static final ExplanationsType f44585f;

    /* renamed from: g  reason: collision with root package name */
    public static final ExplanationsType f44586g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ ExplanationsType[] f44587h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.tutorials.core.model.ExplanationsType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.tutorials.core.model.ExplanationsType] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.tutorials.core.model.ExplanationsType] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.tutorials.core.model.ExplanationsType] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.tutorials.core.model.ExplanationsType] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.withings.tutorials.core.model.ExplanationsType] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, com.withings.tutorials.core.model.ExplanationsType] */
    static {
        ?? r02 = new Enum("TUTORIAL_ID_SLEEP_SCORE", 0);
        f44580a = r02;
        ?? r12 = new Enum("TUTORIAL_ID_VO2MAX", 1);
        f44581b = r12;
        ?? r22 = new Enum("TUTORIAL_ID_BREATHING_DISTURBANCE", 2);
        f44582c = r22;
        ?? r32 = new Enum("TUTORIAL_ID_SLEEP_AVERAGE_HR", 3);
        f44583d = r32;
        ?? r42 = new Enum("TUTORIAL_ID_SLEEP_APNEA", 4);
        f44584e = r42;
        ?? r52 = new Enum("TUTORIAL_ID_VASCULAR_AGE", 5);
        f44585f = r52;
        ?? r62 = new Enum("TUTORIAL_ID_WSM02", 6);
        f44586g = r62;
        ExplanationsType[] explanationsTypeArr = {r02, r12, r22, r32, r42, r52, r62};
        f44587h = explanationsTypeArr;
        b.a(explanationsTypeArr);
    }

    private ExplanationsType() {
        throw null;
    }

    public static ExplanationsType valueOf(String str) {
        return (ExplanationsType) Enum.valueOf(ExplanationsType.class, str);
    }

    public static ExplanationsType[] values() {
        return (ExplanationsType[]) f44587h.clone();
    }
}

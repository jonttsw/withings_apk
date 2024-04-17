package com.withings.scalesmodes.core;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScalesModes.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/scalesmodes/core/ScalesModes;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ScalesModes {

    /* renamed from: a  reason: collision with root package name */
    public static final ScalesModes f43892a;

    /* renamed from: b  reason: collision with root package name */
    public static final ScalesModes f43893b;

    /* renamed from: c  reason: collision with root package name */
    public static final ScalesModes f43894c;

    /* renamed from: d  reason: collision with root package name */
    public static final ScalesModes f43895d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ ScalesModes[] f43896e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.scalesmodes.core.ScalesModes] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.scalesmodes.core.ScalesModes] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.scalesmodes.core.ScalesModes] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.scalesmodes.core.ScalesModes] */
    static {
        ?? r02 = new Enum("ATHLETE", 0);
        f43892a = r02;
        ?? r12 = new Enum("PREGNANCY", 1);
        f43893b = r12;
        ?? r22 = new Enum("PACEMAKER_SAFETY", 2);
        f43894c = r22;
        ?? r32 = new Enum("EYES_CLOSED", 3);
        f43895d = r32;
        ScalesModes[] scalesModesArr = {r02, r12, r22, r32};
        f43896e = scalesModesArr;
        b.a(scalesModesArr);
    }

    private ScalesModes() {
        throw null;
    }

    public static ScalesModes valueOf(String str) {
        return (ScalesModes) Enum.valueOf(ScalesModes.class, str);
    }

    public static ScalesModes[] values() {
        return (ScalesModes[]) f43896e.clone();
    }
}

package com.withings.tutorials.core;

import kotlin.Metadata;
import sm0.a;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserMode.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/tutorials/core/UserMode;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class UserMode {

    /* renamed from: a  reason: collision with root package name */
    public static final UserMode f44571a;

    /* renamed from: b  reason: collision with root package name */
    public static final UserMode f44572b;

    /* renamed from: c  reason: collision with root package name */
    public static final UserMode f44573c;

    /* renamed from: d  reason: collision with root package name */
    public static final UserMode f44574d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ UserMode[] f44575e;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ a f44576f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.tutorials.core.UserMode] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.tutorials.core.UserMode] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.tutorials.core.UserMode] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.tutorials.core.UserMode] */
    static {
        ?? r02 = new Enum("Pregnancy", 0);
        f44571a = r02;
        ?? r12 = new Enum("EyesClosed", 1);
        f44572b = r12;
        ?? r22 = new Enum("Athlete", 2);
        f44573c = r22;
        ?? r32 = new Enum("Pacemaker", 3);
        f44574d = r32;
        UserMode[] userModeArr = {r02, r12, r22, r32};
        f44575e = userModeArr;
        f44576f = b.a(userModeArr);
    }

    private UserMode() {
        throw null;
    }

    public static a<UserMode> a() {
        return f44576f;
    }

    public static UserMode valueOf(String str) {
        return (UserMode) Enum.valueOf(UserMode.class, str);
    }

    public static UserMode[] values() {
        return (UserMode[]) f44575e.clone();
    }
}

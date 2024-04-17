package com.withings.network.core;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogLevel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/network/core/LogLevel;", "", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LogLevel {

    /* renamed from: a  reason: collision with root package name */
    public static final LogLevel f42817a;

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ LogLevel[] f42818b;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.network.core.LogLevel, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.network.core.LogLevel, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.network.core.LogLevel, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.network.core.LogLevel, java.lang.Enum] */
    static {
        ?? r02 = new Enum("NONE", 0);
        f42817a = r02;
        LogLevel[] logLevelArr = {r02, new Enum("BASIC", 1), new Enum("HEADERS", 2), new Enum("BODY", 3)};
        f42818b = logLevelArr;
        b.a(logLevelArr);
    }

    private LogLevel() {
        throw null;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) f42818b.clone();
    }
}

package com.withings.manualLogging.ui.common;

import com.withings.favorite.model.FavoriteCategoryKt;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/ui/common/LogType;", "", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LogType {

    /* renamed from: a  reason: collision with root package name */
    public static final LogType f40693a;

    /* renamed from: b  reason: collision with root package name */
    public static final LogType f40694b;

    /* renamed from: c  reason: collision with root package name */
    public static final LogType f40695c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ LogType[] f40696d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.manualLogging.ui.common.LogType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.manualLogging.ui.common.LogType] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.manualLogging.ui.common.LogType] */
    static {
        ?? r02 = new Enum("Metadata", 0);
        f40693a = r02;
        ?? r12 = new Enum("Measure", 1);
        f40694b = r12;
        ?? r22 = new Enum(FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY, 2);
        f40695c = r22;
        LogType[] logTypeArr = {r02, r12, r22};
        f40696d = logTypeArr;
        b.a(logTypeArr);
    }

    private LogType() {
        throw null;
    }

    public static LogType valueOf(String str) {
        return (LogType) Enum.valueOf(LogType.class, str);
    }

    public static LogType[] values() {
        return (LogType[]) f40696d.clone();
    }
}

package com.withings.manualLogging.ui.feature.addNote.cycle.model;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CycleManualLoggingEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/manualLogging/ui/feature/addNote/cycle/model/CycleManualLoggingEvent;", "", "manual-logging-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class CycleManualLoggingEvent {

    /* renamed from: a  reason: collision with root package name */
    public static final CycleManualLoggingEvent f41113a;

    /* renamed from: b  reason: collision with root package name */
    public static final CycleManualLoggingEvent f41114b;

    /* renamed from: c  reason: collision with root package name */
    public static final CycleManualLoggingEvent f41115c;

    /* renamed from: d  reason: collision with root package name */
    public static final CycleManualLoggingEvent f41116d;

    /* renamed from: e  reason: collision with root package name */
    public static final CycleManualLoggingEvent f41117e;

    /* renamed from: f  reason: collision with root package name */
    public static final CycleManualLoggingEvent f41118f;

    /* renamed from: g  reason: collision with root package name */
    public static final CycleManualLoggingEvent f41119g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ CycleManualLoggingEvent[] f41120h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, com.withings.manualLogging.ui.feature.addNote.cycle.model.CycleManualLoggingEvent] */
    static {
        ?? r02 = new Enum("Idle", 0);
        f41113a = r02;
        ?? r12 = new Enum("Loading", 1);
        f41114b = r12;
        ?? r22 = new Enum("Start", 2);
        f41115c = r22;
        ?? r32 = new Enum("Finish", 3);
        f41116d = r32;
        ?? r42 = new Enum("FinishOnDataviz", 4);
        f41117e = r42;
        ?? r52 = new Enum("ContinueTutorialWithDevice", 5);
        f41118f = r52;
        ?? r62 = new Enum("ContinueTutorialNoDevice", 6);
        f41119g = r62;
        CycleManualLoggingEvent[] cycleManualLoggingEventArr = {r02, r12, r22, r32, r42, r52, r62};
        f41120h = cycleManualLoggingEventArr;
        b.a(cycleManualLoggingEventArr);
    }

    private CycleManualLoggingEvent() {
        throw null;
    }

    public static CycleManualLoggingEvent valueOf(String str) {
        return (CycleManualLoggingEvent) Enum.valueOf(CycleManualLoggingEvent.class, str);
    }

    public static CycleManualLoggingEvent[] values() {
        return (CycleManualLoggingEvent[]) f41120h.clone();
    }
}

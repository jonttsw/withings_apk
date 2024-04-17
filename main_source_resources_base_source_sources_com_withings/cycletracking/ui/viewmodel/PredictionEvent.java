package com.withings.cycletracking.ui.viewmodel;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CycleTrackingViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/cycletracking/ui/viewmodel/PredictionEvent;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PredictionEvent {

    /* renamed from: a  reason: collision with root package name */
    public static final PredictionEvent f35830a;

    /* renamed from: b  reason: collision with root package name */
    public static final PredictionEvent f35831b;

    /* renamed from: c  reason: collision with root package name */
    public static final PredictionEvent f35832c;

    /* renamed from: d  reason: collision with root package name */
    public static final PredictionEvent f35833d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ PredictionEvent[] f35834e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.cycletracking.ui.viewmodel.PredictionEvent] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.cycletracking.ui.viewmodel.PredictionEvent] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.cycletracking.ui.viewmodel.PredictionEvent] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.cycletracking.ui.viewmodel.PredictionEvent] */
    static {
        ?? r02 = new Enum("WaitingForSync", 0);
        f35830a = r02;
        ?? r12 = new Enum("SyncSuccess", 1);
        f35831b = r12;
        ?? r22 = new Enum("SyncFailed", 2);
        f35832c = r22;
        ?? r32 = new Enum("InvalidatedPredictions", 3);
        f35833d = r32;
        PredictionEvent[] predictionEventArr = {r02, r12, r22, r32};
        f35834e = predictionEventArr;
        sm0.b.a(predictionEventArr);
    }

    private PredictionEvent() {
        throw null;
    }

    public static PredictionEvent valueOf(String str) {
        return (PredictionEvent) Enum.valueOf(PredictionEvent.class, str);
    }

    public static PredictionEvent[] values() {
        return (PredictionEvent[]) f35834e.clone();
    }
}

package com.withings.cycletracking.ui.viewmodel;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CycleTrackingViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/cycletracking/ui/viewmodel/PredictionState;", "", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PredictionState {

    /* renamed from: a  reason: collision with root package name */
    public static final PredictionState f35835a;

    /* renamed from: b  reason: collision with root package name */
    public static final PredictionState f35836b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ PredictionState[] f35837c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.cycletracking.ui.viewmodel.PredictionState] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.cycletracking.ui.viewmodel.PredictionState] */
    static {
        ?? r02 = new Enum("Idle", 0);
        f35835a = r02;
        ?? r12 = new Enum("WaitingForSync", 1);
        f35836b = r12;
        PredictionState[] predictionStateArr = {r02, r12};
        f35837c = predictionStateArr;
        sm0.b.a(predictionStateArr);
    }

    private PredictionState() {
        throw null;
    }

    public static PredictionState valueOf(String str) {
        return (PredictionState) Enum.valueOf(PredictionState.class, str);
    }

    public static PredictionState[] values() {
        return (PredictionState[]) f35837c.clone();
    }
}

package com.withings.nervehealth.ui.models;

import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NerveHealthPredictedScoreUiModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/nervehealth/ui/models/NerveHealthPredictedState;", "", "nervehealth-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NerveHealthPredictedState {

    /* renamed from: a  reason: collision with root package name */
    public static final NerveHealthPredictedState f42736a;

    /* renamed from: b  reason: collision with root package name */
    public static final NerveHealthPredictedState f42737b;

    /* renamed from: c  reason: collision with root package name */
    public static final NerveHealthPredictedState f42738c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ NerveHealthPredictedState[] f42739d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.nervehealth.ui.models.NerveHealthPredictedState] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.nervehealth.ui.models.NerveHealthPredictedState] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.nervehealth.ui.models.NerveHealthPredictedState] */
    static {
        ?? r02 = new Enum("EmptyState", 0);
        f42736a = r02;
        ?? r12 = new Enum("Pending", 1);
        f42737b = r12;
        ?? r22 = new Enum("Ready", 2);
        f42738c = r22;
        NerveHealthPredictedState[] nerveHealthPredictedStateArr = {r02, r12, r22};
        f42739d = nerveHealthPredictedStateArr;
        b.a(nerveHealthPredictedStateArr);
    }

    private NerveHealthPredictedState() {
        throw null;
    }

    public static NerveHealthPredictedState valueOf(String str) {
        return (NerveHealthPredictedState) Enum.valueOf(NerveHealthPredictedState.class, str);
    }

    public static NerveHealthPredictedState[] values() {
        return (NerveHealthPredictedState[]) f42739d.clone();
    }
}

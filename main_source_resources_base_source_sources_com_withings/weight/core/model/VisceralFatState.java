package com.withings.weight.core.model;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import en0.g;
import en0.r;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VisceralFatState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/core/model/VisceralFatState;", "", "weight-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VisceralFatState {

    /* renamed from: b  reason: collision with root package name */
    public static final VisceralFatState f46989b;

    /* renamed from: c  reason: collision with root package name */
    public static final VisceralFatState f46990c;

    /* renamed from: d  reason: collision with root package name */
    public static final VisceralFatState f46991d;

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ VisceralFatState[] f46992e;

    /* renamed from: a  reason: collision with root package name */
    private final g<Double> f46993a;

    static {
        VisceralFatState visceralFatState = new VisceralFatState("UNDEFINED", 0, r.o(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        f46989b = visceralFatState;
        VisceralFatState visceralFatState2 = new VisceralFatState("HEALTHY", 1, r.o(1.0d, 5.0d));
        f46990c = visceralFatState2;
        VisceralFatState visceralFatState3 = new VisceralFatState("EXCESSIVE", 2, r.o(5.0d, 20.0d));
        f46991d = visceralFatState3;
        VisceralFatState[] visceralFatStateArr = {visceralFatState, visceralFatState2, visceralFatState3};
        f46992e = visceralFatStateArr;
        b.a(visceralFatStateArr);
    }

    private VisceralFatState(String str, int i11, g gVar) {
        this.f46993a = gVar;
    }

    public static VisceralFatState valueOf(String str) {
        return (VisceralFatState) Enum.valueOf(VisceralFatState.class, str);
    }

    public static VisceralFatState[] values() {
        return (VisceralFatState[]) f46992e.clone();
    }

    public final g<Double> a() {
        return this.f46993a;
    }
}

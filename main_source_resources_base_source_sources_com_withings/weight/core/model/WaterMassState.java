package com.withings.weight.core.model;

import en0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import sm0.b;
/* compiled from: WaterMassState.kt */
/* loaded from: classes4.dex */
public final class WaterMassState {

    /* renamed from: a  reason: collision with root package name */
    private final State f46994a;

    /* renamed from: b  reason: collision with root package name */
    private final g<Double> f46995b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WaterMassState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/core/model/WaterMassState$State;", "", "weight-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class State {

        /* renamed from: a  reason: collision with root package name */
        public static final State f46996a;

        /* renamed from: b  reason: collision with root package name */
        public static final State f46997b;

        /* renamed from: c  reason: collision with root package name */
        public static final State f46998c;

        /* renamed from: d  reason: collision with root package name */
        public static final State f46999d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ State[] f47000e;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.weight.core.model.WaterMassState$State, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.weight.core.model.WaterMassState$State, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.weight.core.model.WaterMassState$State, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.weight.core.model.WaterMassState$State, java.lang.Enum] */
        static {
            ?? r02 = new Enum("UNDEFINED", 0);
            f46996a = r02;
            ?? r12 = new Enum("UNDER_HYDRATED", 1);
            f46997b = r12;
            ?? r22 = new Enum("HEALTHY", 2);
            f46998c = r22;
            ?? r32 = new Enum("OVER_HYDRATED", 3);
            f46999d = r32;
            State[] stateArr = {r02, r12, r22, r32};
            f47000e = stateArr;
            b.a(stateArr);
        }

        private State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f47000e.clone();
        }
    }

    public WaterMassState(State state, g<Double> range) {
        u.j(range, "range");
        this.f46994a = state;
        this.f46995b = range;
    }

    public final g<Double> a() {
        return this.f46995b;
    }

    public final State b() {
        return this.f46994a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaterMassState)) {
            return false;
        }
        WaterMassState waterMassState = (WaterMassState) obj;
        if (this.f46994a == waterMassState.f46994a && u.e(this.f46995b, waterMassState.f46995b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46995b.hashCode() + (this.f46994a.hashCode() * 31);
    }

    public final String toString() {
        return "WaterMassState(value=" + this.f46994a + ", range=" + this.f46995b + ")";
    }
}

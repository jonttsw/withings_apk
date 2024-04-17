package com.withings.weight.core.model;

import en0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import sm0.b;
/* compiled from: LeanMassState.kt */
/* loaded from: classes4.dex */
public final class LeanMassState {

    /* renamed from: a  reason: collision with root package name */
    private final State f46978a;

    /* renamed from: b  reason: collision with root package name */
    private final g<Double> f46979b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LeanMassState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/core/model/LeanMassState$State;", "", "weight-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class State {

        /* renamed from: a  reason: collision with root package name */
        public static final State f46980a;

        /* renamed from: b  reason: collision with root package name */
        public static final State f46981b;

        /* renamed from: c  reason: collision with root package name */
        public static final State f46982c;

        /* renamed from: d  reason: collision with root package name */
        public static final State f46983d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ State[] f46984e;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.weight.core.model.LeanMassState$State] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.weight.core.model.LeanMassState$State] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.weight.core.model.LeanMassState$State] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.weight.core.model.LeanMassState$State] */
        static {
            ?? r02 = new Enum("UNDEFINED", 0);
            f46980a = r02;
            ?? r12 = new Enum("HIGH", 1);
            f46981b = r12;
            ?? r22 = new Enum("HEALTHY", 2);
            f46982c = r22;
            ?? r32 = new Enum("LOW", 3);
            f46983d = r32;
            State[] stateArr = {r02, r12, r22, r32};
            f46984e = stateArr;
            b.a(stateArr);
        }

        private State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f46984e.clone();
        }
    }

    public LeanMassState(State state, g<Double> range) {
        u.j(range, "range");
        this.f46978a = state;
        this.f46979b = range;
    }

    public final g<Double> a() {
        return this.f46979b;
    }

    public final State b() {
        return this.f46978a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeanMassState)) {
            return false;
        }
        LeanMassState leanMassState = (LeanMassState) obj;
        if (this.f46978a == leanMassState.f46978a && u.e(this.f46979b, leanMassState.f46979b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f46979b.hashCode() + (this.f46978a.hashCode() * 31);
    }

    public final String toString() {
        return "LeanMassState(value=" + this.f46978a + ", range=" + this.f46979b + ")";
    }
}

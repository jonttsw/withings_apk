package com.withings.weight.core.model;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import kotlin.Metadata;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BmiState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/weight/core/model/BmiState;", "", "a", "weight-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BmiState {

    /* renamed from: b  reason: collision with root package name */
    public static final BmiState f46961b;

    /* renamed from: c  reason: collision with root package name */
    public static final BmiState f46962c;

    /* renamed from: d  reason: collision with root package name */
    public static final BmiState f46963d;

    /* renamed from: e  reason: collision with root package name */
    public static final BmiState f46964e;

    /* renamed from: f  reason: collision with root package name */
    public static final BmiState f46965f;

    /* renamed from: g  reason: collision with root package name */
    public static final BmiState f46966g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ BmiState[] f46967h;

    /* renamed from: a  reason: collision with root package name */
    private final a f46968a;

    /* compiled from: BmiState.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final double f46969a;

        /* renamed from: b  reason: collision with root package name */
        private final double f46970b;

        public a(double d11, double d12) {
            this.f46969a = d11;
            this.f46970b = d12;
        }

        public final double a() {
            return this.f46969a;
        }

        public final double b() {
            return this.f46970b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Double.compare(this.f46969a, aVar.f46969a) == 0 && Double.compare(this.f46970b, aVar.f46970b) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Double.hashCode(this.f46970b) + (Double.hashCode(this.f46969a) * 31);
        }

        public final String toString() {
            return "Range(lower=" + this.f46969a + ", upper=" + this.f46970b + ")";
        }
    }

    static {
        BmiState bmiState = new BmiState("UNDEFINED", 0, new a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        f46961b = bmiState;
        BmiState bmiState2 = new BmiState("UNDERWEIGHT", 1, new a(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 18.5d));
        f46962c = bmiState2;
        BmiState bmiState3 = new BmiState("HEALTHY", 2, new a(18.5d, 25.0d));
        f46963d = bmiState3;
        BmiState bmiState4 = new BmiState("OVERWEIGHT", 3, new a(25.0d, 30.0d));
        f46964e = bmiState4;
        BmiState bmiState5 = new BmiState("OBESE", 4, new a(30.0d, 40.0d));
        f46965f = bmiState5;
        BmiState bmiState6 = new BmiState("EXTREMELY_OBESE", 5, new a(40.0d, 150.0d));
        f46966g = bmiState6;
        BmiState[] bmiStateArr = {bmiState, bmiState2, bmiState3, bmiState4, bmiState5, bmiState6};
        f46967h = bmiStateArr;
        b.a(bmiStateArr);
    }

    private BmiState(String str, int i11, a aVar) {
        this.f46968a = aVar;
    }

    public static BmiState valueOf(String str) {
        return (BmiState) Enum.valueOf(BmiState.class, str);
    }

    public static BmiState[] values() {
        return (BmiState[]) f46967h.clone();
    }

    public final a a() {
        return this.f46968a;
    }
}

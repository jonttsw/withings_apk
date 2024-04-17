package com.withings.weight.android.usecases;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.weight.core.model.LeanMassState;
import en0.g;
import en0.k;
import en0.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.c;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Years;
import sm0.b;
/* compiled from: ComputeLeanMassStateUseCase.kt */
/* loaded from: classes4.dex */
public final class ComputeLeanMassStateUseCase {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ComputeLeanMassStateUseCase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/android/usecases/ComputeLeanMassStateUseCase$LeanMassNormalityZone;", "", "weight-android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class LeanMassNormalityZone {

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ LeanMassNormalityZone[] f46930d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ sm0.a f46931e;

        /* renamed from: a  reason: collision with root package name */
        private final k f46932a;

        /* renamed from: b  reason: collision with root package name */
        private final g<Double> f46933b;

        /* renamed from: c  reason: collision with root package name */
        private final g<Double> f46934c;

        static {
            LeanMassNormalityZone[] leanMassNormalityZoneArr = {new LeanMassNormalityZone("AGE_RANGE_19_39", 0, r.w(19, 40), r.o(80.0d, 92.0d), r.o(67.0d, 79.0d)), new LeanMassNormalityZone("AGE_RANGE_40_59", 1, r.w(40, 60), r.o(78.0d, 89.0d), r.o(66.0d, 77.0d)), new LeanMassNormalityZone("AGE_RANGE_60_79", 2, r.w(60, 80), r.o(75.0d, 87.0d), r.o(64.0d, 76.0d))};
            f46930d = leanMassNormalityZoneArr;
            f46931e = b.a(leanMassNormalityZoneArr);
        }

        private LeanMassNormalityZone(String str, int i11, k kVar, g gVar, g gVar2) {
            this.f46932a = kVar;
            this.f46933b = gVar;
            this.f46934c = gVar2;
        }

        public static sm0.a<LeanMassNormalityZone> b() {
            return f46931e;
        }

        public static LeanMassNormalityZone valueOf(String str) {
            return (LeanMassNormalityZone) Enum.valueOf(LeanMassNormalityZone.class, str);
        }

        public static LeanMassNormalityZone[] values() {
            return (LeanMassNormalityZone[]) f46930d.clone();
        }

        public final k a() {
            return this.f46932a;
        }

        public final g<Double> d() {
            return this.f46934c;
        }

        public final g<Double> e() {
            return this.f46933b;
        }
    }

    /* compiled from: ComputeLeanMassStateUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final DateTime f46935a;

        /* renamed from: b  reason: collision with root package name */
        private final double f46936b;

        public a(double d11, DateTime date) {
            u.j(date, "date");
            this.f46935a = date;
            this.f46936b = d11;
        }

        public final DateTime a() {
            return this.f46935a;
        }

        public final double b() {
            return this.f46936b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (u.e(this.f46935a, aVar.f46935a) && Double.compare(this.f46936b, aVar.f46936b) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Double.hashCode(this.f46936b) + (this.f46935a.hashCode() * 31);
        }

        public final String toString() {
            return "Params(date=" + this.f46935a + ", percentage=" + this.f46936b + ")";
        }
    }

    public static LeanMassState a(ArrayList arrayList, DateTime dateTime, boolean z5) {
        LeanMassNormalityZone leanMassNormalityZone;
        g<Double> e11;
        Object obj;
        a aVar = (a) x.U(arrayList);
        Double d11 = null;
        if (aVar != null) {
            Iterator it = ((c) LeanMassNormalityZone.b()).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    k a11 = ((LeanMassNormalityZone) obj).a();
                    int l5 = a11.l();
                    int n11 = a11.n();
                    int years = Years.yearsBetween(dateTime, aVar.a()).getYears();
                    if (l5 <= years && years <= n11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            leanMassNormalityZone = (LeanMassNormalityZone) obj;
        } else {
            leanMassNormalityZone = null;
        }
        if (z5) {
            if (leanMassNormalityZone != null) {
                e11 = leanMassNormalityZone.d();
            }
            e11 = null;
        } else {
            if (leanMassNormalityZone != null) {
                e11 = leanMassNormalityZone.e();
            }
            e11 = null;
        }
        if (aVar != null) {
            d11 = Double.valueOf(aVar.b());
        }
        if (d11 != null && !Double.isNaN(d11.doubleValue()) && e11 != null) {
            if (d11.doubleValue() >= e11.j().doubleValue()) {
                return new LeanMassState(LeanMassState.State.f46981b, r.o(e11.j().doubleValue(), 100.0d));
            }
            if (d11.doubleValue() <= e11.getStart().doubleValue()) {
                return new LeanMassState(LeanMassState.State.f46983d, r.o(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, e11.getStart().doubleValue()));
            }
            return new LeanMassState(LeanMassState.State.f46982c, e11);
        }
        return new LeanMassState(LeanMassState.State.f46980a, r.o(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
    }
}

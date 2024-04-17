package com.withings.weight.android.usecases;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.weight.core.model.WaterMassState;
import en0.g;
import en0.i;
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
/* compiled from: ComputeWaterMassStateUseCase.kt */
/* loaded from: classes4.dex */
public final class ComputeWaterMassStateUseCase {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ComputeWaterMassStateUseCase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/weight/android/usecases/ComputeWaterMassStateUseCase$WaterMassNormalityZoneRanges;", "", "weight-android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class WaterMassNormalityZoneRanges {

        /* renamed from: f  reason: collision with root package name */
        private static final /* synthetic */ WaterMassNormalityZoneRanges[] f46937f;

        /* renamed from: g  reason: collision with root package name */
        private static final /* synthetic */ sm0.a f46938g;

        /* renamed from: a  reason: collision with root package name */
        private final k f46939a;

        /* renamed from: b  reason: collision with root package name */
        private final g<Double> f46940b;

        /* renamed from: c  reason: collision with root package name */
        private final g<Double> f46941c;

        /* renamed from: d  reason: collision with root package name */
        private final g<Double> f46942d;

        /* renamed from: e  reason: collision with root package name */
        private final g<Double> f46943e;

        /* JADX WARN: Type inference failed for: r0v2, types: [en0.i, en0.k] */
        /* JADX WARN: Type inference failed for: r3v0, types: [en0.i, en0.k] */
        static {
            WaterMassNormalityZoneRanges[] waterMassNormalityZoneRangesArr = {new WaterMassNormalityZoneRanges("AGE_RANGE_19_50", 0, new i(19, 50, 1), r.o(40.0d, 60.0d), r.o(45.0d, 70.0d), r.o(45.0d, 65.0d), r.o(50.0d, 75.0d)), new WaterMassNormalityZoneRanges("AGE_RANGE_51_120", 1, new i(51, 120, 1), r.o(40.0d, 60.0d), r.o(45.0d, 65.0d), r.o(45.0d, 65.0d), r.o(50.0d, 70.0d))};
            f46937f = waterMassNormalityZoneRangesArr;
            f46938g = b.a(waterMassNormalityZoneRangesArr);
        }

        private WaterMassNormalityZoneRanges(String str, int i11, k kVar, g gVar, g gVar2, g gVar3, g gVar4) {
            this.f46939a = kVar;
            this.f46940b = gVar;
            this.f46941c = gVar2;
            this.f46942d = gVar3;
            this.f46943e = gVar4;
        }

        public static sm0.a<WaterMassNormalityZoneRanges> b() {
            return f46938g;
        }

        public static WaterMassNormalityZoneRanges valueOf(String str) {
            return (WaterMassNormalityZoneRanges) Enum.valueOf(WaterMassNormalityZoneRanges.class, str);
        }

        public static WaterMassNormalityZoneRanges[] values() {
            return (WaterMassNormalityZoneRanges[]) f46937f.clone();
        }

        public final k a() {
            return this.f46939a;
        }

        public final g<Double> d() {
            return this.f46942d;
        }

        public final g<Double> e() {
            return this.f46940b;
        }

        public final g<Double> f() {
            return this.f46943e;
        }

        public final g<Double> h() {
            return this.f46941c;
        }
    }

    /* compiled from: ComputeWaterMassStateUseCase.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final DateTime f46944a;

        /* renamed from: b  reason: collision with root package name */
        private final double f46945b;

        public a(double d11, DateTime date) {
            u.j(date, "date");
            this.f46944a = date;
            this.f46945b = d11;
        }

        public final DateTime a() {
            return this.f46944a;
        }

        public final double b() {
            return this.f46945b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (u.e(this.f46944a, aVar.f46944a) && Double.compare(this.f46945b, aVar.f46945b) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Double.hashCode(this.f46945b) + (this.f46944a.hashCode() * 31);
        }

        public final String toString() {
            return "Params(date=" + this.f46944a + ", percentage=" + this.f46945b + ")";
        }
    }

    public static WaterMassState a(ArrayList arrayList, DateTime dateTime, boolean z5, boolean z11) {
        WaterMassNormalityZoneRanges waterMassNormalityZoneRanges;
        g<Double> h11;
        Object obj;
        a aVar = (a) x.U(arrayList);
        Double d11 = null;
        if (aVar != null) {
            Iterator it = ((c) WaterMassNormalityZoneRanges.b()).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    k a11 = ((WaterMassNormalityZoneRanges) obj).a();
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
            waterMassNormalityZoneRanges = (WaterMassNormalityZoneRanges) obj;
        } else {
            waterMassNormalityZoneRanges = null;
        }
        if (z5 && z11) {
            if (waterMassNormalityZoneRanges != null) {
                h11 = waterMassNormalityZoneRanges.d();
            }
            h11 = null;
        } else if (z5) {
            if (waterMassNormalityZoneRanges != null) {
                h11 = waterMassNormalityZoneRanges.e();
            }
            h11 = null;
        } else if (z11) {
            if (waterMassNormalityZoneRanges != null) {
                h11 = waterMassNormalityZoneRanges.f();
            }
            h11 = null;
        } else {
            if (waterMassNormalityZoneRanges != null) {
                h11 = waterMassNormalityZoneRanges.h();
            }
            h11 = null;
        }
        if (aVar != null) {
            d11 = Double.valueOf(aVar.b());
        }
        if (d11 != null && !Double.isNaN(d11.doubleValue()) && h11 != null) {
            if (d11.doubleValue() >= h11.j().doubleValue()) {
                return new WaterMassState(WaterMassState.State.f46999d, r.o(h11.j().doubleValue(), 100.0d));
            }
            if (d11.doubleValue() < h11.getStart().doubleValue()) {
                return new WaterMassState(WaterMassState.State.f46997b, r.o(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, h11.getStart().doubleValue()));
            }
            return new WaterMassState(WaterMassState.State.f46998c, h11);
        }
        return new WaterMassState(WaterMassState.State.f46996a, r.o(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
    }
}

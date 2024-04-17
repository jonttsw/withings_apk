package com.withings.weight.ui.segmentalBodyCompositionScreen.model;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.wiscale2.C1987R;
import d2.h0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import sm0.b;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SegmentalBodyCompositionScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/withings/weight/ui/segmentalBodyCompositionScreen/model/SegmentalBodyCompositionScreen$Tab", "", "Lcom/withings/weight/ui/segmentalBodyCompositionScreen/model/SegmentalBodyCompositionScreen$Tab;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SegmentalBodyCompositionScreen$Tab {

    /* renamed from: g  reason: collision with root package name */
    public static final SegmentalBodyCompositionScreen$Tab f47782g;

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ SegmentalBodyCompositionScreen$Tab[] f47783h;

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f47784i;

    /* renamed from: a  reason: collision with root package name */
    private final int f47785a;

    /* renamed from: b  reason: collision with root package name */
    private final long f47786b;

    /* renamed from: c  reason: collision with root package name */
    private final long f47787c;

    /* renamed from: d  reason: collision with root package name */
    private final long f47788d;

    /* renamed from: e  reason: collision with root package name */
    private final long f47789e;

    /* renamed from: f  reason: collision with root package name */
    private final long f47790f;

    static {
        SegmentalBodyCompositionScreen$Tab segmentalBodyCompositionScreen$Tab = new SegmentalBodyCompositionScreen$Tab("BodyFat", 0, C1987R.string.bodyComposition_fatMassUnit, h0.c(4293972988L), h0.c(4290870511L), h0.c(4286195915L), h0.c(4282782866L), h0.c(4280420193L));
        f47782g = segmentalBodyCompositionScreen$Tab;
        SegmentalBodyCompositionScreen$Tab[] segmentalBodyCompositionScreen$TabArr = {segmentalBodyCompositionScreen$Tab, new SegmentalBodyCompositionScreen$Tab("MuscleMass", 1, C1987R.string.bodyComposition_muscleMassUnit, h0.c(4292475884L), h0.c(4287359697L), h0.c(4282170289L), h0.c(4280187782L), h0.c(4278928217L))};
        f47783h = segmentalBodyCompositionScreen$TabArr;
        f47784i = b.a(segmentalBodyCompositionScreen$TabArr);
    }

    private SegmentalBodyCompositionScreen$Tab(String str, int i11, int i12, long j5, long j11, long j12, long j13, long j14) {
        this.f47785a = i12;
        this.f47786b = j5;
        this.f47787c = j11;
        this.f47788d = j12;
        this.f47789e = j13;
        this.f47790f = j14;
    }

    public static sm0.a<SegmentalBodyCompositionScreen$Tab> i() {
        return f47784i;
    }

    public static SegmentalBodyCompositionScreen$Tab valueOf(String str) {
        return (SegmentalBodyCompositionScreen$Tab) Enum.valueOf(SegmentalBodyCompositionScreen$Tab.class, str);
    }

    public static SegmentalBodyCompositionScreen$Tab[] values() {
        return (SegmentalBodyCompositionScreen$Tab[]) f47783h.clone();
    }

    public final long a() {
        return this.f47789e;
    }

    public final long b() {
        return this.f47790f;
    }

    public final long d() {
        return this.f47787c;
    }

    public final long e() {
        return this.f47786b;
    }

    public final long f() {
        return this.f47788d;
    }

    public final long h(double d11, a populationRepartition) {
        u.j(populationRepartition, "populationRepartition");
        int i11 = (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE > d11 ? 1 : (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE == d11 ? 0 : -1));
        long j5 = this.f47786b;
        if ((i11 > 0 || d11 > populationRepartition.d().a().c()) && !populationRepartition.d().a().a(d11)) {
            if (populationRepartition.c().a().a(d11)) {
                return this.f47787c;
            }
            if (populationRepartition.e().a().a(d11)) {
                return this.f47788d;
            }
            if (populationRepartition.a().a().a(d11)) {
                return this.f47789e;
            }
            boolean a11 = populationRepartition.b().a().a(d11);
            long j11 = this.f47790f;
            if (!a11) {
                if (populationRepartition.b().a().b() > d11 || d11 > Double.MAX_VALUE) {
                    long c11 = h0.c(4294706168L);
                    x70.b.n(new IllegalArgumentException("value of segmental body composition [" + d11 + "] is not in possible boundaries"));
                    return c11;
                }
                return j11;
            }
            return j11;
        }
        return j5;
    }

    public final int l() {
        return this.f47785a;
    }
}

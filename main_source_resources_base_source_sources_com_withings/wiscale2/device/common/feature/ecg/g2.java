package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: Effects.kt */
/* loaded from: classes5.dex */
public final class g2 implements k1.v {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.media3.exoplayer.g f51356a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h2 f51357b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.l0 f51358c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.n0 f51359d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.o0 f51360e;

    public g2(androidx.media3.exoplayer.g gVar, h2 h2Var, kotlin.jvm.internal.l0 l0Var, kotlin.jvm.internal.n0 n0Var, kotlin.jvm.internal.o0 o0Var) {
        this.f51356a = gVar;
        this.f51357b = h2Var;
        this.f51358c = l0Var;
        this.f51359d = n0Var;
        this.f51360e = o0Var;
    }

    @Override // k1.v
    public final void dispose() {
        fn0.k<Object>[] kVarArr = EcgActivationActivity.f51062k;
        androidx.media3.exoplayer.g gVar = this.f51356a;
        this.f51358c.f76251a = gVar.C();
        this.f51359d.f76254a = gVar.V();
        this.f51360e.f76256a = en0.r.c(0L, gVar.Q());
        gVar.M(this.f51357b);
        gVar.release();
    }
}

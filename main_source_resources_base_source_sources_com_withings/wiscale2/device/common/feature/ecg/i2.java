package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class i2 extends kotlin.jvm.internal.w implements ym0.l<k1.w, k1.v> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.media3.exoplayer.g f51412a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f51413b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f51414c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.l0 f51415d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.n0 f51416e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.o0 f51417f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(androidx.media3.exoplayer.g gVar, k1.r0<Boolean> r0Var, k1.r0<Boolean> r0Var2, kotlin.jvm.internal.l0 l0Var, kotlin.jvm.internal.n0 n0Var, kotlin.jvm.internal.o0 o0Var) {
        super(1);
        this.f51412a = gVar;
        this.f51413b = r0Var;
        this.f51414c = r0Var2;
        this.f51415d = l0Var;
        this.f51416e = n0Var;
        this.f51417f = o0Var;
    }

    @Override // ym0.l
    public final k1.v invoke(k1.w wVar) {
        k1.w DisposableEffect = wVar;
        kotlin.jvm.internal.u.j(DisposableEffect, "$this$DisposableEffect");
        h2 h2Var = new h2(this.f51413b, this.f51414c);
        this.f51412a.O(h2Var);
        return new g2(this.f51412a, h2Var, this.f51415d, this.f51416e, this.f51417f);
    }
}

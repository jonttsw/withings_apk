package com.withings.wiscale2.device.common.feature.ecg;

import m6.x;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class h2 implements x.c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f51392a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f51393b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h2(k1.r0<Boolean> r0Var, k1.r0<Boolean> r0Var2) {
        this.f51392a = r0Var;
        this.f51393b = r0Var2;
    }

    @Override // m6.x.c
    public final void q1(boolean z5) {
        fn0.k<Object>[] kVarArr = EcgActivationActivity.f51062k;
        this.f51393b.setValue(Boolean.valueOf(z5));
        this.f51392a.setValue(Boolean.FALSE);
    }

    @Override // m6.x.c
    public final void w0(boolean z5) {
        fn0.k<Object>[] kVarArr = EcgActivationActivity.f51062k;
        this.f51392a.setValue(Boolean.valueOf(z5));
    }
}

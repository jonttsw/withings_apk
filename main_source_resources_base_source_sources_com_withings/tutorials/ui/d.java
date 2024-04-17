package com.withings.tutorials.ui;
/* compiled from: Effects.kt */
/* loaded from: classes4.dex */
public final class d implements k1.v {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.d0 f44717a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.b0 f44718b;

    public d(androidx.lifecycle.d0 d0Var, b bVar) {
        this.f44717a = d0Var;
        this.f44718b = bVar;
    }

    @Override // k1.v
    public final void dispose() {
        this.f44717a.getLifecycle().d(this.f44718b);
    }
}

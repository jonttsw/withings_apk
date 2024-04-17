package com.withings.wiscale2;

import android.app.Service;
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
final class p implements ek0.d {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f58819a;

    /* renamed from: b  reason: collision with root package name */
    private Service f58820b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(b0 b0Var) {
        this.f58819a = b0Var;
    }

    @Override // ek0.d
    public final ek0.d a(Service service) {
        service.getClass();
        this.f58820b = service;
        return this;
    }

    @Override // ek0.d
    public final ck0.d build() {
        ah.p.b(Service.class, this.f58820b);
        return new q(this.f58819a);
    }
}

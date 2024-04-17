package com.withings.wiscale2;

import androidx.fragment.app.Fragment;
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
final class n implements ek0.c {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f58716a;

    /* renamed from: b  reason: collision with root package name */
    private final l f58717b;

    /* renamed from: c  reason: collision with root package name */
    private final j f58718c;

    /* renamed from: d  reason: collision with root package name */
    private Fragment f58719d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(b0 b0Var, l lVar, j jVar) {
        this.f58716a = b0Var;
        this.f58717b = lVar;
        this.f58718c = jVar;
    }

    @Override // ek0.c
    public final ek0.c a(Fragment fragment) {
        fragment.getClass();
        this.f58719d = fragment;
        return this;
    }

    @Override // ek0.c
    public final ck0.c build() {
        ah.p.b(Fragment.class, this.f58719d);
        return new o(this.f58716a, this.f58717b, this.f58718c);
    }
}

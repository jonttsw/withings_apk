package com.withings.wiscale2;
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
final class k implements ek0.b {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f57973a;

    /* renamed from: b  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f57974b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(b0 b0Var) {
        this.f57973a = b0Var;
    }

    @Override // ek0.b
    public final ek0.b a(dagger.hilt.android.internal.managers.g gVar) {
        this.f57974b = gVar;
        return this;
    }

    @Override // ek0.b
    public final ck0.b build() {
        ah.p.b(dagger.hilt.android.internal.managers.g.class, this.f57974b);
        return new l(this.f57973a);
    }
}

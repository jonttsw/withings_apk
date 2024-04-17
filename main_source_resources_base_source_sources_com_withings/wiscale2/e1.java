package com.withings.wiscale2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class e1 implements ek0.f {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f56020a;

    /* renamed from: b  reason: collision with root package name */
    private final l f56021b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.lifecycle.u0 f56022c;

    /* renamed from: d  reason: collision with root package name */
    private bk0.b f56023d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(b0 b0Var, l lVar) {
        this.f56020a = b0Var;
        this.f56021b = lVar;
    }

    @Override // ek0.f
    public final ek0.f a(androidx.lifecycle.u0 u0Var) {
        this.f56022c = u0Var;
        return this;
    }

    @Override // ek0.f
    public final ek0.f b(fk0.f fVar) {
        this.f56023d = fVar;
        return this;
    }

    @Override // ek0.f
    public final ck0.f build() {
        ah.p.b(androidx.lifecycle.u0.class, this.f56022c);
        ah.p.b(bk0.b.class, this.f56023d);
        return new f1(this.f56020a, this.f56021b, this.f56022c);
    }
}

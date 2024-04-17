package com.withings.wiscale2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class l extends o1 {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f57979a;

    /* renamed from: b  reason: collision with root package name */
    private final l f57980b = this;

    /* renamed from: c  reason: collision with root package name */
    private dagger.internal.d<bk0.a> f57981c = dagger.internal.a.c(new Object());

    /* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
    /* loaded from: classes4.dex */
    private static final class a<T> implements dagger.internal.d<T> {
        @Override // javax.inject.Provider
        public final T get() {
            return (T) new fk0.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v1, types: [dagger.internal.d, java.lang.Object] */
    public l(b0 b0Var) {
        this.f57979a = b0Var;
    }

    @Override // dagger.hilt.android.internal.managers.a.InterfaceC0823a
    public final ek0.a a() {
        return new i(this.f57979a, this.f57980b);
    }

    @Override // dagger.hilt.android.internal.managers.c.InterfaceC0824c
    public final bk0.a b() {
        return this.f57981c.get();
    }
}

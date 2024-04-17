package com.withings.wiscale2;
/* compiled from: Hilt_HealthmateApplication.java */
/* loaded from: classes4.dex */
abstract class u1 extends BaseApplication implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f61738a = false;

    /* renamed from: b  reason: collision with root package name */
    private final dagger.hilt.android.internal.managers.d f61739b = new dagger.hilt.android.internal.managers.d(new a());

    /* compiled from: Hilt_HealthmateApplication.java */
    /* loaded from: classes4.dex */
    final class a implements dagger.hilt.android.internal.managers.e {
        a() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.m, java.lang.Object] */
        @Override // dagger.hilt.android.internal.managers.e
        public final Object get() {
            ?? obj = new Object();
            obj.a(new gk0.a(u1.this));
            return obj.b();
        }
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        return this.f61739b.generatedComponent();
    }

    @Override // android.app.Application
    public void onCreate() {
        if (!this.f61738a) {
            this.f61738a = true;
            ((m1) this.f61739b.generatedComponent()).H((HealthmateApplication) this);
        }
        super.onCreate();
    }
}

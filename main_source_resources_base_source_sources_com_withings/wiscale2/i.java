package com.withings.wiscale2;

import android.app.Activity;
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
final class i implements ek0.a {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f57851a;

    /* renamed from: b  reason: collision with root package name */
    private final l f57852b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f57853c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(b0 b0Var, l lVar) {
        this.f57851a = b0Var;
        this.f57852b = lVar;
    }

    @Override // ek0.a
    public final ek0.a a(Activity activity) {
        activity.getClass();
        this.f57853c = activity;
        return this;
    }

    @Override // ek0.a
    public final ck0.a build() {
        ah.p.b(Activity.class, this.f57853c);
        return new j(this.f57851a, this.f57852b, this.f57853c);
    }
}

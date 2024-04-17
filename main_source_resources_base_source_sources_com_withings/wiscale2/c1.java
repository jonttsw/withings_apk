package com.withings.wiscale2;

import android.view.View;
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
final class c1 implements ek0.e {

    /* renamed from: a  reason: collision with root package name */
    private final b0 f50306a;

    /* renamed from: b  reason: collision with root package name */
    private View f50307b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c1(b0 b0Var, l lVar, j jVar) {
        this.f50306a = b0Var;
    }

    @Override // ek0.e
    public final ek0.e a(View view) {
        view.getClass();
        this.f50307b = view;
        return this;
    }

    @Override // ek0.e
    public final ck0.e build() {
        ah.p.b(View.class, this.f50307b);
        return new d1(this.f50306a);
    }
}

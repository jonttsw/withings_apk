package com.withings.wiscale2.partner.ui;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PartnerIntroFragment.kt */
/* loaded from: classes5.dex */
public final class i1 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f59114a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f59115b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f59116c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k1 k1Var, boolean z5, Context context) {
        super(0);
        this.f59114a = k1Var;
        this.f59115b = z5;
        this.f59116c = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        k1 k1Var = this.f59114a;
        String B = k1Var.B1().B();
        Context context = this.f59116c;
        if (B != null && !this.f59115b) {
            String string = context.getString(k1Var.B1().d());
            kotlin.jvm.internal.u.i(string, "getString(...)");
            k1Var.f59142n.a(u70.e.b(string, k1Var.B1().B()));
        } else {
            u70.e.d(context, k1Var.B1().d());
        }
        return nm0.y.f85009a;
    }
}

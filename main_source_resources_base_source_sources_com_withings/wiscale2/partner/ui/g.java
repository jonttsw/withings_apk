package com.withings.wiscale2.partner.ui;

import androidx.lifecycle.LiveData;
import java.util.List;
/* compiled from: PartnerActivity.kt */
/* loaded from: classes5.dex */
public final class g extends androidx.lifecycle.j0<List<? extends u10.u>> {

    /* renamed from: a  reason: collision with root package name */
    private final LiveData<List<d0>> f59081a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveData<List<d0>> f59082b;

    public g(androidx.lifecycle.j0 j0Var, androidx.lifecycle.j0 j0Var2, xw.h hVar) {
        this.f59081a = j0Var;
        this.f59082b = j0Var2;
        addSource(j0Var, new x(new c(this)));
        addSource(j0Var2, new x(new d(this)));
        addSource(hVar, new x(new e(this)));
    }

    public static final void t(g gVar) {
        cr.a.a(new nm0.j(gVar.f59081a.getValue(), gVar.f59082b.getValue()), new f(gVar));
    }
}

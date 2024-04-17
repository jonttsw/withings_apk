package com.withings.weight.legacy;

import androidx.lifecycle.g1;
import androidx.lifecycle.k0;
import com.withings.user.User;
import fy.c0;
import java.util.List;
/* compiled from: WeightDetailFragment.kt */
/* loaded from: classes4.dex */
public final class a0 extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final fy.a f47024a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f47025b;

    /* renamed from: c  reason: collision with root package name */
    private final zx.r f47026c;

    /* renamed from: d  reason: collision with root package name */
    private final fy.n f47027d;

    /* renamed from: e  reason: collision with root package name */
    private final xw.m<List<ky.d>> f47028e;

    /* renamed from: f  reason: collision with root package name */
    private final xw.m<Boolean> f47029f;

    /* renamed from: g  reason: collision with root package name */
    private final k0<Double> f47030g;

    public a0(User user, fy.a aVar, c0 c0Var, zx.r rVar, fy.n nVar) {
        kotlin.jvm.internal.u.j(user, "user");
        this.f47024a = aVar;
        this.f47025b = c0Var;
        this.f47026c = rVar;
        this.f47027d = nVar;
        this.f47028e = new xw.m<>();
        this.f47029f = new xw.m<>();
        this.f47030g = new k0<>();
    }

    public final k0<Double> k0() {
        return this.f47030g;
    }

    public final xw.m<Boolean> m0() {
        return this.f47029f;
    }

    public final xw.m<List<ky.d>> p0() {
        return this.f47028e;
    }

    public final void q0(ky.d dVar, User user) {
        Double d11;
        kotlin.jvm.internal.u.j(user, "user");
        ky.a e11 = ly.a.e(8, dVar);
        ky.a e12 = ly.a.e(1, dVar);
        k0<Double> k0Var = this.f47030g;
        if (!user.C() && e11 != null) {
            d11 = Double.valueOf(e11.f());
        } else if (e11 != null && e12 != null) {
            d11 = Double.valueOf((e11.f() / e12.f()) * 100);
        } else {
            d11 = null;
        }
        k0Var.setValue(d11);
    }
}

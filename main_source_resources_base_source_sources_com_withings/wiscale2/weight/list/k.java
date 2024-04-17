package com.withings.wiscale2.weight.list;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.user.User;
import fy.n;
import kotlin.jvm.internal.u;
/* compiled from: WeightListActivityMeasurementsViewModel.kt */
/* loaded from: classes5.dex */
public final class k extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final fy.a f62928a;

    /* renamed from: b  reason: collision with root package name */
    private final zx.i f62929b;

    public k(User user, cy.a aVar, n nVar, fy.a aVar2) {
        u.j(user, "user");
        this.f62928a = aVar2;
        this.f62929b = new zx.i(h1.a(this).getCoroutineContext(), user, 1, nVar, aVar);
    }

    public final zx.i g0() {
        return this.f62929b;
    }
}

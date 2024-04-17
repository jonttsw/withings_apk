package com.withings.details.height;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.user.User;
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
public final class e0 extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final fy.a f36598a;

    /* renamed from: b  reason: collision with root package name */
    private final zx.i f36599b;

    public e0(User user, cy.a aVar, fy.n nVar, fy.a aVar2) {
        kotlin.jvm.internal.u.j(user, "user");
        this.f36598a = aVar2;
        this.f36599b = new zx.i(h1.a(this).getCoroutineContext(), user, 4, nVar, aVar);
    }

    public final zx.i g0() {
        return this.f36599b;
    }
}

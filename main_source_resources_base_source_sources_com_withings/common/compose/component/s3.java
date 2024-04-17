package com.withings.common.compose.component;

import androidx.lifecycle.Lifecycle;
/* compiled from: Effects.kt */
/* loaded from: classes3.dex */
public final class s3 implements k1.v {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Lifecycle f34715a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.b0 f34716b;

    public s3(Lifecycle lifecycle, r3 r3Var) {
        this.f34715a = lifecycle;
        this.f34716b = r3Var;
    }

    @Override // k1.v
    public final void dispose() {
        this.f34715a.d(this.f34716b);
    }
}

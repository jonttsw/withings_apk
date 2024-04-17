package com.withings.wiscale2.device.common.screen.ui;

import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes5.dex */
public final class l2<T> implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h2 f53387a;

    public l2(h2 h2Var) {
        this.f53387a = h2Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t11, T t12) {
        h2 h2Var = this.f53387a;
        return pm0.a.b(((wp.u) t11).b(h2Var.q0()), ((wp.u) t12).b(h2Var.q0()));
    }
}

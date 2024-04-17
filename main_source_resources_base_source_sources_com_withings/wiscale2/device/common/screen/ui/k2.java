package com.withings.wiscale2.device.common.screen.ui;

import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes5.dex */
public final class k2<T> implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int[] f53377a;

    public k2(int[] iArr) {
        this.f53377a = iArr;
    }

    @Override // java.util.Comparator
    public final int compare(T t11, T t12) {
        int g11 = (int) ((wp.u) t11).g();
        int[] iArr = this.f53377a;
        return pm0.a.b(Integer.valueOf(kotlin.collections.l.H(g11, iArr)), Integer.valueOf(kotlin.collections.l.H((int) ((wp.u) t12).g(), iArr)));
    }
}

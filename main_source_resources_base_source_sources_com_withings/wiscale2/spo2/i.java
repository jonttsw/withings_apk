package com.withings.wiscale2.spo2;

import java.util.Comparator;
import ji0.c0;
/* compiled from: Comparisons.kt */
/* loaded from: classes5.dex */
public final class i<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t11, T t12) {
        return pm0.a.b(Long.valueOf(((c0.a) t12).b()), Long.valueOf(((c0.a) t11).b()));
    }
}

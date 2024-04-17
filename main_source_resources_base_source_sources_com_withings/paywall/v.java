package com.withings.paywall;

import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes4.dex */
public final class v<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t11, T t12) {
        return pm0.a.b(Double.valueOf(((b0) t11).d()), Double.valueOf(((b0) t12).d()));
    }
}

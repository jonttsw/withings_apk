package com.withings.fever.ui;

import java.util.Comparator;
import java.util.List;
/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public final class m0<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t11, T t12) {
        return pm0.a.b(Integer.valueOf(((List) t11).size()), Integer.valueOf(((List) t12).size()));
    }
}

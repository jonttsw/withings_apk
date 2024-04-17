package com.withings.wiscale2.heart.heartrate;

import com.withings.vasistas.model.Vasistas;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes5.dex */
public final class b<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t11, T t12) {
        return pm0.a.b(((Vasistas) t11).getStartDate(), ((Vasistas) t12).getStartDate());
    }
}

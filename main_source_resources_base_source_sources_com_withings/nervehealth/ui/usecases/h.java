package com.withings.nervehealth.ui.usecases;

import java.util.Comparator;
import java.util.Map;
import org.joda.time.DateTime;
/* compiled from: Comparisons.kt */
/* loaded from: classes4.dex */
public final class h<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t11, T t12) {
        return pm0.a.b((DateTime) ((Map.Entry) t12).getKey(), (DateTime) ((Map.Entry) t11).getKey());
    }
}

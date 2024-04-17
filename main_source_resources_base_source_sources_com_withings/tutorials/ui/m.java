package com.withings.tutorials.ui;

import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes4.dex */
public final class m<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t11, T t12) {
        boolean z5;
        o60.f fVar = (o60.f) t12;
        boolean z11 = false;
        if (fVar.b() && fVar.c()) {
            z5 = true;
        } else {
            z5 = false;
        }
        Boolean valueOf = Boolean.valueOf(z5);
        o60.f fVar2 = (o60.f) t11;
        if (fVar2.b() && fVar2.c()) {
            z11 = true;
        }
        return pm0.a.b(valueOf, Boolean.valueOf(z11));
    }
}

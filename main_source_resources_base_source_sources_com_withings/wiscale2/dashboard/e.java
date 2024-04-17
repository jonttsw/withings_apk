package com.withings.wiscale2.dashboard;

import android.content.Context;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes4.dex */
public final class e<T> implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f50518a;

    public e(Context context) {
        this.f50518a = context;
    }

    @Override // java.util.Comparator
    public final int compare(T t11, T t12) {
        int d11 = ((com.withings.wiscale2.dashboard.item.model.c) t11).d();
        Context context = this.f50518a;
        return pm0.a.b(context.getString(d11), context.getString(((com.withings.wiscale2.dashboard.item.model.c) t12).d()));
    }
}

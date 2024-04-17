package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: SleepDisorderGraphPagerFragment.kt */
/* loaded from: classes5.dex */
final class y0 extends kotlin.jvm.internal.w implements ym0.l<Map<com.withings.date.android.a, ? extends List<? extends DatedValue>>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w0 f61497a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f61498b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(w0 w0Var, Context context) {
        super(1);
        this.f61497a = w0Var;
        this.f61498b = context;
    }

    @Override // ym0.l
    public final nm0.y invoke(Map<com.withings.date.android.a, ? extends List<? extends DatedValue>> map) {
        n1 n1Var;
        Map<com.withings.date.android.a, ? extends List<? extends DatedValue>> map2 = map;
        if (map2 != null) {
            n1Var = this.f61497a.f61485l;
            if (n1Var != null) {
                ArrayList arrayList = new ArrayList(map2.size());
                for (Map.Entry<com.withings.date.android.a, ? extends List<? extends DatedValue>> entry : map2.entrySet()) {
                    arrayList.add(new h1(entry.getKey().d(this.f61498b), entry.getValue()));
                }
                n1Var.a(arrayList);
            } else {
                kotlin.jvm.internal.u.s("sleepDisorderStatePagerAdapter");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}

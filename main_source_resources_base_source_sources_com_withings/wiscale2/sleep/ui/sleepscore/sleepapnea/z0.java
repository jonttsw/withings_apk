package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;
/* compiled from: SleepDisorderGraphPagerFragment.kt */
/* loaded from: classes5.dex */
final class z0 extends kotlin.jvm.internal.w implements ym0.l<Map<Integer, ? extends List<? extends DatedValue>>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w0 f61500a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f61501b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(w0 w0Var, Context context) {
        super(1);
        this.f61500a = w0Var;
        this.f61501b = context;
    }

    @Override // ym0.l
    public final nm0.y invoke(Map<Integer, ? extends List<? extends DatedValue>> map) {
        n1 n1Var;
        Map<Integer, ? extends List<? extends DatedValue>> map2 = map;
        if (map2 != null) {
            n1Var = this.f61500a.f61485l;
            if (n1Var != null) {
                ArrayList arrayList = new ArrayList(map2.size());
                for (Map.Entry<Integer, ? extends List<? extends DatedValue>> entry : map2.entrySet()) {
                    DateTime withYear = DateTime.now().withYear(entry.getKey().intValue());
                    kotlin.jvm.internal.u.i(withYear, "withYear(...)");
                    arrayList.add(new h1(b50.b.q(this.f61501b, withYear), entry.getValue()));
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

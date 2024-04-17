package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.sleep.ui.sleepscore.e2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
/* compiled from: SleepDisorderDayPagerFragment.kt */
/* loaded from: classes5.dex */
final class v1 extends kotlin.jvm.internal.w implements ym0.l<List<? extends nm0.j<? extends Long, ? extends DateTime>>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t1 f61538a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(t1 t1Var) {
        super(1);
        this.f61538a = t1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends nm0.j<? extends Long, ? extends DateTime>> list) {
        e2 e2Var;
        BlockableViewPager blockableViewPager;
        List<? extends nm0.j<? extends Long, ? extends DateTime>> list2 = list;
        if (list2 != null) {
            t1 t1Var = this.f61538a;
            e2Var = t1Var.f61515q;
            if (e2Var != null) {
                List<? extends nm0.j<? extends Long, ? extends DateTime>> list3 = list2;
                ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    nm0.j jVar = (nm0.j) it.next();
                    long longValue = ((Number) jVar.a()).longValue();
                    DateTime dateTime = (DateTime) jVar.b();
                    blockableViewPager = t1Var.f61512n;
                    if (blockableViewPager != null) {
                        Context context = blockableViewPager.getContext();
                        kotlin.jvm.internal.u.i(context, "getContext(...)");
                        arrayList.add(new e2.a(longValue, dateTime, b50.b.m(dateTime, context, true, 4)));
                    } else {
                        kotlin.jvm.internal.u.s("viewPager");
                        throw null;
                    }
                }
                e2Var.a(arrayList);
            } else {
                kotlin.jvm.internal.u.s("sleepApneaDayStatePagerAdapter");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}

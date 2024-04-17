package com.withings.wiscale2.device.common.feature.highlowhr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: HighLowHRSettingsActivity.kt */
/* loaded from: classes5.dex */
public final class g0 implements ym0.p<Integer, gi.b, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<nm0.j<gi.b, ym0.a<nm0.y>>> f52272a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(List<? extends nm0.j<gi.b, ? extends ym0.a<nm0.y>>> list) {
        this.f52272a = list;
    }

    @Override // ym0.p
    public final nm0.y invoke(Integer num, gi.b bVar) {
        int intValue = num.intValue();
        gi.b info = bVar;
        kotlin.jvm.internal.u.j(info, "info");
        List<nm0.j<gi.b, ym0.a<nm0.y>>> list = this.f52272a;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((ym0.a) ((nm0.j) it.next()).d());
        }
        ((ym0.a) arrayList.get(intValue)).invoke();
        return nm0.y.f85009a;
    }
}

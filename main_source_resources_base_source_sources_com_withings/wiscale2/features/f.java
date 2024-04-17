package com.withings.wiscale2.features;

import com.withings.features.model.FeatureFlagCategory;
import java.util.Iterator;
import java.util.List;
import k1.o1;
import k1.r0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.j;
import nm0.y;
import s0.i0;
import ym0.l;
/* compiled from: FeatureFlagsActivity.kt */
/* loaded from: classes5.dex */
final class f extends w implements l<i0, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o1<List<j<FeatureFlagCategory, List<pf0.h>>>> f56112a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r0 r0Var) {
        super(1);
        this.f56112a = r0Var;
    }

    @Override // ym0.l
    public final y invoke(i0 i0Var) {
        i0 LazyColumn = i0Var;
        u.j(LazyColumn, "$this$LazyColumn");
        Iterator<T> it = this.f56112a.getValue().iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            List list = (List) jVar.b();
            i0.f(LazyColumn, null, new s1.a(true, 1050674019, new c((FeatureFlagCategory) jVar.a())), 3);
            LazyColumn.c(list.size(), null, new pf0.b(list), new s1.a(true, -1091073711, new e(list, list)));
        }
        return y.f85009a;
    }
}

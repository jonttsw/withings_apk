package com.withings.common.compose.component;

import java.util.ArrayList;
import java.util.List;
/* compiled from: HorizontalBar.kt */
/* loaded from: classes3.dex */
final class a2 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<u1> f33369a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(List<u1> list) {
        super(2);
        this.f33369a = list;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            List<u1> list = this.f33369a;
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
            for (u1 u1Var : list) {
                w1.b(null, u1Var, aVar2, 0, 1);
                arrayList.add(nm0.y.f85009a);
            }
        }
        return nm0.y.f85009a;
    }
}

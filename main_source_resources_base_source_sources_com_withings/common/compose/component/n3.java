package com.withings.common.compose.component;

import java.util.ArrayList;
import java.util.List;
/* compiled from: ScrollableTabRow.kt */
/* loaded from: classes3.dex */
final class n3 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.q<List<s4>, androidx.compose.runtime.a, Integer, nm0.y> f34184a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<s4> f34185b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(ArrayList arrayList, ym0.q qVar) {
        super(2);
        this.f34184a = qVar;
        this.f34185b = arrayList;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            this.f34184a.invoke(this.f34185b, aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}

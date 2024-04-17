package com.withings.common.compose.component;

import androidx.compose.material3.f8;
import androidx.compose.material3.g8;
import androidx.compose.material3.ga;
import androidx.compose.material3.na;
import androidx.compose.material3.oa;
/* compiled from: UserDropDownMenuWithings.kt */
/* loaded from: classes3.dex */
final class n5 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p5 f34220a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(p5 p5Var) {
        super(2);
        this.f34220a = p5Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            ga.b(this.f34220a.b(), androidx.compose.foundation.layout.x0.j(androidx.collection.c.g(androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f), ((f8) aVar2.D(g8.a())).d()), yk.h.o(), 0.0f, yk.h.o(), 0.0f, 10), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((na) aVar2.D(oa.b())).a(), aVar2, 0, 0, 65532);
        }
        return nm0.y.f85009a;
    }
}

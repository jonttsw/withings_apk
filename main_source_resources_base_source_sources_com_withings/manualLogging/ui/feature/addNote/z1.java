package com.withings.manualLogging.ui.feature.addNote;

import com.withings.common.compose.component.y3;
/* compiled from: SelectManualLogCategoryScreen.kt */
/* loaded from: classes4.dex */
final class z1 extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f41637a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z1(ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar) {
        super(3);
        this.f41637a = pVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        s0.b item = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(item, "$this$item");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            y3.c(null, null, null, null, 0.0f, 0L, s1.b.b(aVar2, -801287010, new y1(this.f41637a)), aVar2, 1572864, 63);
        }
        return nm0.y.f85009a;
    }
}

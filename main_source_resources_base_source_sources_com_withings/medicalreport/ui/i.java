package com.withings.medicalreport.ui;

import com.withings.common.compose.component.d3;
import java.util.List;
import k1.o1;
import k1.r0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateSelectionFragment.kt */
/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o1<List<com.withings.common.compose.component.e0>> f42252a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o1<Integer> f42253b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DateSelectionFragment f42254c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r0 r0Var, r0 r0Var2, DateSelectionFragment dateSelectionFragment) {
        super(2);
        this.f42252a = r0Var;
        this.f42253b = r0Var2;
        this.f42254c = dateSelectionFragment;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            int i11 = DateSelectionFragment.f42160e;
            d3.a(null, this.f42252a.getValue(), this.f42253b.getValue(), false, 0L, null, new h(this.f42254c), aVar2, 64, 57);
        }
        return nm0.y.f85009a;
    }
}

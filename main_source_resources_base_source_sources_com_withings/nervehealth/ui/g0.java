package com.withings.nervehealth.ui;

import androidx.compose.material.c5;
/* compiled from: NerveHealthMeasureListActivity.kt */
/* loaded from: classes4.dex */
final class g0 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthMeasureListActivity f42518a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c5 f42519b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(NerveHealthMeasureListActivity nerveHealthMeasureListActivity, c5 c5Var) {
        super(3);
        this.f42518a = nerveHealthMeasureListActivity;
        this.f42519b = c5Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h ModalBottomSheetLayout = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            NerveHealthMeasureListActivity.z3(this.f42518a, this.f42519b, aVar2, 72);
        }
        return nm0.y.f85009a;
    }
}

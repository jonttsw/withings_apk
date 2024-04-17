package com.withings.tutorials.ui.screens.howtouse;
/* compiled from: HowToTakeAMeasurementActivity.kt */
/* loaded from: classes4.dex */
final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HowToTakeAMeasurementActivity f45408a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(HowToTakeAMeasurementActivity howToTakeAMeasurementActivity) {
        super(2);
        this.f45408a = howToTakeAMeasurementActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], aVar2);
            i iVar = i.f45435a;
            HowToTakeAMeasurementActivity howToTakeAMeasurementActivity = this.f45408a;
            iVar.a(Long.valueOf(HowToTakeAMeasurementActivity.A3(howToTakeAMeasurementActivity)), HowToTakeAMeasurementActivity.z3(howToTakeAMeasurementActivity).getId(), HowToTakeAMeasurementActivity.z3(howToTakeAMeasurementActivity).getModelId(), HowToTakeAMeasurementActivity.z3(howToTakeAMeasurementActivity).getColor(), c11, new c(howToTakeAMeasurementActivity), new d(howToTakeAMeasurementActivity), aVar2, 12615680);
        }
        return nm0.y.f85009a;
    }
}

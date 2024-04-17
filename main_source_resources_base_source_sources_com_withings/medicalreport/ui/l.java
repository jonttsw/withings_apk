package com.withings.medicalreport.ui;
/* compiled from: DateSelectionFragment.kt */
/* loaded from: classes4.dex */
final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DateSelectionFragment f42258a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(DateSelectionFragment dateSelectionFragment) {
        super(2);
        this.f42258a = dateSelectionFragment;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            DateSelectionFragment.t1(this.f42258a, aVar2, 8);
        }
        return nm0.y.f85009a;
    }
}

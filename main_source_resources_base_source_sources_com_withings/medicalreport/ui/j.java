package com.withings.medicalreport.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateSelectionFragment.kt */
/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DateSelectionFragment f42255a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DateSelectionFragment dateSelectionFragment) {
        super(3);
        this.f42255a = dateSelectionFragment;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        DateSelectionFragment.s1(this.f42255a, aVar, 8);
        return nm0.y.f85009a;
    }
}

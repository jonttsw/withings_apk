package com.withings.medicalreport.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateSelectionFragment.kt */
/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DateSelectionFragment f42249a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42250b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DateSelectionFragment dateSelectionFragment, int i11) {
        super(2);
        this.f42249a = dateSelectionFragment;
        this.f42250b = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f42250b | 1);
        DateSelectionFragment.s1(this.f42249a, aVar, g11);
        return nm0.y.f85009a;
    }
}

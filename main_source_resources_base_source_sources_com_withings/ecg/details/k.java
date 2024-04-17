package com.withings.ecg.details;
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
final class k extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f38248a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar) {
        super(1);
        this.f38248a = gVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        int intValue = num.intValue();
        b0 b0Var = this.f38248a.f38210p;
        if (b0Var != null) {
            b0Var.y0(intValue);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}

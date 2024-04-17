package com.withings.ecg.details;
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
final class h extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f38229a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar) {
        super(1);
        this.f38229a = gVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String it = str;
        kotlin.jvm.internal.u.j(it, "it");
        b0 b0Var = this.f38229a.f38210p;
        if (b0Var != null) {
            b0Var.T0().saveNote(it);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}

package com.withings.wiscale2.vo2max.view;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2maxNote.kt */
/* loaded from: classes5.dex */
public final class x1 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y1 f62857a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var) {
        super(1);
        this.f62857a = y1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        a2 a2Var;
        String it = str;
        kotlin.jvm.internal.u.j(it, "it");
        a2Var = this.f62857a.f62882c;
        if (a2Var != null) {
            a2Var.j0(it);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}

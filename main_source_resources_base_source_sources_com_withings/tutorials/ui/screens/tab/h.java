package com.withings.tutorials.ui.screens.tab;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: MeasureTabTutorial.kt */
/* loaded from: classes4.dex */
final class h extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p f46278a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f46279b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f46280c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, ym0.a<y> aVar, r8.n nVar) {
        super(0);
        this.f46278a = pVar;
        this.f46279b = aVar;
        this.f46280c = nVar;
    }

    @Override // ym0.a
    public final y invoke() {
        p pVar = this.f46278a;
        y yVar = null;
        if (pVar.c() != null) {
            androidx.navigation.e.L(this.f46280c, pVar.c(), null, 6);
            yVar = y.f85009a;
        }
        if (yVar == null) {
            this.f46279b.invoke();
        }
        return y.f85009a;
    }
}

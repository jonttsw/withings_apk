package com.withings.tutorials.ui.screens.tab;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: AchieveTabTutorial.kt */
/* loaded from: classes4.dex */
final class b extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p f46252a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f46253b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f46254c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, ym0.a<y> aVar, r8.n nVar) {
        super(0);
        this.f46252a = pVar;
        this.f46253b = aVar;
        this.f46254c = nVar;
    }

    @Override // ym0.a
    public final y invoke() {
        String c11 = this.f46252a.c();
        y yVar = null;
        if (c11 != null) {
            androidx.navigation.e.L(this.f46254c, c11, null, 6);
            yVar = y.f85009a;
        }
        if (yVar == null) {
            this.f46253b.invoke();
        }
        return y.f85009a;
    }
}

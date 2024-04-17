package com.withings.tutorials.ui.screens.modes.athlete;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: AthleteModeActivity.kt */
/* loaded from: classes4.dex */
final class k extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AthleteModeActivity f45601a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f45602b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AthleteModeActivity athleteModeActivity, r8.n nVar) {
        super(2);
        this.f45601a = athleteModeActivity;
        this.f45602b = nVar;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            AthleteModeActivity athleteModeActivity = this.f45601a;
            e.j.a(0, 1, aVar2, new h(athleteModeActivity), false);
            a.f45543a.f(AthleteModeActivity.z3(athleteModeActivity), this.f45602b, new i(athleteModeActivity), new j(athleteModeActivity), AthleteModeActivity.z3(athleteModeActivity).k0(), aVar2, 196680);
        }
        return y.f85009a;
    }
}

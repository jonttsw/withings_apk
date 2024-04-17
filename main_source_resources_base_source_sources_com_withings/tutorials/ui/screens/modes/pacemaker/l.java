package com.withings.tutorials.ui.screens.modes.pacemaker;

import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: PacemakerModeActivity.kt */
/* loaded from: classes4.dex */
final class l extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PacemakerModeActivity f45770a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f45771b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(PacemakerModeActivity pacemakerModeActivity, r8.n nVar) {
        super(2);
        this.f45770a = pacemakerModeActivity;
        this.f45771b = nVar;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            PacemakerModeActivity pacemakerModeActivity = this.f45770a;
            e.j.a(0, 1, aVar2, new i(pacemakerModeActivity), false);
            c.f45714a.f(PacemakerModeActivity.z3(pacemakerModeActivity), this.f45771b, new j(pacemakerModeActivity), new k(pacemakerModeActivity), PacemakerModeActivity.z3(pacemakerModeActivity).k0(), aVar2, 196680);
        }
        return y.f85009a;
    }
}

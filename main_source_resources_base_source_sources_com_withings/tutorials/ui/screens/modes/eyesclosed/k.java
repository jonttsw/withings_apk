package com.withings.tutorials.ui.screens.modes.eyesclosed;

import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: EyesClosedModeActivity.kt */
/* loaded from: classes4.dex */
final class k extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EyesClosedModeActivity f45686a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f45687b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(EyesClosedModeActivity eyesClosedModeActivity, r8.n nVar) {
        super(2);
        this.f45686a = eyesClosedModeActivity;
        this.f45687b = nVar;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            EyesClosedModeActivity eyesClosedModeActivity = this.f45686a;
            e.j.a(0, 1, aVar2, new h(eyesClosedModeActivity), false);
            b.f45630a.f(EyesClosedModeActivity.z3(eyesClosedModeActivity), this.f45687b, new i(eyesClosedModeActivity), new j(eyesClosedModeActivity), EyesClosedModeActivity.z3(eyesClosedModeActivity).k0(), aVar2, 196680);
        }
        return y.f85009a;
    }
}

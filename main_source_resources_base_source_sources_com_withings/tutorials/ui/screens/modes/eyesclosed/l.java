package com.withings.tutorials.ui.screens.modes.eyesclosed;

import androidx.navigation.c0;
import androidx.navigation.compose.r;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: EyesClosedModeActivity.kt */
/* loaded from: classes4.dex */
final class l extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EyesClosedModeActivity f45688a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(EyesClosedModeActivity eyesClosedModeActivity) {
        super(2);
        this.f45688a = eyesClosedModeActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = r.c(new c0[0], aVar2);
            int i11 = e.m.f64583b;
            EyesClosedModeActivity eyesClosedModeActivity = this.f45688a;
            androidx.compose.runtime.j.a(e.m.b(eyesClosedModeActivity), s1.b.b(aVar2, -1347787650, new k(eyesClosedModeActivity, c11)), aVar2, 56);
        }
        return y.f85009a;
    }
}

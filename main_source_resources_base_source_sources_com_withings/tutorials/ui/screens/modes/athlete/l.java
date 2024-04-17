package com.withings.tutorials.ui.screens.modes.athlete;

import androidx.navigation.c0;
import androidx.navigation.compose.r;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: AthleteModeActivity.kt */
/* loaded from: classes4.dex */
final class l extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AthleteModeActivity f45603a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AthleteModeActivity athleteModeActivity) {
        super(2);
        this.f45603a = athleteModeActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = r.c(new c0[0], aVar2);
            int i11 = e.m.f64583b;
            AthleteModeActivity athleteModeActivity = this.f45603a;
            androidx.compose.runtime.j.a(e.m.b(athleteModeActivity), s1.b.b(aVar2, -1930358647, new k(athleteModeActivity, c11)), aVar2, 56);
        }
        return y.f85009a;
    }
}

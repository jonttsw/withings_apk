package com.withings.programs.ui.activity;

import androidx.navigation.c0;
import androidx.navigation.compose.r;
import b70.p0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.n;
import ym0.p;
/* compiled from: TutorialProxyActivity.kt */
/* loaded from: classes4.dex */
final class j extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TutorialProxyActivity f43768a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TutorialProxyActivity tutorialProxyActivity) {
        super(2);
        this.f43768a = tutorialProxyActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        n nVar;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            n c11 = r.c(new c0[0], aVar2);
            TutorialProxyActivity tutorialProxyActivity = this.f43768a;
            tutorialProxyActivity.f43755e = c11;
            p0 p0Var = p0.f20617a;
            nVar = tutorialProxyActivity.f43755e;
            if (nVar != null) {
                p0Var.a(TutorialProxyActivity.A3(tutorialProxyActivity), nVar, new h(tutorialProxyActivity), new i(tutorialProxyActivity), aVar2, 72);
            } else {
                u.s("navController");
                throw null;
            }
        }
        return y.f85009a;
    }
}

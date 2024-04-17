package com.withings.tutorials.ui.screens.tab;

import androidx.navigation.c0;
import androidx.navigation.compose.r;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: TabPresentationActivity.kt */
/* loaded from: classes4.dex */
final class l extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TabPresentationActivity f46285a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TabPresentationActivity tabPresentationActivity) {
        super(2);
        this.f46285a = tabPresentationActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        ym0.a<y> aVar2;
        ym0.a<y> aVar3;
        androidx.compose.runtime.a aVar4 = aVar;
        if ((num.intValue() & 11) == 2 && aVar4.h()) {
            aVar4.C();
        } else {
            r8.n c11 = r.c(new c0[0], aVar4);
            TabPresentationActivity tabPresentationActivity = this.f46285a;
            tabPresentationActivity.getClass();
            u.j(c11, "<set-?>");
            tabPresentationActivity.f46246f = c11;
            int ordinal = TabPresentationActivity.A3(tabPresentationActivity).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    aVar4.s(1977426041);
                    aVar4.J();
                } else {
                    aVar4.s(1977425855);
                    MeasureTabTutorial measureTabTutorial = MeasureTabTutorial.f46231a;
                    r8.n nVar = tabPresentationActivity.f46246f;
                    if (nVar != null) {
                        aVar3 = tabPresentationActivity.f46247g;
                        measureTabTutorial.a(nVar, aVar3, new k(tabPresentationActivity), aVar4, 3080);
                        aVar4.J();
                    } else {
                        u.s("navController");
                        throw null;
                    }
                }
            } else {
                aVar4.s(1977425627);
                AchieveTabTutorial achieveTabTutorial = AchieveTabTutorial.f46214a;
                r8.n nVar2 = tabPresentationActivity.f46246f;
                if (nVar2 != null) {
                    aVar2 = tabPresentationActivity.f46247g;
                    achieveTabTutorial.a(nVar2, aVar2, new j(tabPresentationActivity), aVar4, 3080);
                    aVar4.J();
                } else {
                    u.s("navController");
                    throw null;
                }
            }
        }
        return y.f85009a;
    }
}

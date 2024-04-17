package com.withings.healthscore.ui.exploredata;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.StateFlow;
import nm0.y;
import ym0.p;
/* compiled from: HealthScoreExploreDataActivity.kt */
/* loaded from: classes3.dex */
final class e extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthScoreExploreDataActivity f40570a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(HealthScoreExploreDataActivity healthScoreExploreDataActivity) {
        super(2);
        this.f40570a = healthScoreExploreDataActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        StateFlow stateFlow;
        HealthScoreExploreDataViewModel B3;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            HealthScoreExploreDataActivity healthScoreExploreDataActivity = this.f40570a;
            stateFlow = healthScoreExploreDataActivity.f40517g;
            if (stateFlow != null) {
                c cVar = new c(healthScoreExploreDataActivity);
                B3 = healthScoreExploreDataActivity.B3();
                ks.p.c((ws.b) h6.b.c(stateFlow, aVar2).getValue(), cVar, new d(B3), null, aVar2, 8, 8);
            } else {
                u.s("exploreDataScreenUIStateFlow");
                throw null;
            }
        }
        return y.f85009a;
    }
}

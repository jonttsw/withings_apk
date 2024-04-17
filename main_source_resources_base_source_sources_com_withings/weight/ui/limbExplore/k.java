package com.withings.weight.ui.limbExplore;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import com.withings.weight.core.model.LimbModel;
import com.withings.weight.ui.limbExplore.SegmentalLimbExploreActivity;
/* compiled from: FragmentActivity.kt */
/* loaded from: classes4.dex */
public final class k implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalLimbExploreActivity f47693a;

    public k(SegmentalLimbExploreActivity segmentalLimbExploreActivity) {
        this.f47693a = segmentalLimbExploreActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        SegmentalLimbExploreActivity segmentalLimbExploreActivity = this.f47693a;
        b0 b0Var = segmentalLimbExploreActivity.f47649i;
        if (b0Var != null) {
            return b0Var.a(SegmentalLimbExploreActivity.C3(segmentalLimbExploreActivity), (LimbModel) SegmentalLimbExploreActivity.g.a.f47662a.get(SegmentalLimbExploreActivity.A3(segmentalLimbExploreActivity)), SegmentalLimbExploreActivity.z3(segmentalLimbExploreActivity), SegmentalLimbExploreActivity.B3(segmentalLimbExploreActivity));
        }
        kotlin.jvm.internal.u.s("viewModelFactory");
        throw null;
    }
}

package com.withings.healthplus.explore.ui.activity;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class z extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40343a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ExploreTabActivity exploreTabActivity) {
        super(0);
        this.f40343a = exploreTabActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        r8.n nVar = this.f40343a.f40243f;
        if (nVar != null) {
            androidx.navigation.e.P(nVar, NavigationArguments.ProgramDetailDestination.route, false);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("navController");
        throw null;
    }
}

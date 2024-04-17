package com.withings.healthplus.explore.ui.activity;

import com.withings.healthplus.explore.ui.activity.ExploreTabActivity;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class c0 extends kotlin.jvm.internal.w implements ym0.p<Integer, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40300a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity.a.AbstractC0526a.c f40301b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ExploreTabActivity exploreTabActivity, ExploreTabActivity.a.AbstractC0526a.c cVar) {
        super(2);
        this.f40300a = exploreTabActivity;
        this.f40301b = cVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(Integer num, Integer num2) {
        boolean z5;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        ExploreTabActivity exploreTabActivity = this.f40300a;
        r8.n nVar = exploreTabActivity.f40243f;
        if (nVar != null) {
            NavigationArguments.ProgramDetailDestination programDetailDestination = NavigationArguments.ProgramDetailDestination.INSTANCE;
            long c11 = this.f40301b.c();
            if (intValue2 > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            nVar.J(programDetailDestination.navigateToContentScreenRoute(intValue, c11, z5, ExploreTabActivity.D3(exploreTabActivity).b()), b0.f40298a);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("navController");
        throw null;
    }
}

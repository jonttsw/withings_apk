package com.withings.healthplus.explore.ui.activity;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class j0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40322a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ExploreTabActivity exploreTabActivity) {
        super(2);
        this.f40322a = exploreTabActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            ExploreTabActivity exploreTabActivity = this.f40322a;
            r8.n nVar = exploreTabActivity.f40243f;
            if (nVar != null) {
                String a11 = ExploreTabActivity.D3(exploreTabActivity).a();
                i0 i0Var = new i0(exploreTabActivity);
                androidx.navigation.compose.s.b(nVar, a11, null, null, null, n.f40330a, o.f40331a, p.f40333a, q.f40334a, i0Var, aVar2, 115015688, 28);
            } else {
                kotlin.jvm.internal.u.s("navController");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}

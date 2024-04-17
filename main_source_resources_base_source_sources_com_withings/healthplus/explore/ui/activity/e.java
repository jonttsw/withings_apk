package com.withings.healthplus.explore.ui.activity;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class e extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.c, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Long f40307a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Long l5) {
        super(1);
        this.f40307a = l5;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.navigation.c cVar) {
        androidx.navigation.c navArgument = cVar;
        kotlin.jvm.internal.u.j(navArgument, "$this$navArgument");
        navArgument.d(r8.o.f94574e);
        Long l5 = this.f40307a;
        if (l5 != null) {
            navArgument.b(Long.valueOf(l5.longValue()));
        }
        return nm0.y.f85009a;
    }
}

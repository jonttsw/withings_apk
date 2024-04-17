package com.withings.healthplus.explore.ui.activity;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class h extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.c, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Boolean f40313a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Boolean bool) {
        super(1);
        this.f40313a = bool;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.navigation.c cVar) {
        androidx.navigation.c navArgument = cVar;
        kotlin.jvm.internal.u.j(navArgument, "$this$navArgument");
        navArgument.d(r8.o.f94578i);
        Boolean bool = this.f40313a;
        if (bool != null) {
            navArgument.b(bool);
        }
        return nm0.y.f85009a;
    }
}

package com.withings.healthplus.explore.ui.activity;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class g extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.c, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Integer f40311a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Integer num) {
        super(1);
        this.f40311a = num;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.navigation.c cVar) {
        androidx.navigation.c navArgument = cVar;
        kotlin.jvm.internal.u.j(navArgument, "$this$navArgument");
        navArgument.d(r8.o.f94571b);
        Integer num = this.f40311a;
        if (num != null) {
            navArgument.b(Integer.valueOf(num.intValue()));
        }
        return nm0.y.f85009a;
    }
}

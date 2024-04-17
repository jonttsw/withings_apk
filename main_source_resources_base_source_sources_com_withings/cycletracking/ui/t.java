package com.withings.cycletracking.ui;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class t extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.c, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35749a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(CycleTrackingActivity cycleTrackingActivity) {
        super(1);
        this.f35749a = cycleTrackingActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.navigation.c cVar) {
        long userId;
        androidx.navigation.c navArgument = cVar;
        kotlin.jvm.internal.u.j(navArgument, "$this$navArgument");
        navArgument.d(r8.o.f94574e);
        userId = this.f35749a.getUserId();
        navArgument.b(Long.valueOf(userId));
        return nm0.y.f85009a;
    }
}

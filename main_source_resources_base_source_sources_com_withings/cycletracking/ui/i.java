package com.withings.cycletracking.ui;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class i extends kotlin.jvm.internal.w implements ym0.l<androidx.navigation.c, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35592a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CycleTrackingActivity cycleTrackingActivity) {
        super(1);
        this.f35592a = cycleTrackingActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(androidx.navigation.c cVar) {
        androidx.navigation.c navArgument = cVar;
        kotlin.jvm.internal.u.j(navArgument, "$this$navArgument");
        navArgument.d(r8.o.f94571b);
        navArgument.b(Integer.valueOf(CycleTrackingActivity.z3(this.f35592a)));
        return nm0.y.f85009a;
    }
}

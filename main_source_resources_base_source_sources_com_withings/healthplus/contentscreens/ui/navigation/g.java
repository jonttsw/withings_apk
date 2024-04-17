package com.withings.healthplus.contentscreens.ui.navigation;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: ContentScreenNavigation.kt */
/* loaded from: classes3.dex */
final class g extends w implements ym0.l<androidx.navigation.c, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f40151a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j5) {
        super(1);
        this.f40151a = j5;
    }

    @Override // ym0.l
    public final y invoke(androidx.navigation.c cVar) {
        androidx.navigation.c navArgument = cVar;
        u.j(navArgument, "$this$navArgument");
        navArgument.b(Long.valueOf(this.f40151a));
        navArgument.d(r8.o.f94574e);
        return y.f85009a;
    }
}

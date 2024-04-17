package com.withings.healthplus.library.ui.navigation;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.o;
import ym0.l;
/* compiled from: LibraryNavigation.kt */
/* loaded from: classes3.dex */
final class c extends w implements l<androidx.navigation.c, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f40413a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j5) {
        super(1);
        this.f40413a = j5;
    }

    @Override // ym0.l
    public final y invoke(androidx.navigation.c cVar) {
        androidx.navigation.c navArgument = cVar;
        u.j(navArgument, "$this$navArgument");
        navArgument.d(o.f94574e);
        navArgument.b(Long.valueOf(this.f40413a));
        return y.f85009a;
    }
}

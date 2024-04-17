package com.withings.healthplus.library.ui.navigation;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: LibraryNavigation.kt */
/* loaded from: classes3.dex */
final class f extends w implements l<androidx.navigation.c, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f40416a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str) {
        super(1);
        this.f40416a = str;
    }

    @Override // ym0.l
    public final y invoke(androidx.navigation.c cVar) {
        androidx.navigation.c navArgument = cVar;
        u.j(navArgument, "$this$navArgument");
        String str = this.f40416a;
        if (str != null) {
            navArgument.b(str);
        }
        navArgument.c(true);
        return y.f85009a;
    }
}

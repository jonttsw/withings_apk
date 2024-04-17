package com.withings.healthplus.contentscreens.ui.navigation;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: ContentScreenNavigation.kt */
/* loaded from: classes3.dex */
final class k extends w implements ym0.l<androidx.navigation.c, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f40155a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(1);
        this.f40155a = str;
    }

    @Override // ym0.l
    public final y invoke(androidx.navigation.c cVar) {
        androidx.navigation.c navArgument = cVar;
        u.j(navArgument, "$this$navArgument");
        String str = this.f40155a;
        if (str != null) {
            navArgument.b(str);
        }
        navArgument.c(true);
        return y.f85009a;
    }
}

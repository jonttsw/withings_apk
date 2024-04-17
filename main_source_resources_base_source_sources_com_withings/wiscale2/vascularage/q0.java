package com.withings.wiscale2.vascularage;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
/* compiled from: VascularAgeScreen.kt */
/* loaded from: classes5.dex */
final class q0 extends kotlin.jvm.internal.w implements ym0.l<Context, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e40.d f62438a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(e40.d dVar) {
        super(1);
        this.f62438a = dVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Context context) {
        Context context2 = context;
        kotlin.jvm.internal.u.j(context2, "context");
        context2.startActivity(HMWebActivity.f35395c.c(context2, null, f40.a.e(this.f62438a.a(), context2)));
        return nm0.y.f85009a;
    }
}

package com.withings.authentication;

import android.content.Context;
import android.content.Intent;
import com.withings.partner.model.Partner;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class q0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32329a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f32330b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(AuthenticationActivity authenticationActivity, Context context) {
        super(0);
        this.f32329a = authenticationActivity;
        this.f32330b = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.activity.result.b bVar;
        AuthenticationActivity authenticationActivity = this.f32329a;
        ch.d dVar = authenticationActivity.f31295h;
        if (dVar != null) {
            Intent b10 = ch.g.b(dVar.a(), this.f32330b, Partner.f43457o.l(), false, 12);
            bVar = authenticationActivity.f31308u;
            bVar.a(b10);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}

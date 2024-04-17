package com.withings.authentication;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
final class r0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f32334a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Context context) {
        super(0);
        this.f32334a = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = this.f32334a;
        String string = context.getString(C1987R.string._2FA_helpCenter_article_android);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        context.startActivity(HMWebActivity.a.a(aVar, context, "url", null, string, 16));
        return nm0.y.f85009a;
    }
}

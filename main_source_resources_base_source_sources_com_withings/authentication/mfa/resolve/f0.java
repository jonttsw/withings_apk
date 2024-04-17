package com.withings.authentication.mfa.resolve;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
/* compiled from: MfaResolveScreen.kt */
/* loaded from: classes3.dex */
final class f0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f32065a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f32066b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, String str) {
        super(0);
        this.f32065a = context;
        this.f32066b = str;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = this.f32065a;
        context.startActivity(HMWebActivity.a.a(aVar, context, "url", null, this.f32066b, 16));
        return nm0.y.f85009a;
    }
}

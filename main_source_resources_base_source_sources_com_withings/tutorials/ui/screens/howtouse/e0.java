package com.withings.tutorials.ui.screens.howtouse;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
/* compiled from: HowToUseWBS13.kt */
/* loaded from: classes4.dex */
final class e0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f45409a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f45410b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context, String str) {
        super(0);
        this.f45409a = context;
        this.f45410b = str;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = this.f45409a;
        context.startActivity(aVar.c(context, null, this.f45410b));
        return nm0.y.f85009a;
    }
}

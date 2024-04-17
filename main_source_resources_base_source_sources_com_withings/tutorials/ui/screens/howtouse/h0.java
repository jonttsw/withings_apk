package com.withings.tutorials.ui.screens.howtouse;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
/* compiled from: HowToUseWBS14.kt */
/* loaded from: classes4.dex */
final class h0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f45433a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f45434b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, String str) {
        super(0);
        this.f45433a = context;
        this.f45434b = str;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = this.f45433a;
        context.startActivity(aVar.c(context, null, this.f45434b));
        return nm0.y.f85009a;
    }
}

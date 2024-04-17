package com.withings.tutorials.ui.screens;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import nm0.y;
/* compiled from: MultipleUsers.kt */
/* loaded from: classes4.dex */
final class e extends kotlin.jvm.internal.w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f45076a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f45077b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, String str) {
        super(0);
        this.f45076a = context;
        this.f45077b = str;
    }

    @Override // ym0.a
    public final y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = this.f45076a;
        context.startActivity(aVar.c(context, null, this.f45077b));
        return y.f85009a;
    }
}

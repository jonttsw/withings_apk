package com.withings.fever.ui;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
final class z extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f39485a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Context context) {
        super(0);
        this.f39485a = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = this.f39485a;
        String string = context.getString(C1987R.string._TM_SETTINGS_INFO_FEVER_URL_);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        context.startActivity(aVar.c(context, null, string));
        return nm0.y.f85009a;
    }
}

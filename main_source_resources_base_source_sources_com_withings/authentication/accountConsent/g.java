package com.withings.authentication.accountConsent;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: DataProtection.kt */
/* loaded from: classes3.dex */
final class g extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f31438a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(0);
        this.f31438a = context;
    }

    @Override // ym0.a
    public final y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = this.f31438a;
        String string = context.getString(C1987R.string.signup_TC_privacy_read);
        String string2 = context.getString(C1987R.string.signup_TC_privacy_read_url);
        u.i(string2, "getString(...)");
        context.startActivity(aVar.c(context, string, string2));
        return y.f85009a;
    }
}

package com.withings.authentication.accountConsent;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: DataProtection.kt */
/* loaded from: classes3.dex */
final class h extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f31439a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(0);
        this.f31439a = context;
    }

    @Override // ym0.a
    public final y invoke() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Integer valueOf = Integer.valueOf((int) C1987R.string.signup_TC_terms_read);
        Context context = this.f31439a;
        context.startActivity(aVar.b(context, valueOf, C1987R.string.signup_TC_terms_read_url));
        return y.f85009a;
    }
}

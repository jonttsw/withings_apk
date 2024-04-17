package com.withings.authentication.userCreation;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
import nm0.y;
/* compiled from: UserInfoNavigation.kt */
/* loaded from: classes3.dex */
final class o extends kotlin.jvm.internal.w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f32594a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(0);
        this.f32594a = context;
    }

    @Override // ym0.a
    public final y invoke() {
        v70.a.e("more_info_height_weight", "more_info_height_weight", null, false, 12);
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = this.f32594a;
        String string = context.getString(C1987R.string.rgpd_HeightWeightRationalLink);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        context.startActivity(aVar.c(context, null, string));
        return y.f85009a;
    }
}

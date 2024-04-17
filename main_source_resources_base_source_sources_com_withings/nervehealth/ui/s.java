package com.withings.nervehealth.ui;

import android.content.Context;
import android.content.Intent;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.nervehealth.ui.guidedscan.NerveHealthGuidedScanActivity;
/* compiled from: NerveHealthActivity.kt */
/* loaded from: classes4.dex */
final class s extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthActivity f42770a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f42771b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(NerveHealthActivity nerveHealthActivity, Context context) {
        super(0);
        this.f42770a = nerveHealthActivity;
        this.f42771b = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.activity.result.b bVar;
        NerveHealthActivity nerveHealthActivity = this.f42770a;
        bVar = nerveHealthActivity.f42369r;
        int i11 = NerveHealthGuidedScanActivity.f42524f;
        long H3 = NerveHealthActivity.H3(nerveHealthActivity);
        Context context = this.f42771b;
        Intent putExtra = com.withings.authentication.n.a(context, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, context, NerveHealthGuidedScanActivity.class).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, H3);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        bVar.a(putExtra);
        return nm0.y.f85009a;
    }
}

package com.withings.weight.presentation.ui;

import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
/* compiled from: BodyCompositionActivity.kt */
/* loaded from: classes4.dex */
final class q extends kotlin.jvm.internal.w implements ym0.l<Long, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BodyCompositionActivity f47282a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(BodyCompositionActivity bodyCompositionActivity) {
        super(1);
        this.f47282a = bodyCompositionActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Long l5) {
        long longValue = l5.longValue();
        BodyCompositionActivity bodyCompositionActivity = this.f47282a;
        ch.d dVar = bodyCompositionActivity.f47118f;
        if (dVar != null) {
            a3.b b10 = dVar.b();
            long q11 = BodyCompositionActivity.z3(bodyCompositionActivity).q();
            b10.getClass();
            Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(bodyCompositionActivity.getPackageName(), "com.withings.weight.ui.SegmentalBodyCompositionActivity").putExtra("measure_group_id", longValue).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, q11);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            bodyCompositionActivity.startActivity(putExtra);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}

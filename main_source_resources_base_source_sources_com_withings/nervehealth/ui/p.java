package com.withings.nervehealth.ui;

import android.content.Context;
import android.content.Intent;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.nervehealth.core.model.MeasureCategory;
import com.withings.nervehealth.ui.NerveHealthMeasureListActivity;
/* compiled from: NerveHealthActivity.kt */
/* loaded from: classes4.dex */
final class p extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthActivity f42757a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f42758b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(NerveHealthActivity nerveHealthActivity, Context context) {
        super(0);
        this.f42757a = nerveHealthActivity;
        this.f42758b = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        NerveHealthMeasureListActivity.a aVar = NerveHealthMeasureListActivity.f42384n;
        NerveHealthActivity nerveHealthActivity = this.f42757a;
        MeasureCategory category = NerveHealthActivity.A3(nerveHealthActivity);
        long H3 = NerveHealthActivity.H3(nerveHealthActivity);
        aVar.getClass();
        Context context = this.f42758b;
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(category, "category");
        Intent putExtra = new Intent(context, NerveHealthMeasureListActivity.class).putExtra("measure_category", category).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, H3);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        nerveHealthActivity.startActivity(putExtra);
        return nm0.y.f85009a;
    }
}

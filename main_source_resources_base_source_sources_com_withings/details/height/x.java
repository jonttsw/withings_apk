package com.withings.details.height;

import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.Serializable;
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
final class x extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeightListActivity f36647a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(HeightListActivity heightListActivity) {
        super(0);
        this.f36647a = heightListActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        HeightListActivity heightListActivity = this.f36647a;
        Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(heightListActivity.getPackageName(), "com.withings.wiscale2.measure.accountmeasure.ui.add.AddMeasureActivity").putExtra("EXTRA_MEASURE_TYPE", 4).putExtra("EXTRA_FROM_DETAIL_VIEW", false).putExtra("GO_BACK_TIMELINE", false).putExtra("EXTRA_USER", HeightListActivity.I3(heightListActivity).q()).putExtra("EXTRA_INPUT_VALUE", (Serializable) null);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        heightListActivity.startActivity(putExtra);
        return nm0.y.f85009a;
    }
}

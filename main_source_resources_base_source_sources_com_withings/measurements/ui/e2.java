package com.withings.measurements.ui;

import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
/* compiled from: MeasurementsFragment.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class e2 extends kotlin.jvm.internal.s implements ym0.l<kw.d, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e2(i2 i2Var) {
        super(1, i2Var, i2.class, "onHealthInsightClicked", "onHealthInsightClicked(Lcom/withings/itemmetric/insight/HealthInsightUi;)V", 0);
    }

    @Override // ym0.l
    public final nm0.y invoke(kw.d dVar) {
        kw.d p02 = dVar;
        kotlin.jvm.internal.u.j(p02, "p0");
        i2 i2Var = (i2) this.receiver;
        int i11 = i2.f42049k;
        i2Var.getClass();
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setData(Uri.parse(p02.a()));
        i2Var.startActivity(intent);
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.settings;

import android.content.Intent;
import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnitsActivity.kt */
/* loaded from: classes5.dex */
public final class b6 extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UnitsActivity f59888a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(UnitsActivity unitsActivity) {
        super(1);
        this.f59888a = unitsActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        Bundle bundle;
        Bundle bundle2;
        int intValue = num.intValue();
        UnitsActivity unitsActivity = this.f59888a;
        UnitsActivity.E3(unitsActivity).k0(intValue);
        bundle = unitsActivity.f59804l;
        bundle.putBoolean("EXTRA_WEIGHT_UPDATED", true);
        Intent intent = new Intent();
        bundle2 = unitsActivity.f59804l;
        unitsActivity.setResult(300, intent.putExtras(bundle2));
        return nm0.y.f85009a;
    }
}

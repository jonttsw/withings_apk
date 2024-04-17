package com.withings.wiscale2.settings;

import android.content.Intent;
import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnitsActivity.kt */
/* loaded from: classes5.dex */
public final class c6 extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UnitsActivity f59946a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(UnitsActivity unitsActivity) {
        super(1);
        this.f59946a = unitsActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        Bundle bundle;
        Bundle bundle2;
        int intValue = num.intValue();
        UnitsActivity unitsActivity = this.f59946a;
        UnitsActivity.E3(unitsActivity).i0(intValue);
        bundle = unitsActivity.f59804l;
        bundle.putBoolean("EXTRA_HEIGHT_UPDATED", true);
        Intent intent = new Intent();
        bundle2 = unitsActivity.f59804l;
        unitsActivity.setResult(300, intent.putExtras(bundle2));
        return nm0.y.f85009a;
    }
}

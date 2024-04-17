package com.withings.wiscale2.settings;

import android.content.Intent;
import android.os.Bundle;
import com.withings.views.view.ToggleCellView;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnitsActivity.kt */
/* loaded from: classes5.dex */
public final class f6 extends kotlin.jvm.internal.w implements ym0.p<ToggleCellView, Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UnitsActivity f60005a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(UnitsActivity unitsActivity) {
        super(2);
        this.f60005a = unitsActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(ToggleCellView toggleCellView, Boolean bool) {
        Bundle bundle;
        Bundle bundle2;
        boolean booleanValue = bool.booleanValue();
        kotlin.jvm.internal.u.j(toggleCellView, "<anonymous parameter 0>");
        UnitsActivity unitsActivity = this.f60005a;
        UnitsActivityViewModel E3 = UnitsActivity.E3(unitsActivity);
        E3.getClass();
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(E3), null, null, new g6(E3, booleanValue, null), 3, null);
        bundle = unitsActivity.f59804l;
        bundle.putBoolean("EXTRA_BODY_COMPOSITION_UPDATED", true);
        Intent intent = new Intent();
        bundle2 = unitsActivity.f59804l;
        unitsActivity.setResult(300, intent.putExtras(bundle2));
        return nm0.y.f85009a;
    }
}

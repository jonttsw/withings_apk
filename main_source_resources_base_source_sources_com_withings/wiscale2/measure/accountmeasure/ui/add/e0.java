package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.measure.accountmeasure.ui.add.AddMeasureActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class e0 extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddMeasureActivity.f f58161a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(AddMeasureActivity.f fVar) {
        super(0);
        this.f58161a = fVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        AddMeasureActivity.f fVar = this.f58161a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = fVar.f58116b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_FROM_DETAIL_VIEW");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_FROM_DETAIL_VIEW");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_FROM_DETAIL_VIEW of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}

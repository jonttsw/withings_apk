package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.measure.accountmeasure.ui.add.AddMeasureActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddMeasureActivity.e f58156a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(AddMeasureActivity.e eVar) {
        super(0);
        this.f58156a = eVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        AddMeasureActivity.e eVar = this.f58156a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = eVar.f58114b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "GO_BACK_TIMELINE");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "GO_BACK_TIMELINE");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra GO_BACK_TIMELINE of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}

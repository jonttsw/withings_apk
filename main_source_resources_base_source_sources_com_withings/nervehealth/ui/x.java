package com.withings.nervehealth.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.nervehealth.core.model.MeasureCategory;
import com.withings.nervehealth.ui.NerveHealthActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class x extends kotlin.jvm.internal.w implements ym0.a<MeasureCategory> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthActivity.g f42815a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(NerveHealthActivity.g gVar) {
        super(0);
        this.f42815a = gVar;
    }

    @Override // ym0.a
    public final MeasureCategory invoke() {
        NerveHealthActivity.g gVar = this.f42815a;
        gVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(MeasureCategory.class);
        Activity activity = gVar.f42380b;
        if (isAssignableFrom) {
            return (MeasureCategory) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "measure_category");
        }
        if (Serializable.class.isAssignableFrom(MeasureCategory.class)) {
            return (MeasureCategory) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "measure_category");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra measure_category of class ", kotlin.jvm.internal.q0.b(MeasureCategory.class), " is not supported"));
    }
}

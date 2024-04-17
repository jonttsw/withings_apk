package com.withings.weight.ui.limbExplore;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.periodsbar.Period;
import com.withings.weight.ui.limbExplore.SegmentalLimbExploreActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.a<Period> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalLimbExploreActivity.f f47692a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SegmentalLimbExploreActivity.f fVar) {
        super(0);
        this.f47692a = fVar;
    }

    @Override // ym0.a
    public final Period invoke() {
        SegmentalLimbExploreActivity.f fVar = this.f47692a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Period.class);
        Activity activity = fVar.f47660b;
        if (isAssignableFrom) {
            return (Period) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "period");
        }
        if (Serializable.class.isAssignableFrom(Period.class)) {
            return (Period) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "period");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra period of class ", q0.b(Period.class), " is not supported"));
    }
}

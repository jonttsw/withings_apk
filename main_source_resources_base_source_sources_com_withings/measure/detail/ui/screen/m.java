package com.withings.measure.detail.ui.screen;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.measure.detail.ui.screen.MeasureDetailActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.w implements ym0.a<MeasureDetailScreen<Double>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasureDetailActivity.h f41770a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(MeasureDetailActivity.h hVar) {
        super(0);
        this.f41770a = hVar;
    }

    @Override // ym0.a
    public final MeasureDetailScreen<Double> invoke() {
        MeasureDetailActivity.h hVar = this.f41770a;
        hVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(MeasureDetailScreen.class);
        Activity activity = hVar.f41755b;
        if (isAssignableFrom) {
            return (MeasureDetailScreen) b0.F(activity, "EXTRA_SCREEN");
        }
        if (Serializable.class.isAssignableFrom(MeasureDetailScreen.class)) {
            return (MeasureDetailScreen) b0.H(activity, "EXTRA_SCREEN");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_SCREEN of class ", q0.b(MeasureDetailScreen.class), " is not supported"));
    }
}

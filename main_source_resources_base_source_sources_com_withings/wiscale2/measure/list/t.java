package com.withings.wiscale2.measure.list;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.measure.list.MeasureListActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.w implements ym0.a<int[]> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasureListActivity.h f58580a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(MeasureListActivity.h hVar) {
        super(0);
        this.f58580a = hVar;
    }

    @Override // ym0.a
    public final int[] invoke() {
        MeasureListActivity.h hVar = this.f58580a;
        hVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(int[].class);
        Activity activity = hVar.f58512b;
        if (isAssignableFrom) {
            return (int[]) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_MEASURES_TYPES");
        }
        if (Serializable.class.isAssignableFrom(int[].class)) {
            return (int[]) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_MEASURES_TYPES");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_MEASURES_TYPES of class ", q0.b(int[].class), " is not supported"));
    }
}

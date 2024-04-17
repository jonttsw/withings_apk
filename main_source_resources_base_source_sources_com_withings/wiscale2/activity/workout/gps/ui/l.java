package com.withings.wiscale2.activity.workout.gps.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.activity.workout.gps.ui.RequestLocationPermissionAndSettingsActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class l extends w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RequestLocationPermissionAndSettingsActivity.e f48784a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(RequestLocationPermissionAndSettingsActivity.e eVar) {
        super(0);
        this.f48784a = eVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        RequestLocationPermissionAndSettingsActivity.e eVar = this.f48784a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = eVar.f48772b;
        if (isAssignableFrom) {
            return (Boolean) b0.F(activity, "EXTRA_ASK_BACKGROUND");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) b0.H(activity, "EXTRA_ASK_BACKGROUND");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_ASK_BACKGROUND of class ", q0.b(Boolean.class), " is not supported"));
    }
}

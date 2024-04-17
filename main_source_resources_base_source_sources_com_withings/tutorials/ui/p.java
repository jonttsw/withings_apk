package com.withings.tutorials.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.tutorials.ui.DeviceIntroductionActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceIntroductionActivity.c f44775a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(DeviceIntroductionActivity.c cVar) {
        super(0);
        this.f44775a = cVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        DeviceIntroductionActivity.c cVar = this.f44775a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = cVar.f44602b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_ENABLE_BUTTON");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_ENABLE_BUTTON");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_ENABLE_BUTTON of class ", q0.b(Boolean.class), " is not supported"));
    }
}

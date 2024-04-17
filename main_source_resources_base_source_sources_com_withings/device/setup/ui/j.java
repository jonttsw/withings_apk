package com.withings.device.setup.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.setup.ui.SetupChooseDeviceActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class j extends w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetupChooseDeviceActivity.d f37545a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SetupChooseDeviceActivity.d dVar) {
        super(0);
        this.f37545a = dVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        SetupChooseDeviceActivity.d dVar = this.f37545a;
        dVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = dVar.f37490b;
        if (isAssignableFrom) {
            return (Boolean) b0.F(activity, "extra_account_creation");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) b0.H(activity, "extra_account_creation");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_account_creation of class ", q0.b(Boolean.class), " is not supported"));
    }
}

package com.withings.wiscale2.device.wpm.wpm04.ui;

import android.app.Activity;
import android.os.Bundle;
import androidx.camera.core.v;
import androidx.lifecycle.k1;
import bf0.e;
import bf0.f;
import bn0.d;
import com.withings.android.activity.WithingsActivity;
import com.withings.device.Device;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
/* compiled from: Wpm04PostInstallActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm04/ui/Wpm04PostInstallActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm04PostInstallActivity extends WithingsActivity {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f55887b = {v.c(Wpm04PostInstallActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final a f55888a = new a(this);

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class a implements d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final g f55889a = h.b(new b(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f55890b;

        public a(Activity activity) {
            this.f55890b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f55889a.getValue();
        }
    }

    public static final Device z3(Wpm04PostInstallActivity wpm04PostInstallActivity) {
        return (Device) wpm04PostInstallActivity.f55888a.getValue(wpm04PostInstallActivity, f55887b[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xw.d.d(this, ((f) new k1(this, new e(this)).a(f.class)).f0(), new com.withings.wiscale2.device.wpm.wpm04.ui.a(this));
    }
}

package com.withings.wiscale2.device.common.ui;

import android.os.Bundle;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: MyDeviceActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/MyDeviceActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MyDeviceActivity extends Hilt_MyDeviceActivity {
    public MyDeviceActivity() {
        super(0);
    }

    @Override // com.withings.wiscale2.device.common.ui.Hilt_MyDeviceActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        androidx.fragment.app.m0 m11 = getSupportFragmentManager().m();
        m11.b(new com.withings.wiscale2.mydevices.q(), C1987R.id.fragment_container);
        m11.f();
    }
}

package com.withings.devicesetup.network.ui;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.withings.features.FeatureFlag;
import com.withings.nutrisync.ui.VitaminCDatavizActivity;
import com.withings.wiscale2.device.common.handcalibration.HandsCalibrationActivity;
import com.withings.wiscale2.profile.q;
import com.withings.wiscale2.sleep.ui.sleepscore.k0;
import kotlin.jvm.internal.u;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements androidx.activity.result.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f37777a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f37778b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f37777a = i11;
        this.f37778b = obj;
    }

    @Override // androidx.activity.result.a
    public final void a(Object obj) {
        int i11 = this.f37777a;
        Object obj2 = this.f37778b;
        switch (i11) {
            case 0:
                PickWifiForSetupActivity pickWifiForSetupActivity = (PickWifiForSetupActivity) obj2;
                ActivityResult activityResult = (ActivityResult) obj;
                int i12 = PickWifiForSetupActivity.f37724j;
                pickWifiForSetupActivity.getClass();
                int b10 = activityResult.b();
                Intent a11 = activityResult.a();
                if (b10 == -1) {
                    if (wr.b.c(FeatureFlag.f39140y)) {
                        a11.putExtra("wifiApConnect", a11.getSerializableExtra("wifiApConnect"));
                        a11.putExtra("ipSettings", a11.getSerializableExtra("ipSettings"));
                    } else {
                        a11.putExtra("wifiApConnect", a11.getSerializableExtra("wifiApConnect"));
                        a11.putExtra("ipSettings", a11.getSerializableExtra("ipSettings"));
                    }
                    pickWifiForSetupActivity.setResult(-1, a11);
                    pickWifiForSetupActivity.finish();
                    return;
                }
                b bVar = (b) pickWifiForSetupActivity.getSupportFragmentManager().Y("fragment");
                if (bVar != null) {
                    bVar.w1();
                    return;
                }
                return;
            case 1:
                WifiSetupActivityV2.A3((WifiSetupActivityV2) obj2, (ActivityResult) obj);
                return;
            case 2:
                VitaminCDatavizActivity this$0 = (VitaminCDatavizActivity) obj2;
                int i13 = VitaminCDatavizActivity.f43204j;
                u.j(this$0, "this$0");
                if (((ActivityResult) obj).b() == -1) {
                    this$0.finish();
                    return;
                }
                return;
            case 3:
                HandsCalibrationActivity this$02 = (HandsCalibrationActivity) obj2;
                int i14 = HandsCalibrationActivity.f52667f;
                u.j(this$02, "this$0");
                if (((ActivityResult) obj).b() != -1) {
                    x70.b.l(this$02, "Hands calibration cancelled because we can't use the bluetooth properly (Permission and localisation are not satisfied)", new Object[0]);
                    this$02.finish();
                    return;
                }
                return;
            case 4:
                ActivityResult activityResult2 = (ActivityResult) obj;
                q.u1((q) obj2);
                return;
            default:
                k0.s1((k0) obj2, (ActivityResult) obj);
                return;
        }
    }
}

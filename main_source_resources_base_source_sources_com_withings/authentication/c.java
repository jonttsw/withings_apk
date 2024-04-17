package com.withings.authentication;

import androidx.activity.result.ActivityResult;
import com.withings.details.height.HeightActivity;
import com.withings.devicesetup.network.ui.PickWifiForSetupActivity;
import com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.Wpa02ToiletInstallationActivity;
import com.withings.wiscale2.device.wpm.ui.Wpm0203StartMeasureActivity;
import com.withings.wiscale2.notification.NotificationPermissionActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements androidx.activity.result.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f31448a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f31449b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f31448a = i11;
        this.f31449b = obj;
    }

    @Override // androidx.activity.result.a
    public final void a(Object obj) {
        int i11 = this.f31448a;
        Object obj2 = this.f31449b;
        switch (i11) {
            case 0:
                AuthenticationActivity.z3((AuthenticationActivity) obj2, (ActivityResult) obj);
                return;
            case 1:
                HeightActivity.A3((HeightActivity) obj2, (ActivityResult) obj);
                return;
            case 2:
                PickWifiForSetupActivity.A3((PickWifiForSetupActivity) obj2, (Boolean) obj);
                return;
            case 3:
                Wpa02ToiletInstallationActivity.A3((Wpa02ToiletInstallationActivity) obj2, (ActivityResult) obj);
                return;
            case 4:
                Wpm0203StartMeasureActivity wpm0203StartMeasureActivity = (Wpm0203StartMeasureActivity) obj2;
                int i12 = Wpm0203StartMeasureActivity.f55678b;
                wpm0203StartMeasureActivity.getClass();
                if (((ActivityResult) obj).b() != -1) {
                    x70.b.r(wpm0203StartMeasureActivity, "Activity finished because user refused to enable bluetooth", new Object[0]);
                    wpm0203StartMeasureActivity.finish();
                    return;
                }
                return;
            case 5:
                ActivityResult activityResult = (ActivityResult) obj;
                NotificationPermissionActivity.A3((NotificationPermissionActivity) obj2);
                return;
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                com.withings.wiscale2.sleep.ui.sleepscore.k0.v1((com.withings.wiscale2.sleep.ui.sleepscore.k0) obj2);
                return;
        }
    }
}

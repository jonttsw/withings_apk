package com.withings.authentication.verifyauthentication;

import androidx.activity.result.ActivityResult;
import com.withings.common.device.companion.DeviceCompanionLinkProvider;
import com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.Wpa02CartridgeActivationActivity;
import com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements androidx.activity.result.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32694a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f32695b;

    public /* synthetic */ q(Object obj, int i11) {
        this.f32694a = i11;
        this.f32695b = obj;
    }

    @Override // androidx.activity.result.a
    public final void a(Object obj) {
        int i11 = this.f32694a;
        Object obj2 = this.f32695b;
        switch (i11) {
            case 0:
                VerifyAuthenticationActivity.z3((VerifyAuthenticationActivity) obj2, (ActivityResult) obj);
                return;
            case 1:
                DeviceCompanionLinkProvider.a((DeviceCompanionLinkProvider) obj2, (ActivityResult) obj);
                return;
            case 2:
                Wpa02CartridgeActivationActivity.z3((Wpa02CartridgeActivationActivity) obj2, (ActivityResult) obj);
                return;
            default:
                BloodPressureMeasureListActivity.z3((BloodPressureMeasureListActivity) obj2, (ActivityResult) obj);
                return;
        }
    }
}

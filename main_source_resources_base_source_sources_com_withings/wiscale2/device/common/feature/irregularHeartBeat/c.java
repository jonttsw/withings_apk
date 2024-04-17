package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import android.content.Intent;
import com.withings.common.device.DeviceSettingsActivity;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.irregularHeartBeat.IrregularHeartBeatSettingsActivity;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: IrregularHeartBeatActivationActivity.kt */
/* loaded from: classes5.dex */
final class c extends w implements ym0.l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IrregularHeartBeatActivationActivity f52356a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(IrregularHeartBeatActivationActivity irregularHeartBeatActivationActivity) {
        super(1);
        this.f52356a = irregularHeartBeatActivationActivity;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        androidx.navigation.e navController;
        boolean booleanValue = bool.booleanValue();
        IrregularHeartBeatActivationActivity irregularHeartBeatActivationActivity = this.f52356a;
        navController = irregularHeartBeatActivationActivity.getNavController();
        androidx.navigation.t y11 = navController.y();
        if (y11 != null && y11.r() == C1987R.id.irregular_heartbeat_alerts) {
            if (booleanValue) {
                int i11 = IrregularHeartBeatSettingsActivity.f52345i;
                Intent a11 = IrregularHeartBeatSettingsActivity.a.a(irregularHeartBeatActivationActivity, IrregularHeartBeatActivationActivity.B3(irregularHeartBeatActivationActivity));
                DeviceSettingsActivity.c cVar = DeviceSettingsActivity.f35012e;
                Device B3 = IrregularHeartBeatActivationActivity.B3(irregularHeartBeatActivationActivity);
                cVar.getClass();
                irregularHeartBeatActivationActivity.startActivity(DeviceSettingsActivity.c.c(irregularHeartBeatActivationActivity, B3, a11));
            }
            irregularHeartBeatActivationActivity.finish();
        }
        return y.f85009a;
    }
}

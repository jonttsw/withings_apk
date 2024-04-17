package com.withings.ecg.details;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.withings.core.device.FullScreenVideoActivity;
import com.withings.device.Device;
import com.withings.ecg.instruction.EcgInstructionScreenActivity;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.wiscale2.C1987R;
/* compiled from: EcgResultActivity.kt */
/* loaded from: classes3.dex */
final class j2 extends kotlin.jvm.internal.w implements ym0.l<HeartSignalMeasurement, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgResultActivity f38247a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(EcgResultActivity ecgResultActivity) {
        super(1);
        this.f38247a = ecgResultActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(HeartSignalMeasurement heartSignalMeasurement) {
        final HeartSignalMeasurement heartSignalMeasurement2 = heartSignalMeasurement;
        final EcgResultActivity ecgResultActivity = this.f38247a;
        EcgResultActivity.A3(ecgResultActivity).setOnClickListener(new View.OnClickListener() { // from class: com.withings.ecg.details.i2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11;
                EcgResultActivity this$0 = ecgResultActivity;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                kn.e c11 = kn.e.c();
                Long deviceId = HeartSignalMeasurement.this.getDeviceId();
                kotlin.jvm.internal.u.g(deviceId);
                Device d11 = c11.d(deviceId.longValue());
                if (d11.getType() == 16) {
                    if (d11.getTrackerWearPosition() == 0) {
                        i11 = 2131231316;
                    } else {
                        i11 = 2131231315;
                    }
                    FullScreenVideoActivity.f35312g.getClass();
                    this$0.startActivity(FullScreenVideoActivity.a.a(C1987R.string.hwa09_ecgExplanationTutorial_video_title, C1987R.string.hwa09_ecgExplanationTutorial_video_URL_right, i11, this$0));
                } else {
                    int i12 = EcgInstructionScreenActivity.f38566i;
                    Context context = view.getContext();
                    kotlin.jvm.internal.u.i(context, "getContext(...)");
                    this$0.startActivity(new Intent(context, EcgInstructionScreenActivity.class));
                }
                this$0.finish();
            }
        });
        return nm0.y.f85009a;
    }
}

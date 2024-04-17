package com.withings.alarm.ui;

import android.view.View;
import com.withings.device.details.wsd.programs.spotify.WsdSpotifyActivity;
import com.withings.ecg.fullscreen.FullScreenEcgActivity;
import com.withings.medicalreport.ui.MedicalReportActivity;
import com.withings.wiscale2.activity.workout.live.ui.LiveWorkoutActivity;
import com.withings.wiscale2.activity.workout.ui.detail.PostWorkoutActivity;
import com.withings.wiscale2.device.common.feature.spo2.Spo2ActivationActivity;
import com.withings.wiscale2.heart.heartrate.w;
import com.withings.wiscale2.sleep.ui.edition.NightEditionActivity;
import kotlin.jvm.internal.u;
import nd0.b;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f31152a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f31153b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f31152a = i11;
        this.f31153b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f31152a;
        Object obj = this.f31153b;
        switch (i11) {
            case 0:
                l lVar = (l) obj;
                lVar.f31164b.u0(lVar.f31163a);
                return;
            case 1:
                int i12 = TrackerMultipleAlarmActivity.f31120o;
                ((TrackerMultipleAlarmActivity) obj).B3().U();
                return;
            case 2:
                WsdSpotifyActivity.A3((WsdSpotifyActivity) obj);
                return;
            case 3:
                FullScreenEcgActivity.z3((FullScreenEcgActivity) obj);
                return;
            case 4:
                MedicalReportActivity.z3((MedicalReportActivity) obj);
                return;
            case 5:
                LiveWorkoutActivity.B3((LiveWorkoutActivity) obj);
                return;
            case 6:
                PostWorkoutActivity.z3((PostWorkoutActivity) obj);
                return;
            case 7:
                Spo2ActivationActivity.A3((Spo2ActivationActivity) obj);
                return;
            case 8:
                dd0.a.T1((dd0.a) obj);
                return;
            case 9:
                ld0.b.T1((ld0.b) obj, view);
                return;
            case 10:
                nd0.b this$0 = (nd0.b) obj;
                b.a aVar = nd0.b.B;
                u.j(this$0, "this$0");
                u.g(view);
                this$0.B1(view);
                return;
            case 11:
                w.v1((w) obj, view);
                return;
            case 12:
                og0.i.v1((og0.i) obj);
                return;
            case 13:
                com.withings.wiscale2.partner.ui.h this$02 = (com.withings.wiscale2.partner.ui.h) obj;
                int i13 = com.withings.wiscale2.partner.ui.h.f59093e;
                u.j(this$02, "this$0");
                this$02.requireActivity().finish();
                return;
            default:
                NightEditionActivity.z3(view, (NightEditionActivity) obj);
                return;
        }
    }
}

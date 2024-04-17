package com.withings.webradio.ui;

import android.view.View;
import com.withings.common.device.reporting.InstallStateReporter;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.features.platform.api.PlatformFeatureHelper;
import com.withings.webradio.ui.WebRadioNodeViewHolder;
import com.withings.wiscale2.heart.heartrate.w;
import com.withings.wiscale2.track.data.Track;
import fe0.a;
import kotlin.jvm.internal.u;
import uc0.g;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f46841a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f46842b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f46843c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f46841a = i11;
        this.f46842b = obj;
        this.f46843c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f46841a;
        Object obj = this.f46843c;
        Object obj2 = this.f46842b;
        switch (i11) {
            case 0:
                ((WebRadioNodeViewHolder) obj2).lambda$setListener$0((WebRadioNodeViewHolder.Listener) obj, view);
                return;
            case 1:
                jd0.b.T1((PlatformFeatureHelper.RespiratoryScanState) obj2, (jd0.b) obj, view);
                return;
            case 2:
                fe0.a this$0 = (fe0.a) obj2;
                g wifiConfigData = (g) obj;
                a.C0920a c0920a = fe0.a.f66958v;
                u.j(this$0, "this$0");
                u.j(wifiConfigData, "$wifiConfigData");
                this$0.startActivity(SetupActivity.P3(this$0.getActivity(), wifiConfigData.a(), wifiConfigData.b(), new InstallStateReporter(false)));
                return;
            default:
                w.u1((w) obj2, (Track) obj);
                return;
        }
    }
}

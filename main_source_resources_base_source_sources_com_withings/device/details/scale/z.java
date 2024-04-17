package com.withings.device.details.scale;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.details.scale.ScaleSharingActivity;
import com.withings.device.details.wsd.programs.media.WsdMediaActivity;
import com.withings.device.details.wsd.programs.nap.WsdSleepNapActivity;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.highlowhr.HighLowHRActivationActivity;
import com.withings.wiscale2.heart.heartrate.a1;
import com.withings.zendesk.ui.LabelAdapter;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f37041a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f37042b;

    public /* synthetic */ z(Object obj, int i11) {
        this.f37041a = i11;
        this.f37042b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f37041a;
        Object obj = this.f37042b;
        switch (i11) {
            case 0:
                ScaleSharingActivity this$0 = (ScaleSharingActivity) obj;
                ScaleSharingActivity.a aVar = ScaleSharingActivity.f36893g;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                this$0.setResult(0);
                this$0.finish();
                return;
            case 1:
                WsdMediaActivity.Y3((WsdMediaActivity) obj);
                return;
            case 2:
                WsdSleepNapActivity.X3((WsdSleepNapActivity) obj);
                return;
            case 3:
                io.l.s1((io.l) obj);
                return;
            case 4:
                com.withings.measure.detail.ui.views.d this$02 = (com.withings.measure.detail.ui.views.d) obj;
                int i12 = com.withings.measure.detail.ui.views.d.f41833d;
                kotlin.jvm.internal.u.j(this$02, "this$0");
                Toast.makeText(this$02.itemView.getContext(), "Not implemented", 1).show();
                return;
            case 5:
                HighLowHRActivationActivity.z3((HighLowHRActivationActivity) obj);
                return;
            case 6:
                com.withings.wiscale2.device.common.ui.t.s1((com.withings.wiscale2.device.common.ui.t) obj, view);
                return;
            case 7:
                gd0.a this$03 = (gd0.a) obj;
                int i13 = gd0.a.f68932v;
                kotlin.jvm.internal.u.j(this$03, "this$0");
                Context requireContext = this$03.requireContext();
                kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
                String string = this$03.getString(C1987R.string.hwa08Setting_ecgTutorialUrl);
                kotlin.jvm.internal.u.i(string, "getString(...)");
                String string2 = this$03.getString(C1987R.string.deviceDetailView_ecgGuide);
                kotlin.jvm.internal.u.i(string2, "getString(...)");
                this$03.startActivity(HMWebActivity.f35395c.c(requireContext, string2, string));
                return;
            case 8:
                ld0.b.X1((ld0.b) obj, view);
                return;
            case 9:
                nd0.b.W1((nd0.b) obj, view);
                return;
            case 10:
                com.withings.wiscale2.device.scale.ui.b.s1((com.withings.wiscale2.device.scale.ui.b) obj);
                return;
            case 11:
                ke0.a.T1((ke0.a) obj);
                return;
            case 12:
                com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.i.t1((com.withings.wiscale2.device.wpm.wpm04.tutorial.ui.i) obj);
                return;
            case 13:
                ff0.a.S1((ff0.a) obj, view);
                return;
            case 14:
                a1.s1((a1) obj);
                return;
            default:
                LabelAdapter.onBindViewHolder$lambda$0((LabelAdapter) obj, view);
                return;
        }
    }
}

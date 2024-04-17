package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import androidx.fragment.app.FragmentActivity;
import com.withings.wiscale2.graph.DataPopUpView;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderActivity;
import org.joda.time.DateTime;
/* compiled from: SleepDisorderGraphFragment.kt */
/* loaded from: classes5.dex */
public final class r0 implements DataPopUpView.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0 f61444a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(o0 o0Var) {
        this.f61444a = o0Var;
    }

    @Override // com.withings.wiscale2.graph.DataPopUpView.b
    public final void a(DateTime dateTime) {
        o0 o0Var = this.f61444a;
        FragmentActivity activity = o0Var.getActivity();
        if (activity != null) {
            ((SleepDisorderActivity.b) new androidx.lifecycle.k1(activity).a(SleepDisorderActivity.b.class)).y0(o0.w1(o0Var), dateTime);
        }
    }
}

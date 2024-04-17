package com.withings.ecg.heartsound;

import android.content.DialogInterface;
import com.withings.manualLogging.ui.feature.addNote.cycle.CycleOnBoardingManualLoggingActivity;
import com.withings.wiscale2.MainActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f38423a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f38424b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f38423a = i11;
        this.f38424b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        int i12 = this.f38423a;
        Object obj = this.f38424b;
        switch (i12) {
            case 0:
                d.v1((d) obj);
                return;
            case 1:
                CycleOnBoardingManualLoggingActivity this$0 = (CycleOnBoardingManualLoggingActivity) obj;
                int i13 = CycleOnBoardingManualLoggingActivity.f40791o;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                this$0.finish();
                return;
            case 2:
                MainActivity.D3((MainActivity) obj);
                return;
            default:
                com.withings.wiscale2.account.password.k.s1((com.withings.wiscale2.account.password.k) obj, dialogInterface);
                return;
        }
    }
}

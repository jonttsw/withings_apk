package com.withings.ecg.details;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f38185a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Fragment f38186b;

    public /* synthetic */ f(Fragment fragment, int i11) {
        this.f38185a = i11;
        this.f38186b = fragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        int i12 = this.f38185a;
        Fragment fragment = this.f38186b;
        switch (i12) {
            case 0:
                g.u1((g) fragment);
                return;
            case 1:
                com.withings.ecg.heartsound.d.t1((com.withings.ecg.heartsound.d) fragment);
                return;
            default:
                com.withings.wiscale2.activity.workout.ui.detail.x1.u1((com.withings.wiscale2.activity.workout.ui.detail.x1) fragment);
                return;
        }
    }
}

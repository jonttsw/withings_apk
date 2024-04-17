package com.withings.wiscale2.activity.logging.ui;

import android.widget.SeekBar;
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
public final class r implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48444a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(EditWorkoutActivity editWorkoutActivity) {
        this.f48444a = editWorkoutActivity;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i11, boolean z5) {
        m0 m0Var;
        kotlin.jvm.internal.u.j(seekBar, "seekBar");
        if (z5) {
            m0Var = this.f48444a.Q;
            if (m0Var != null) {
                m0Var.v1(i11);
            } else {
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        kotlin.jvm.internal.u.j(seekBar, "seekBar");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        kotlin.jvm.internal.u.j(seekBar, "seekBar");
    }
}

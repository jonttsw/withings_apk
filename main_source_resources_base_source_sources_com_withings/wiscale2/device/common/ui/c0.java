package com.withings.wiscale2.device.common.ui;

import android.widget.SeekBar;
import tb0.a3;
/* compiled from: DeviceBrightnessFragment.kt */
/* loaded from: classes5.dex */
public final class c0 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a0 f53784a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a3 f53785b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(a0 a0Var, a3 a3Var) {
        this.f53784a = a0Var;
        this.f53785b = a3Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i11, boolean z5) {
        kotlin.jvm.internal.u.j(seekBar, "seekBar");
        a0.v1(this.f53784a, this.f53785b);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        kotlin.jvm.internal.u.j(seekBar, "seekBar");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        kotlin.jvm.internal.u.j(seekBar, "seekBar");
        a0 a0Var = this.f53784a;
        a0Var.f53773f = 0L;
        a0.v1(a0Var, this.f53785b);
    }
}

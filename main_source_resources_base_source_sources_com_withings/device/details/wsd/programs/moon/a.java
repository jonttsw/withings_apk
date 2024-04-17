package com.withings.device.details.wsd.programs.moon;

import android.widget.SeekBar;
import kotlin.jvm.internal.u;
/* compiled from: WsdMoodLightActivity.kt */
/* loaded from: classes3.dex */
public final class a implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WsdMoodLightActivity f37222a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(WsdMoodLightActivity wsdMoodLightActivity) {
        this.f37222a = wsdMoodLightActivity;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i11, boolean z5) {
        u.j(seekBar, "seekBar");
        WsdMoodLightActivity.L3(this.f37222a);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        u.j(seekBar, "seekBar");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        u.j(seekBar, "seekBar");
        WsdMoodLightActivity wsdMoodLightActivity = this.f37222a;
        wsdMoodLightActivity.f37212f = 0L;
        WsdMoodLightActivity.L3(wsdMoodLightActivity);
    }
}

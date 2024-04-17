package com.withings.alarm.ui.picker.linear;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
/* compiled from: LinearAlarmPicker.java */
/* loaded from: classes3.dex */
final class a extends Animation {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f31264a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LinearAlarmPicker f31265b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(LinearAlarmPicker linearAlarmPicker, int i11) {
        this.f31265b = linearAlarmPicker;
        this.f31264a = i11;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f11, Transformation transformation) {
        RelativeLayout.LayoutParams layoutParams;
        int i11;
        LinearAlarmPicker linearAlarmPicker = this.f31265b;
        layoutParams = linearAlarmPicker.f31244j;
        int i12 = this.f31264a;
        i11 = linearAlarmPicker.f31239e;
        layoutParams.topMargin = (int) ((f11 * (i11 - i12)) + i12);
        linearAlarmPicker.f31243i.requestLayout();
    }
}

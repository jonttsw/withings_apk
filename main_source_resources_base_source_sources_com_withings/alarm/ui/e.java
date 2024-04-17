package com.withings.alarm.ui;

import android.view.View;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f31150a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f31151b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f31150a = i11;
        this.f31151b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f31150a;
        Object obj = this.f31151b;
        switch (i11) {
            case 0:
                ((l) obj).l(view);
                return;
            default:
                int i12 = TrackerMultipleAlarmActivity.f31120o;
                ((TrackerMultipleAlarmActivity) obj).B3().U();
                return;
        }
    }
}

package com.withings.wiscale2.heart.heartrate;

import android.content.Context;
/* compiled from: Hilt_HeartRateDayActivity.java */
/* loaded from: classes5.dex */
final class g1 implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_HeartRateDayActivity f57652a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(Hilt_HeartRateDayActivity hilt_HeartRateDayActivity) {
        this.f57652a = hilt_HeartRateDayActivity;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f57652a.inject();
    }
}

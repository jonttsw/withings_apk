package com.withings.wiscale2.device.wpm.ui;

import android.widget.Toast;
import com.withings.wiscale2.C1987R;
/* compiled from: Wpm0203Activity.kt */
/* loaded from: classes5.dex */
final class p extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm0203Activity f55783a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Wpm0203Activity wpm0203Activity) {
        super(0);
        this.f55783a = wpm0203Activity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        Wpm0203Activity wpm0203Activity = this.f55783a;
        Toast.makeText(wpm0203Activity, (int) C1987R.string._LOST_CONNECTION_, 1).show();
        wpm0203Activity.finish();
        return nm0.y.f85009a;
    }
}

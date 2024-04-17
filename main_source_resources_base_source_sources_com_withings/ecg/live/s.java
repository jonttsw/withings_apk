package com.withings.ecg.live;

import androidx.lifecycle.LiveData;
/* compiled from: IsDeviceDisconnectedLiveData.kt */
/* loaded from: classes3.dex */
public final class s extends LiveData<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private lm.a f38707a;

    /* renamed from: b  reason: collision with root package name */
    private r f38708b = new r(this, 0);

    public static void t(s this$0, String it) {
        boolean z5;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(it, "it");
        if (!kotlin.jvm.internal.u.e(it, "connected") && !kotlin.jvm.internal.u.e(it, "conversing") && !kotlin.jvm.internal.u.e(it, "paused")) {
            z5 = true;
        } else {
            z5 = false;
        }
        this$0.setValue(Boolean.valueOf(z5));
    }

    public final void v(lm.a aVar) {
        lm.a aVar2 = this.f38707a;
        r rVar = this.f38708b;
        if (aVar2 != null) {
            aVar2.removeObserver(rVar);
        }
        this.f38707a = aVar;
        aVar.observeForever(rVar);
    }
}

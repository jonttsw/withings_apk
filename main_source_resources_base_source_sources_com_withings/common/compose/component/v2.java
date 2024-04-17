package com.withings.common.compose.component;

import android.view.View;
/* compiled from: Effects.kt */
/* loaded from: classes3.dex */
public final class v2 implements k1.v {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ View f34832a;

    public v2(View view) {
        this.f34832a = view;
    }

    @Override // k1.v
    public final void dispose() {
        this.f34832a.setKeepScreenOn(false);
    }
}

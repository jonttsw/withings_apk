package com.withings.wiscale2.vascularage;

import android.content.Context;
/* compiled from: Hilt_VascularAgeActivityV1.java */
/* loaded from: classes5.dex */
final class f implements f.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Hilt_VascularAgeActivityV1 f62285a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Hilt_VascularAgeActivityV1 hilt_VascularAgeActivityV1) {
        this.f62285a = hilt_VascularAgeActivityV1;
    }

    @Override // f.b
    public final void onContextAvailable(Context context) {
        this.f62285a.inject();
    }
}

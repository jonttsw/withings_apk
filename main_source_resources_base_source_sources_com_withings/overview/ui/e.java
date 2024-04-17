package com.withings.overview.ui;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: StartTrackingActivity.kt */
/* loaded from: classes4.dex */
final class e extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ StartTrackingActivity f43356a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StartTrackingActivity startTrackingActivity) {
        super(0);
        this.f43356a = startTrackingActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f43356a.finish();
        return y.f85009a;
    }
}

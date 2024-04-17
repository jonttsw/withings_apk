package com.withings.weight.ui.limbExplore;

import com.withings.weight.ui.limbExplore.SegmentalLimbExploreActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalLimbExploreActivity.d f47690a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SegmentalLimbExploreActivity.d dVar) {
        super(0);
        this.f47690a = dVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.D(this.f47690a.f47656b, "limb"));
    }
}

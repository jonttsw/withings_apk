package com.withings.wiscale2.device.common.tutorial.media;

import com.withings.wiscale2.device.common.tutorial.media.MediaTutorialActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class i extends w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MediaTutorialActivity.h f53623a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(MediaTutorialActivity.h hVar) {
        super(0);
        this.f53623a = hVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(b0.D(this.f53623a.f53610b, "EXTRA_TUTORIAL_ID"));
    }
}

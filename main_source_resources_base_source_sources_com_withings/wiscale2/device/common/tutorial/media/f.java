package com.withings.wiscale2.device.common.tutorial.media;

import com.withings.wiscale2.device.common.tutorial.media.MediaTutorialActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class f extends w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MediaTutorialActivity.e f53620a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MediaTutorialActivity.e eVar) {
        super(0);
        this.f53620a = eVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(b0.D(this.f53620a.f53604b, "EXTRA_NAVIGATION_GRAPH"));
    }
}

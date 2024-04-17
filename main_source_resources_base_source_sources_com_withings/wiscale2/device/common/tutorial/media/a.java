package com.withings.wiscale2.device.common.tutorial.media;

import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: MediaTutorialActivity.kt */
/* loaded from: classes5.dex */
final class a extends w implements l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MediaTutorialActivity f53615a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MediaTutorialActivity mediaTutorialActivity) {
        super(1);
        this.f53615a = mediaTutorialActivity;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        MediaTutorialActivity.I3(this.f53615a, bool.booleanValue());
        return y.f85009a;
    }
}

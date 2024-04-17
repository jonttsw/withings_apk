package com.withings.wiscale2.device.common.tutorial.media;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import tb0.e0;
import ym0.l;
/* compiled from: MediaTutorialActivity.kt */
/* loaded from: classes5.dex */
final class d extends w implements l<Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MediaTutorialActivity f53618a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MediaTutorialActivity mediaTutorialActivity) {
        super(1);
        this.f53618a = mediaTutorialActivity;
    }

    @Override // ym0.l
    public final y invoke(Integer num) {
        e0 K3;
        Integer num2 = num;
        K3 = this.f53618a.K3();
        u.g(num2);
        K3.f99009c.setText(num2.intValue());
        return y.f85009a;
    }
}

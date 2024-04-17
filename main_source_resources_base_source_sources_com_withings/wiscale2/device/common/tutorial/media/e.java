package com.withings.wiscale2.device.common.tutorial.media;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: MediaTutorialActivity.kt */
/* loaded from: classes5.dex */
final class e extends w implements l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MediaTutorialActivity f53619a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MediaTutorialActivity mediaTutorialActivity) {
        super(1);
        this.f53619a = mediaTutorialActivity;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        Boolean bool2 = bool;
        u.g(bool2);
        if (bool2.booleanValue()) {
            this.f53619a.setResult(-1);
        }
        return y.f85009a;
    }
}

package com.withings.wiscale2.device.common.tutorial;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import tb0.u0;
import ym0.l;
/* compiled from: LegacyTutorialActivity.kt */
/* loaded from: classes5.dex */
final class c extends w implements l<Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LegacyTutorialActivity f53549a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LegacyTutorialActivity legacyTutorialActivity) {
        super(1);
        this.f53549a = legacyTutorialActivity;
    }

    @Override // ym0.l
    public final y invoke(Integer num) {
        u0 M3;
        Integer num2 = num;
        M3 = this.f53549a.M3();
        u.g(num2);
        M3.f99528h.D(num2.intValue(), true);
        return y.f85009a;
    }
}

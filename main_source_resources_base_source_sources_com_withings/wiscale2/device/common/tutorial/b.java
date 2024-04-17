package com.withings.wiscale2.device.common.tutorial;

import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: LegacyTutorialActivity.kt */
/* loaded from: classes5.dex */
final class b extends w implements l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LegacyTutorialActivity f53548a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LegacyTutorialActivity legacyTutorialActivity) {
        super(1);
        this.f53548a = legacyTutorialActivity;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.f53548a.finish();
        }
        return y.f85009a;
    }
}

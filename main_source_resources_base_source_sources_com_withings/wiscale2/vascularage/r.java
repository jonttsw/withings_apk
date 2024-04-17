package com.withings.wiscale2.vascularage;

import com.withings.wiscale2.device.common.feature.vascularage.ui.WBS04VascularAgeTutorialActivity;
/* compiled from: VascularAgeActivityV1.kt */
/* loaded from: classes5.dex */
final class r extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VascularAgeActivityV1 f62439a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(VascularAgeActivityV1 vascularAgeActivityV1) {
        super(1);
        this.f62439a = vascularAgeActivityV1;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        androidx.activity.result.b bVar;
        if (!bool.booleanValue()) {
            VascularAgeActivityV1 vascularAgeActivityV1 = this.f62439a;
            bVar = vascularAgeActivityV1.f62214o;
            int i11 = WBS04VascularAgeTutorialActivity.f52612n;
            bVar.a(WBS04VascularAgeTutorialActivity.a.a(vascularAgeActivityV1, null, null));
        }
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.profile;

import androidx.compose.ui.platform.ComposeView;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class m0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59407a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(q qVar) {
        super(1);
        this.f59407a = qVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        ComposeView composeView;
        int i11;
        boolean booleanValue = bool.booleanValue();
        composeView = this.f59407a.f59435s;
        if (composeView != null) {
            if (booleanValue) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            composeView.setVisibility(i11);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("profileBadgeViewNew");
        throw null;
    }
}

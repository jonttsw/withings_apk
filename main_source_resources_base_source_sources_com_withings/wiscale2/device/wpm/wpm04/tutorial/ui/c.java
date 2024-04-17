package com.withings.wiscale2.device.wpm.wpm04.tutorial.ui;

import com.withings.wiscale2.device.wpm.wpm04.tutorial.ErrorInfo;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wpm04TutorialActivity.kt */
/* loaded from: classes5.dex */
final class c extends w implements ym0.l<ErrorInfo, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm04TutorialActivity f55859a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Wpm04TutorialActivity wpm04TutorialActivity) {
        super(1);
        this.f55859a = wpm04TutorialActivity;
    }

    @Override // ym0.l
    public final y invoke(ErrorInfo errorInfo) {
        ErrorInfo errorInfo2 = errorInfo;
        if (errorInfo2 != null) {
            Wpm04TutorialActivity.B3(this.f55859a, errorInfo2);
        }
        return y.f85009a;
    }
}

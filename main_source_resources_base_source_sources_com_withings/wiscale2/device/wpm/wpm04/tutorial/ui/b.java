package com.withings.wiscale2.device.wpm.wpm04.tutorial.ui;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wpm04TutorialActivity.kt */
/* loaded from: classes5.dex */
final class b extends w implements ym0.l<ProcessingTextInfo, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm04TutorialActivity f55858a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Wpm04TutorialActivity wpm04TutorialActivity) {
        super(1);
        this.f55858a = wpm04TutorialActivity;
    }

    @Override // ym0.l
    public final y invoke(ProcessingTextInfo processingTextInfo) {
        ProcessingTextInfo processingTextInfo2 = processingTextInfo;
        if (processingTextInfo2 != null) {
            Wpm04TutorialActivity.C3(this.f55858a, processingTextInfo2);
        }
        return y.f85009a;
    }
}

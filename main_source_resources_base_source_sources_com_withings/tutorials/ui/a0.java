package com.withings.tutorials.ui;

import android.net.Uri;
/* compiled from: TutorialActivity.kt */
/* loaded from: classes4.dex */
final class a0 extends kotlin.jvm.internal.w implements ym0.l<Uri, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TutorialActivity f44707a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(TutorialActivity tutorialActivity) {
        super(1);
        this.f44707a = tutorialActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Uri uri) {
        TutorialActivity.D3(this.f44707a, uri);
        return nm0.y.f85009a;
    }
}

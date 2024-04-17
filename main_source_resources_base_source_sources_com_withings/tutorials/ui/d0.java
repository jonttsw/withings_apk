package com.withings.tutorials.ui;

import com.withings.tutorials.ui.TutorialActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class d0 extends kotlin.jvm.internal.w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TutorialActivity.d f44719a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(TutorialActivity.d dVar) {
        super(0);
        this.f44719a = dVar;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(com.withings.wiscale2.device.hwa08.postinstall.b0.D(this.f44719a.f44691b, "tutorial_identifier"));
    }
}

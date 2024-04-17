package com.withings.healthplus.completion.program.ui.activity;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: EndProgramActivity.kt */
/* loaded from: classes3.dex */
final class c extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EndProgramActivity f40045a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EndProgramActivity endProgramActivity) {
        super(0);
        this.f40045a = endProgramActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f40045a.finish();
        return y.f85009a;
    }
}

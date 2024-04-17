package com.withings.common.compose.component;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Avatar.kt */
/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ComposeView f33799a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ComposeView composeView) {
        super(0);
        this.f33799a = composeView;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        ViewParent parent = this.f33799a.getParent();
        kotlin.jvm.internal.u.h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).performClick();
        return nm0.y.f85009a;
    }
}

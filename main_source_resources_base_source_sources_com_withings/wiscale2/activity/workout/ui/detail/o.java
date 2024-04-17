package com.withings.wiscale2.activity.workout.ui.detail;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
/* compiled from: AllWorkoutsActivity.kt */
/* loaded from: classes4.dex */
final class o extends kotlin.jvm.internal.w implements ym0.p<com.google.android.material.bottomsheet.l, View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AllWorkoutsActivity f49503a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AllWorkoutsActivity allWorkoutsActivity) {
        super(2);
        this.f49503a = allWorkoutsActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(com.google.android.material.bottomsheet.l lVar, View view) {
        com.google.android.material.bottomsheet.l sheet = lVar;
        View composeView = view;
        kotlin.jvm.internal.u.j(sheet, "sheet");
        kotlin.jvm.internal.u.j(composeView, "composeView");
        ((ComposeView) composeView).setContent(new s1.a(true, -520155686, new n(sheet, this.f49503a)));
        return nm0.y.f85009a;
    }
}

package com.withings.wiscale2.activity.logging.ui;

import android.view.View;
import androidx.appcompat.app.c;
import com.withings.wiscale2.activity.logging.ui.m0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
public final class q extends kotlin.jvm.internal.w implements ym0.l<c.a, View> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48437a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m0.c f48438b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f48439c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(EditWorkoutActivity editWorkoutActivity, m0.c cVar, boolean z5) {
        super(1);
        this.f48437a = editWorkoutActivity;
        this.f48438b = cVar;
        this.f48439c = z5;
    }

    @Override // ym0.l
    public final View invoke(c.a aVar) {
        c.a alertDialogBuilder = aVar;
        kotlin.jvm.internal.u.j(alertDialogBuilder, "alertDialogBuilder");
        return EditWorkoutActivity.n4(this.f48437a, alertDialogBuilder, this.f48438b, this.f48439c);
    }
}

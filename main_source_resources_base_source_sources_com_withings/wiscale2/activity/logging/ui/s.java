package com.withings.wiscale2.activity.logging.ui;

import android.view.View;
import androidx.appcompat.app.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.w implements ym0.l<c.a, View> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48449a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Integer f48450b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(EditWorkoutActivity editWorkoutActivity, Integer num) {
        super(1);
        this.f48449a = editWorkoutActivity;
        this.f48450b = num;
    }

    @Override // ym0.l
    public final View invoke(c.a aVar) {
        c.a alertDialogBuilder = aVar;
        kotlin.jvm.internal.u.j(alertDialogBuilder, "alertDialogBuilder");
        return EditWorkoutActivity.p4(this.f48449a, alertDialogBuilder, this.f48450b);
    }
}

package com.withings.wiscale2.activity.logging.ui;

import android.view.View;
import androidx.appcompat.app.c;
import com.withings.wiscale2.activity.logging.ui.m0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.w implements ym0.l<c.a, View> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48430a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m0.b f48431b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(EditWorkoutActivity editWorkoutActivity, m0.b bVar) {
        super(1);
        this.f48430a = editWorkoutActivity;
        this.f48431b = bVar;
    }

    @Override // ym0.l
    public final View invoke(c.a aVar) {
        c.a builder = aVar;
        kotlin.jvm.internal.u.j(builder, "builder");
        return EditWorkoutActivity.o4(this.f48430a, builder, this.f48431b);
    }
}

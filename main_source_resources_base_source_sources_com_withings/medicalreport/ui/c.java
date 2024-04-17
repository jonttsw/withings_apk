package com.withings.medicalreport.ui;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.withings.common.compose.picker.HealthReportDateValidator;
import k1.o1;
import k1.r0;
import org.joda.time.DateTime;
/* compiled from: DateSelectionFragment.kt */
/* loaded from: classes4.dex */
final class c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DateSelectionFragment f42236a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o1<DateTime> f42237b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DateSelectionFragment dateSelectionFragment, r0 r0Var) {
        super(0);
        this.f42236a = dateSelectionFragment;
        this.f42237b = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        DateSelectionFragment dateSelectionFragment = this.f42236a;
        Context context = dateSelectionFragment.getContext();
        kotlin.jvm.internal.u.h(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        DateTime value = this.f42237b.getValue();
        if (value == null) {
            value = DateTime.now().withTimeAtStartOfDay();
        }
        uk.c.a(supportFragmentManager, 0, value.getMillis(), 0L, 0L, new HealthReportDateValidator(), new b(dateSelectionFragment), 13);
        return nm0.y.f85009a;
    }
}

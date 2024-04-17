package com.withings.medicalreport.ui;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.withings.common.compose.picker.BirthDateValidator;
import k1.o1;
import k1.r0;
import org.joda.time.DateTime;
/* compiled from: DateSelectionFragment.kt */
/* loaded from: classes4.dex */
final class e extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DateSelectionFragment f42241a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o1<DateTime> f42242b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o1<DateTime> f42243c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r0 r0Var, r0 r0Var2, DateSelectionFragment dateSelectionFragment) {
        super(0);
        this.f42241a = dateSelectionFragment;
        this.f42242b = r0Var;
        this.f42243c = r0Var2;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        long millis;
        DateSelectionFragment dateSelectionFragment = this.f42241a;
        Context context = dateSelectionFragment.getContext();
        kotlin.jvm.internal.u.h(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
        kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        o1<DateTime> o1Var = this.f42242b;
        if (o1Var.getValue() != null) {
            DateTime value = o1Var.getValue();
            kotlin.jvm.internal.u.g(value);
            millis = value.getMillis();
        } else {
            o1<DateTime> o1Var2 = this.f42243c;
            if (o1Var2.getValue() != null) {
                DateTime value2 = o1Var2.getValue();
                kotlin.jvm.internal.u.g(value2);
                millis = value2.plusDays(1).getMillis();
            } else {
                millis = DateTime.now().getMillis();
            }
        }
        uk.c.a(supportFragmentManager, 0, millis, 0L, 0L, new BirthDateValidator(), new d(dateSelectionFragment), 13);
        return nm0.y.f85009a;
    }
}

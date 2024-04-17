package com.withings.tutorials.ui.screens.modes.pregnancy;

import com.withings.tutorials.android.modes.pregnancy.survey.DueDateMethod;
import com.withings.wiscale2.C1987R;
import org.joda.time.DateTime;
/* compiled from: PregnancyModeActivity.kt */
/* loaded from: classes4.dex */
final class m0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PregnancyModeActivity f45978a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f45979b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f45980c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.o1<Boolean> f45981d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.o1<Double> f45982e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k1.o1<DateTime> f45983f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ k1.o1<DateTime> f45984g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ k1.o1<DateTime> f45985h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ k1.o1<DueDateMethod> f45986i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ k1.o1<s60.a> f45987j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ k1.o1<String> f45988k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ k1.o1<Boolean> f45989l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(PregnancyModeActivity pregnancyModeActivity, r8.n nVar, String str, k1.r0 r0Var, k1.r0 r0Var2, k1.r0 r0Var3, k1.r0 r0Var4, k1.r0 r0Var5, k1.r0 r0Var6, k1.r0 r0Var7, k1.r0 r0Var8, k1.r0 r0Var9) {
        super(2);
        this.f45978a = pregnancyModeActivity;
        this.f45979b = nVar;
        this.f45980c = str;
        this.f45981d = r0Var;
        this.f45982e = r0Var2;
        this.f45983f = r0Var3;
        this.f45984g = r0Var4;
        this.f45985h = r0Var5;
        this.f45986i = r0Var6;
        this.f45987j = r0Var7;
        this.f45988k = r0Var8;
        this.f45989l = r0Var9;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        int i12;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            PregnancyModeActivity pregnancyModeActivity = this.f45978a;
            e.j.a(0, 1, aVar2, new d0(pregnancyModeActivity), false);
            d dVar = d.f45852a;
            PregnancyModeViewModel z32 = PregnancyModeActivity.z3(pregnancyModeActivity);
            if (n0.a(this.f45981d)) {
                i11 = 627925155;
                i12 = C1987R.string.cycle_tracking_cycleFactor_name;
            } else {
                i11 = 627925222;
                i12 = C1987R.string.pregnancy_mode_survey_title;
            }
            String a11 = bn.d.a(aVar2, i11, i12, aVar2);
            Double value = this.f45982e.getValue();
            DateTime value2 = this.f45983f.getValue();
            DateTime value3 = this.f45984g.getValue();
            DateTime value4 = this.f45985h.getValue();
            DueDateMethod value5 = this.f45986i.getValue();
            k1.o1<s60.a> o1Var = this.f45987j;
            s60.a value6 = o1Var.getValue();
            e0 e0Var = new e0(pregnancyModeActivity);
            f0 f0Var = new f0(pregnancyModeActivity);
            g0 g0Var = new g0(PregnancyModeActivity.z3(pregnancyModeActivity));
            h0 h0Var = new h0(PregnancyModeActivity.z3(pregnancyModeActivity));
            i0 i0Var = new i0(PregnancyModeActivity.z3(pregnancyModeActivity));
            j0 j0Var = new j0(PregnancyModeActivity.z3(pregnancyModeActivity));
            k0 k0Var = new k0(pregnancyModeActivity);
            String value7 = this.f45988k.getValue();
            k1.o1<Boolean> o1Var2 = this.f45989l;
            r8.n nVar = this.f45979b;
            l0 l0Var = new l0(o1Var2, o1Var, nVar, pregnancyModeActivity);
            b0 b0Var = new b0(this.f45979b);
            c0 c0Var = new c0(pregnancyModeActivity, o1Var2);
            int i13 = s60.a.f96637d;
            dVar.g(z32, nVar, a11, value, value2, value3, value4, value5, value6, e0Var, l0Var, f0Var, b0Var, g0Var, h0Var, j0Var, i0Var, k0Var, c0Var, this.f45980c, value7, aVar2, 2392136, 0, 48);
        }
        return nm0.y.f85009a;
    }
}

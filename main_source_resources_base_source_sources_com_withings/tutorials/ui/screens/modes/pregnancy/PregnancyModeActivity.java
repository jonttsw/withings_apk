package com.withings.tutorials.ui.screens.modes.pregnancy;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.k1;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: PregnancyModeActivity.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0015²\u0006\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\f\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u0004\u0018\u00010\r8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000f\u001a\u0004\u0018\u00010\r8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\r8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/tutorials/ui/screens/modes/pregnancy/PregnancyModeActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lm40/a;", "<init>", "()V", "", "featureActivated", "shouldOpenSurveyOnly", "Ls60/a;", "weightFormState", "", "defaultWeight", "weight", "Lorg/joda/time/DateTime;", "dueDate", "conceptionDate", "lastPeriodStartDate", "Lcom/withings/tutorials/android/modes/pregnancy/survey/DueDateMethod;", "dueDateMethod", "", "formattedDueDate", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PregnancyModeActivity extends Hilt_PregnancyModeActivity implements m40.a {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f45779h = 0;

    /* renamed from: e  reason: collision with root package name */
    private final String f45780e = "pregnancy";

    /* renamed from: f  reason: collision with root package name */
    private final androidx.lifecycle.i1 f45781f = new androidx.lifecycle.i1(kotlin.jvm.internal.q0.b(PregnancyModeViewModel.class), new c(this), new b(this), new d(this));

    /* renamed from: g  reason: collision with root package name */
    private androidx.appcompat.app.c f45782g;

    /* compiled from: PregnancyModeActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -1316148617, new n0(PregnancyModeActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45784a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f45784a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f45784a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<androidx.lifecycle.m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45785a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f45785a = componentActivity;
        }

        @Override // ym0.a
        public final androidx.lifecycle.m1 invoke() {
            return this.f45785a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45786a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f45786a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f45786a.getDefaultViewModelCreationExtras();
        }
    }

    public static final void A3(PregnancyModeActivity pregnancyModeActivity, Boolean bool) {
        if (bool != null) {
            pregnancyModeActivity.getClass();
            pregnancyModeActivity.t(bool.booleanValue());
        }
        pregnancyModeActivity.finish();
    }

    public static final void B3(PregnancyModeActivity pregnancyModeActivity) {
        pregnancyModeActivity.getClass();
        qc.b bVar = new qc.b(pregnancyModeActivity);
        bVar.v(pregnancyModeActivity.getString(C1987R.string.program_alreadyJoinedError_title));
        bVar.x(C1987R.string._OK_, null);
        pregnancyModeActivity.f45782g = bVar.s();
    }

    public static final void C3(PregnancyModeActivity pregnancyModeActivity) {
        Object a11;
        pregnancyModeActivity.getClass();
        androidx.lifecycle.i1 i1Var = pregnancyModeActivity.f45781f;
        try {
            ((PregnancyModeViewModel) i1Var.getValue()).G0(false);
            PregnancyModeViewModel pregnancyModeViewModel = (PregnancyModeViewModel) i1Var.getValue();
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(pregnancyModeViewModel), Dispatchers.getIO(), null, new n1(pregnancyModeViewModel, null), 2, null);
            a11 = nm0.y.f85009a;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        Throwable b10 = nm0.k.b(a11);
        if (b10 != null) {
            pregnancyModeActivity.F3(b10);
        }
        pregnancyModeActivity.t(false);
        pregnancyModeActivity.finish();
    }

    public static final void E3(PregnancyModeActivity pregnancyModeActivity, String str, r8.n nVar, Boolean bool, s60.a aVar) {
        Object a11;
        Object a12;
        String e12 = ((PregnancyModeViewModel) pregnancyModeActivity.f45781f.getValue()).e1(str);
        androidx.lifecycle.i1 i1Var = pregnancyModeActivity.f45781f;
        if (e12 == null) {
            if (kotlin.jvm.internal.u.e(str, "weight")) {
                try {
                    ((PregnancyModeViewModel) i1Var.getValue()).K0(pregnancyModeActivity, aVar);
                    a12 = nm0.y.f85009a;
                } catch (Throwable th2) {
                    a12 = nm0.l.a(th2);
                }
                Throwable b10 = nm0.k.b(a12);
                if (b10 != null) {
                    pregnancyModeActivity.F3(b10);
                    return;
                }
                return;
            }
            if (bool != null) {
                pregnancyModeActivity.t(bool.booleanValue());
            }
            pregnancyModeActivity.finish();
            return;
        }
        nVar.J(e12, new o0(e12));
        if (kotlin.jvm.internal.u.e(str, "disabledFeatures") && kotlin.jvm.internal.u.e(bool, Boolean.FALSE)) {
            try {
                ((PregnancyModeViewModel) i1Var.getValue()).K0(pregnancyModeActivity, aVar);
                a11 = nm0.y.f85009a;
            } catch (Throwable th3) {
                a11 = nm0.l.a(th3);
            }
            Throwable b11 = nm0.k.b(a11);
            if (b11 != null) {
                pregnancyModeActivity.F3(b11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F3(Throwable th2) {
        x70.b.n(th2);
        if (!(th2 instanceof PregnancyModeFlowAlreadyCompletedException)) {
            qc.b bVar = new qc.b(this);
            bVar.v(getString(C1987R.string._WTA_GENERIC_ERROR_TITLE_));
            bVar.x(C1987R.string._OK_, new ao.i(this, 3));
            this.f45782g = bVar.s();
        }
    }

    public static final PregnancyModeViewModel z3(PregnancyModeActivity pregnancyModeActivity) {
        return (PregnancyModeViewModel) pregnancyModeActivity.f45781f.getValue();
    }

    @Override // m40.a
    public final String m3() {
        return this.f45780e;
    }

    @Override // com.withings.tutorials.ui.screens.modes.pregnancy.Hilt_PregnancyModeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -465711011, new a()));
    }

    @Override // com.withings.tutorials.ui.screens.modes.pregnancy.Hilt_PregnancyModeActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        androidx.appcompat.app.c cVar = this.f45782g;
        if (cVar != null) {
            cVar.dismiss();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        androidx.appcompat.app.c cVar = this.f45782g;
        if (cVar != null) {
            cVar.dismiss();
        }
        super.onPause();
    }
}

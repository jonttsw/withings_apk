package com.withings.nervehealth.ui.guidedscan;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.core.view.l1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import k1.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: NerveHealthGuidedScanActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/nervehealth/ui/guidedscan/NerveHealthGuidedScanActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "Lcom/withings/nervehealth/ui/guidedscan/p0;", "uiState", "", "showExitConfirmation", "showTimeoutError", "showOfflineError", "nervehealth-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NerveHealthGuidedScanActivity extends Hilt_NerveHealthGuidedScanActivity {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f42524f = 0;

    /* renamed from: e  reason: collision with root package name */
    private final i1 f42525e = new i1(q0.b(NerveHealthGuidedScanViewModel.class), new c(this), new b(this), new d(this));

    /* compiled from: NerveHealthGuidedScanActivity.kt */
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
                NerveHealthGuidedScanActivity nerveHealthGuidedScanActivity = NerveHealthGuidedScanActivity.this;
                r0 b10 = androidx.compose.runtime.l0.b(NerveHealthGuidedScanActivity.z3(nerveHealthGuidedScanActivity).T0(), aVar2);
                r0 b11 = androidx.compose.runtime.l0.b(NerveHealthGuidedScanActivity.z3(nerveHealthGuidedScanActivity).M0(), aVar2);
                r0 b12 = androidx.compose.runtime.l0.b(NerveHealthGuidedScanActivity.z3(nerveHealthGuidedScanActivity).R0(), aVar2);
                r0 b13 = androidx.compose.runtime.l0.b(NerveHealthGuidedScanActivity.z3(nerveHealthGuidedScanActivity).O0(), aVar2);
                e.j.a(0, 1, aVar2, new g(NerveHealthGuidedScanActivity.z3(nerveHealthGuidedScanActivity)), false);
                yk.o.b(false, s1.b.b(aVar2, -190159003, new t(NerveHealthGuidedScanActivity.this, b11, b13, b12, b10)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f42527a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f42527a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f42527a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f42528a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f42528a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f42528a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f42529a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f42529a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f42529a.getDefaultViewModelCreationExtras();
        }
    }

    public static final NerveHealthGuidedScanViewModel z3(NerveHealthGuidedScanActivity nerveHealthGuidedScanActivity) {
        return (NerveHealthGuidedScanViewModel) nerveHealthGuidedScanActivity.f42525e.getValue();
    }

    @Override // com.withings.nervehealth.ui.guidedscan.Hilt_NerveHealthGuidedScanActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new f(this, null), 3, null);
        e.k.a(this, new s1.a(true, 135495999, new a()));
    }
}

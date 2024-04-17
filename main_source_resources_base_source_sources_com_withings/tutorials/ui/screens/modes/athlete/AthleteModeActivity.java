package com.withings.tutorials.ui.screens.modes.athlete;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.core.view.l1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: AthleteModeActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/tutorials/ui/screens/modes/athlete/AthleteModeActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lm40/a;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AthleteModeActivity extends Hilt_AthleteModeActivity implements m40.a {

    /* renamed from: e  reason: collision with root package name */
    private final i1 f45524e = new i1(q0.b(AthleteModeViewModel.class), new c(this), new b(this), new d(this));

    /* renamed from: f  reason: collision with root package name */
    private final String f45525f = "athlete";

    /* compiled from: AthleteModeActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 995195849, new l(AthleteModeActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45527a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f45527a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f45527a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45528a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f45528a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f45528a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45529a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f45529a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f45529a.getDefaultViewModelCreationExtras();
        }
    }

    public static final AthleteModeViewModel z3(AthleteModeActivity athleteModeActivity) {
        return (AthleteModeViewModel) athleteModeActivity.f45524e.getValue();
    }

    @Override // m40.a
    public final String m3() {
        return this.f45525f;
    }

    @Override // com.withings.tutorials.ui.screens.modes.athlete.Hilt_AthleteModeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -782891473, new a()));
    }
}

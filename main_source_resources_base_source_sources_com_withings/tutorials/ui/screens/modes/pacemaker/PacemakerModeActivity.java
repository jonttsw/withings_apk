package com.withings.tutorials.ui.screens.modes.pacemaker;

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
import ym0.p;
/* compiled from: PacemakerModeActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/tutorials/ui/screens/modes/pacemaker/PacemakerModeActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lm40/a;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PacemakerModeActivity extends Hilt_PacemakerModeActivity implements m40.a {

    /* renamed from: e  reason: collision with root package name */
    private final i1 f45696e = new i1(q0.b(PacemakerModeViewModel.class), new c(this), new b(this), new d(this));

    /* renamed from: f  reason: collision with root package name */
    private final String f45697f = "pacemaker";

    /* compiled from: PacemakerModeActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -1441371685, new m(PacemakerModeActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45699a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f45699a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f45699a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45700a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f45700a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f45700a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45701a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f45701a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f45701a.getDefaultViewModelCreationExtras();
        }
    }

    public static final PacemakerModeViewModel z3(PacemakerModeActivity pacemakerModeActivity) {
        return (PacemakerModeViewModel) pacemakerModeActivity.f45696e.getValue();
    }

    @Override // m40.a
    public final String m3() {
        return this.f45697f;
    }

    @Override // com.withings.tutorials.ui.screens.modes.pacemaker.Hilt_PacemakerModeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -590934079, new a()));
    }
}

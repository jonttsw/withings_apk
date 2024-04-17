package com.withings.tutorials.ui.screens.modes.eyesclosed;

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
/* compiled from: EyesClosedModeActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/tutorials/ui/screens/modes/eyesclosed/EyesClosedModeActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lm40/a;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EyesClosedModeActivity extends Hilt_EyesClosedModeActivity implements m40.a {

    /* renamed from: e  reason: collision with root package name */
    private final i1 f45609e = new i1(q0.b(EyesClosedModeViewModel.class), new c(this), new b(this), new d(this));

    /* renamed from: f  reason: collision with root package name */
    private final String f45610f = "eyes_closed";

    /* compiled from: EyesClosedModeActivity.kt */
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
                yk.o.b(false, s1.b.b(aVar2, -236019394, new l(EyesClosedModeActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45612a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f45612a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f45612a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45613a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f45613a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f45613a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f45614a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f45614a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f45614a.getDefaultViewModelCreationExtras();
        }
    }

    public static final EyesClosedModeViewModel z3(EyesClosedModeActivity eyesClosedModeActivity) {
        return (EyesClosedModeViewModel) eyesClosedModeActivity.f45609e.getValue();
    }

    @Override // m40.a
    public final String m3() {
        return this.f45610f;
    }

    @Override // com.withings.tutorials.ui.screens.modes.eyesclosed.Hilt_EyesClosedModeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -861378152, new a()));
    }
}

package com.withings.device.setup.ui.activity;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import np.q0;
import yk.o;
import ym0.p;
/* compiled from: SetupActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/device/setup/ui/activity/SetupActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "Lcom/withings/device/setup/ui/activity/l;", "uiState", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetupActivity extends Hilt_SetupActivity {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f37496h = 0;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public op.e f37497e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public q0 f37498f;

    /* renamed from: g  reason: collision with root package name */
    private final i1 f37499g = new i1(kotlin.jvm.internal.q0.b(SetupViewModel.class), new c(this), new b(this), new d(this));

    /* compiled from: SetupActivity.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37501b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(2);
            this.f37501b = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                o.b(false, s1.b.b(aVar2, -398625200, new j(SetupActivity.this, this.f37501b)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f37502a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f37502a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f37502a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f37503a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f37503a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f37503a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes3.dex */
    public static final class d extends w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f37504a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f37504a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f37504a.getDefaultViewModelCreationExtras();
        }
    }

    @Override // com.withings.device.setup.ui.activity.Hilt_SetupActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, -858664650, new a(getIntent().getIntExtra("deviceModelId", -1))));
    }

    public final SetupViewModel z3() {
        return (SetupViewModel) this.f37499g.getValue();
    }
}

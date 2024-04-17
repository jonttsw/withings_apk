package com.withings.overview.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import yk.o;
import ym0.p;
/* compiled from: StartTrackingActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/overview/ui/StartTrackingActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "Lr10/d0;", "startTrackingUiState", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StartTrackingActivity extends Hilt_StartTrackingActivity {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f43343h = 0;

    /* renamed from: e  reason: collision with root package name */
    private final i1 f43344e = new i1(q0.b(StartTrackingViewModel.class), new c(this), new b(this), new d(this));
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public ch.d f43345f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f43346g;

    /* compiled from: StartTrackingActivity.kt */
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
                o.b(false, s1.b.b(aVar2, 1432531003, new h(StartTrackingActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f43348a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f43348a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f43348a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f43349a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f43349a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f43349a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f43350a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f43350a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f43350a.getDefaultViewModelCreationExtras();
        }
    }

    public StartTrackingActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.overview.ui.b(this, 0));
        u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f43346g = registerForActivityResult;
    }

    public static final StartTrackingViewModel A3(StartTrackingActivity startTrackingActivity) {
        return (StartTrackingViewModel) startTrackingActivity.f43344e.getValue();
    }

    @Override // com.withings.overview.ui.Hilt_StartTrackingActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, 1637917589, new a()));
    }
}

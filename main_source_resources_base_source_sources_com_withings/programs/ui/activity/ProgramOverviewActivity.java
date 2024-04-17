package com.withings.programs.ui.activity;

import android.os.Bundle;
import androidx.core.view.l1;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.n;
import yk.o;
import ym0.p;
/* compiled from: ProgramOverviewActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/programs/ui/activity/ProgramOverviewActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "Landroidx/navigation/d;", "navBackStackEntry", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ProgramOverviewActivity extends Hilt_ProgramOverviewActivity {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public ch.d f43744e;

    /* renamed from: f  reason: collision with root package name */
    private n f43745f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f43746g = nm0.h.b(new d());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f43747h = nm0.h.b(new c());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f43748i = nm0.h.b(new a());

    /* compiled from: ProgramOverviewActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.a<Boolean> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(ProgramOverviewActivity.this.getIntent().getBooleanExtra("EXTRA_AT_LEAST_ONE_ITERATION_FINISHED", false));
        }
    }

    /* compiled from: ProgramOverviewActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                o.b(false, s1.b.b(aVar2, -1538811942, new f(ProgramOverviewActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: ProgramOverviewActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.a<Long> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            return Long.valueOf(ProgramOverviewActivity.this.getIntent().getLongExtra("PROGRAM_ID", -1L));
        }
    }

    /* compiled from: ProgramOverviewActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends w implements ym0.a<Long> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            return Long.valueOf(ProgramOverviewActivity.this.getIntent().getLongExtra(CommonConstant.RETKEY.USERID, -1L));
        }
    }

    public static final long B3(ProgramOverviewActivity programOverviewActivity) {
        return ((Number) programOverviewActivity.f43747h.getValue()).longValue();
    }

    public static final long C3(ProgramOverviewActivity programOverviewActivity) {
        return ((Number) programOverviewActivity.f43746g.getValue()).longValue();
    }

    public static final boolean z3(ProgramOverviewActivity programOverviewActivity) {
        return ((Boolean) programOverviewActivity.f43748i.getValue()).booleanValue();
    }

    @Override // com.withings.programs.ui.activity.Hilt_ProgramOverviewActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 293955264, new b()));
    }
}

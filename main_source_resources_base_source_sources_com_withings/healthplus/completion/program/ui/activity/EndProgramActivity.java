package com.withings.healthplus.completion.program.ui.activity;

import android.os.Bundle;
import androidx.core.view.l1;
import com.samsung.android.sdk.healthdata.HealthConstants;
import e.k;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import nm0.y;
import r8.n;
import yk.o;
import ym0.p;
/* compiled from: EndProgramActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/healthplus/completion/program/ui/activity/EndProgramActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EndProgramActivity extends Hilt_EndProgramActivity {

    /* renamed from: e  reason: collision with root package name */
    private n f40031e;

    /* renamed from: f  reason: collision with root package name */
    private final g f40032f = h.b(new c());

    /* renamed from: g  reason: collision with root package name */
    private final g f40033g = h.b(new a());

    /* renamed from: h  reason: collision with root package name */
    private final g f40034h = h.b(new d());

    /* compiled from: EndProgramActivity.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements ym0.a<String> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            String stringExtra = EndProgramActivity.this.getIntent().getStringExtra(HealthConstants.FoodInfo.DESCRIPTION);
            if (stringExtra == null) {
                return "";
            }
            return stringExtra;
        }
    }

    /* compiled from: EndProgramActivity.kt */
    /* loaded from: classes3.dex */
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
                o.b(false, s1.b.b(aVar2, 1512619341, new com.withings.healthplus.completion.program.ui.activity.d(EndProgramActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: EndProgramActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<Long> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            return Long.valueOf(EndProgramActivity.this.getIntent().getLongExtra("program_id", -1L));
        }
    }

    /* compiled from: EndProgramActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends w implements ym0.a<String> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            String stringExtra = EndProgramActivity.this.getIntent().getStringExtra("title");
            if (stringExtra == null) {
                return "";
            }
            return stringExtra;
        }
    }

    public static final long B3(EndProgramActivity endProgramActivity) {
        return ((Number) endProgramActivity.f40032f.getValue()).longValue();
    }

    public static final String C3(EndProgramActivity endProgramActivity) {
        return (String) endProgramActivity.f40034h.getValue();
    }

    public static final String z3(EndProgramActivity endProgramActivity) {
        return (String) endProgramActivity.f40033g.getValue();
    }

    @Override // com.withings.healthplus.completion.program.ui.activity.Hilt_EndProgramActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        k.a(this, new s1.a(true, 293126823, new b()));
    }
}
